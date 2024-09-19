package de.hans.wif.lectures.test.utils.submission;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.hash.Hashing;
import com.google.common.io.Files;

import de.hans.wif.lectures.test.utils.AbstractSubmissionEnabledBaseTest;
import de.hans.wif.lectures.test.utils.PublicSettings;
import de.hans.wif.lectures.test.utils.submission.model.*;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;

import jakarta.ws.rs.core.Response;
import org.glassfish.jersey.media.multipart.FormDataMultiPart;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.media.multipart.file.FileDataBodyPart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

import java.nio.file.Paths;

import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;

public class SubmissionClient {

    private static final SubmissionClient INSTANCE;

    private static final String MACHINE_HASH;

    private static final List<String> MACHINE_HASH_PARTS;
    private static final Logger LOG = LoggerFactory.getLogger(SubmissionClient.class);


    static {
        MACHINE_HASH_PARTS = Lists.newArrayList(
                "java.version", "java.version.date", "java.specification.version", "java.home", "java.runtime.name", "java.runtime.version",
                "java.vm.vendor", "java.vm.name", "java.vm.version", "java.library.path",
                "os.name", "os.version", "os.arch",
                "user.home", "user.name"
        );

        MACHINE_HASH = getMachineHash();

       INSTANCE = new SubmissionClient();
    }



    private Client client;
    private WebTarget basePath;

    private SubmissionClient() {
        client = ClientBuilder.newBuilder()
                .register(MultiPartFeature.class)
                .build();

        if (PublicSettings.pLearnEnabled()) {
            // create a web target for the base path

           final String apiUrl = PublicSettings.get(PublicSettings.PLEARN_API_URL);

            basePath = client.target(apiUrl);

            // try to log this instance in
            checkLoggedIn();
        }
    }

    protected boolean checkLoggedIn() {
        String sessionToken = PublicSettings.get(PublicSettings.AUTHENTICATION_TOKEN);
        if (null == sessionToken || sessionToken.isEmpty()) {
            login();
            sessionToken = PublicSettings.get(PublicSettings.AUTHENTICATION_TOKEN);
        }

        return null != sessionToken;
    }

    protected void login() {
        if (PublicSettings.pLearnEnabled()) {
            LoginRequestParams loginRequestParams = new LoginRequestParams()

                    .setEmail(PublicSettings.get(PublicSettings.USERNAME))
                    .setPassword(PublicSettings.get(PublicSettings.PASSWORD));



          WebTarget loginTarget = basePath.path("/auth/login");

            LoginResponse response = loginTarget
                    .request(MediaType.APPLICATION_JSON_TYPE)
                    .post(Entity.entity(loginRequestParams, MediaType.APPLICATION_JSON_TYPE), LoginResponse.class);




            if (null == response || null == response.getAccessToken() || response.getAccessToken().isEmpty()) {
                throw new RuntimeException("Could not log into the submission system! Check your preferences!");
            }


            PublicSettings.setAuthenticationToken(response.getAccessToken());
            PublicSettings.setUserEmail(response.getUserEmail());
            LOG.info("Sie sind angemeldet");;
        }
    }
    public void submitAllProjectFiles(SubmissionRequestParams submissionRequestParams, String allProjectFiles) {
        Response response = null;
        SubmissionResponse submissionResponse=null;
        if (checkLoggedIn()) {

            // compute the submission hash code
            File projectZip = null;
            String hashCode = null;
            try {
                 projectZip = Paths.get(allProjectFiles).toFile();
                hashCode = Files.asByteSource(projectZip).hash(Hashing.sha256()).toString();
            } catch (IOException e) {
                hashCode ="";
            }




            submissionRequestParams
                    .setMachineHash(MACHINE_HASH)
                    .setSolutionHash(hashCode)
                    .setEmail(PublicSettings.getUserEmail())
                    .setExerciseId(Integer.parseInt(PublicSettings.get(PublicSettings.EXERCISE_ID)));

            String urlSubmissions ="/api/v1/submissions";


            ObjectMapper objectMapper = new ObjectMapper();

            String submission = null;
            try {
                submission = objectMapper.writeValueAsString(submissionRequestParams);
            } catch (JsonProcessingException e) {
                e.printStackTrace();

                //throw new RuntimeException(e);
            }

            try (FormDataMultiPart formData = new FormDataMultiPart()) {
                // Add the DTO as a JSON part
                formData.field("submission", submission, MediaType.APPLICATION_JSON_TYPE);

                // Add the file part
                formData.bodyPart(new FileDataBodyPart("submissionFile", projectZip, MediaType.APPLICATION_OCTET_STREAM_TYPE));

                /*SubmissionResponse submissionResponse = basePath.path(urlSubmissions)
                        .request(MediaType.APPLICATION_JSON)
                        .header("Authorization", "Bearer " + PublicSettings.getAuthenticationToken())
                        .post(Entity.entity(formData, formData.getMediaType()),  SubmissionResponse.class);*/
                //System.out.println("Einreichung erstellt = "+ submissionResponse.toString());
                //LOG.info("Einreichung erstellt = "+ submissionResponse.toString());;
                response = basePath.path(urlSubmissions)
                        .request(MediaType.APPLICATION_JSON)
                        .header("Authorization", "Bearer " + PublicSettings.getAuthenticationToken())
                        .post(Entity.entity(formData, formData.getMediaType()));

                // Check if the response status is successful (status code 2xx)
                if (response.getStatus() >= 200 && response.getStatus() < 300) {
                    // Map the response body to the expected class
                    submissionResponse = response.readEntity(SubmissionResponse.class);
                    LOG.info("Einreichung erstellt = "+ submissionResponse.toString());;
                } else {
                    // Handle non-successful responses
                    System.err.println("Error: HTTP status " + response.getStatus());
                    String errorResponse = response.readEntity(String.class);  // Capture error message if present
                    System.err.println("Error message: " + errorResponse);
                    LOG.info("Einreichung erstellt = "+ errorResponse);;
                }


            } catch (Exception e) {
                e.printStackTrace();
            }
            finally {
                if (response != null) {
                    response.close();  // Close the response to release resources
                }
            }

        }
        else{
            System.out.println("not logged in....");
            LOG.info("Sie sind nicht angemeldet");

        }
    }

    public void submitResult(SubmissionRequestParams submissionRequestParams, List<File> files) {
        if (checkLoggedIn()) {

            // compute the submission hash code
            String hashCode = files.parallelStream()
                    .map(f -> {
                        try {
                            return Files.asByteSource(f).hash(Hashing.sha256()).toString();
                        } catch (IOException e) {
                            return "";
                        }
                    })
                    .collect(Collectors.joining("-"));
            hashCode = Hashing.sha256().hashString(hashCode, StandardCharsets.UTF_8).toString();


            submissionRequestParams
                    .setMachineHash(MACHINE_HASH)
                    .setSolutionHash(hashCode)
                    .setEmail(PublicSettings.getUserEmail())
                    .setExerciseId(Integer.parseInt(PublicSettings.get(PublicSettings.EXERCISE_ID)));

            String urlSubmissions ="/api/v1/submissions";
            SubmissionResponse response = basePath.path(urlSubmissions)

                    .request(MediaType.APPLICATION_JSON_TYPE)
                    .header("Authorization", "Bearer " + PublicSettings.getAuthenticationToken())
                    .post(Entity.entity(submissionRequestParams, MediaType.APPLICATION_JSON_TYPE), SubmissionResponse.class);



            files.forEach(f -> uploadFile(response.getId(), "submission", f));




        }
        else{
            System.out.println("not logged in....");

        }
    }

    public UploadResponse[] uploadFile(int entryId, String entryModel, File file) {
        if (checkLoggedIn()) {
            FileDataBodyPart fileDataBodyPart = new FileDataBodyPart("files", file);
            FormDataMultiPart formData = (FormDataMultiPart) new FormDataMultiPart()
                    .field("ref", entryModel)
                    .field("refId", entryId + "")
                    .field("field", "data")
                    .bodyPart(fileDataBodyPart);

            UploadResponse[] response = basePath.path("upload")
                    .request()
                    .header("Authorization", "Bearer " + PublicSettings.getAuthenticationToken())
                    .post(Entity.entity(formData, formData.getMediaType()), UploadResponse[].class);

            return response;
        }

        return null;
    }

    public static SubmissionClient getInstance() {
        return INSTANCE;
    }

    protected static String getMachineHash() {
        StringBuilder sbMachineHashInput = new StringBuilder();

        System.getProperties()
                .entrySet().stream()
                .filter(e -> MACHINE_HASH_PARTS.contains(e.getKey()))
                .forEach(e -> sbMachineHashInput.append(e.getKey()).append(": ").append(e.getValue()).append("\n"));

        // get mac addresses of the system
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface ni = networkInterfaces.nextElement();
                byte[] hardwareAddress = ni.getHardwareAddress();
                if (hardwareAddress != null) {
                    String[] hexadecimalFormat = new String[hardwareAddress.length];
                    for (int i = 0; i < hardwareAddress.length; i++) {
                        hexadecimalFormat[i] = String.format("%02X", hardwareAddress[i]);
                    }

                    sbMachineHashInput.append("\n").append(String.join("-", hexadecimalFormat));
                }
            }
        } catch (SocketException e) {
            // there should be no exception since this code is only called when we were able to log
            // into the submission system! but anyway, we will handle it ... by doing nothing! ;-)
        }

        String machineHash = Hashing.sha256().hashString(sbMachineHashInput.toString(), Charsets.UTF_8).toString();
        return machineHash;
    }


}
