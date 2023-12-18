package de.hans.wif.lectures.test.utils.submission;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.hash.Hashing;
import com.google.common.io.Files;

import de.hans.wif.lectures.test.utils.PublicSettings;
import de.hans.wif.lectures.test.utils.submission.model.*;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import org.glassfish.jersey.media.multipart.FormDataMultiPart;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.media.multipart.file.FileDataBodyPart;

import java.io.File;
import java.io.IOException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;

public class SubmissionClient {

    private static final SubmissionClient INSTANCE;

    private static final String MACHINE_HASH;

    private static final List<String> MACHINE_HASH_PARTS;

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
                    .setIdentifier(PublicSettings.get(PublicSettings.USERNAME))
                    .setPassword(PublicSettings.get(PublicSettings.PASSWORD));

            WebTarget loginTarget = basePath.path("auth/local");
            LoginResponse response = loginTarget
                    .request(MediaType.APPLICATION_JSON_TYPE)
                    .post(Entity.entity(loginRequestParams, MediaType.APPLICATION_JSON_TYPE), LoginResponse.class);

            if (null == response || null == response.getJwt() || response.getJwt().isEmpty()) {
                throw new RuntimeException("Could not log into the submission system! Check your preferences!");
            }

            PublicSettings.setAuthenticationToken(response.getJwt());
            PublicSettings.setUserId(response.getUser().getId());
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
                    .setUser(PublicSettings.getUserId())
                    .setCourse(Integer.parseInt(PublicSettings.get(PublicSettings.COURSE_ID)));

            // upload submission reqcord
            SubmissionResponse response = basePath.path("submissions")
                    .request(MediaType.APPLICATION_JSON_TYPE)
                    .header("Authorization", "Bearer " + PublicSettings.getAuthenticationToken())
                    .post(Entity.entity(submissionRequestParams, MediaType.APPLICATION_JSON_TYPE), SubmissionResponse.class);

            // now upload files
            files.forEach(f -> uploadFile(response.getId(), "submission", f));
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
