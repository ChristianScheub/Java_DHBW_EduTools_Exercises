package de.hans.wif.lectures.test.utils;

import com.google.common.collect.Lists;
import de.hans.wif.lectures.test.utils.submission.SubmissionClient;
import de.hans.wif.lectures.test.utils.submission.model.SubmissionRequestParams;
import lombok.Synchronized;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


public class CodeCampusTestResultExtension implements TestWatcher, AfterAllCallback {

    private static final Logger LOG = LoggerFactory.getLogger(CodeCampusTestResultExtension.class);

    private List<Status> testResultsStatus = new ArrayList<>();
    private List<TestCase> testCases = new ArrayList<>();
    private static SubmissionClient submissionClient;


    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        LOG.info("Test Disabled for test {}: with reason :- {}", context.getDisplayName(), reason.orElse("No reason"));

        testResultsStatus.add(Status.DISABLED);
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        String displayName = context.getDisplayName();
        String id = context.getUniqueId();
        System.out.println("displayName ="+ displayName);
        System.out.println("Id ="+ id);
        TestCase testCase = new TestCase();
        testCase.setId(context.getUniqueId());
        testCase.setName(displayName);
        testCase.setStatus(Status.PASSED);
        testCases.add(testCase);
        LOG.info("Test Successful for test {}: ", context.getDisplayName());
        testResultsStatus.add(Status.PASSED);
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        LOG.info("Test Aborted for test {}: ", context.getDisplayName());

        testResultsStatus.add(Status.ABORTED);
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        LOG.info("Test Failed for test {}: ", context.getDisplayName());

        testResultsStatus.add(Status.FAILED);
        TestCase testCase = new TestCase();
        testCase.setId( context.getUniqueId());
        testCase.setName(context.getDisplayName());

        testCase.setThrowableAsString(cause);
        testCase.setStatus(Status.FAILED.FAILED);
        testCases.add(testCase);
    }

    @Override
    public void afterAll(ExtensionContext extensionContext) throws Exception {
        setupConnection();
        submit(extensionContext, true);
    }






    public static void zipFiles(List<File> files, File zipFile) throws IOException {
        // Ensure the parent directory exists
        if (zipFile.getParentFile() != null) {
            zipFile.getParentFile().mkdirs();
        }

        try (FileOutputStream fos = new FileOutputStream(zipFile);
             ZipOutputStream zos = new ZipOutputStream(fos)) {

            for (File file : files) {
                System.out.println("filename ="+ file.getAbsoluteFile().toString());
                if(file.getName().equals("Main.java")) {
                    //theory, continue
                    continue;
                }
                addToZipFile(file, zos);
            }
        }
    }

    private static void addToZipFile(File file, ZipOutputStream zos) throws IOException {
        try (FileInputStream fis = new FileInputStream(file)) {
            ZipEntry zipEntry = new ZipEntry(file.getName());
            zos.putNextEntry(zipEntry);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) >= 0) {
                zos.write(buffer, 0, length);
            }

            zos.closeEntry();
        }
    }



    public static String generateFileName(String email) {
        // Step 1: Extract the portion before '@' from the email
        String baseName = email.contains("@") ? email.substring(0, email.indexOf('@')) : email;

        // Step 2: Sanitize the base name to remove invalid characters for file names
        baseName = sanitizeFileName(baseName);

        // Step 3: Add the current date and time to the file name
        String dateTime = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        // Step 4: Generate a short UUID and take the first 8 characters
        String shortUUID = UUID.randomUUID().toString().substring(0, 8);

        // Step 5: Combine all components to create the new file name
        String finalFileName = baseName + "_" + dateTime + "_" + shortUUID;

        // Step 6: Sanitize the final file name and return it
        return sanitizeFileName(finalFileName);
    }

    // Utility method to sanitize a string for use as a file name
    private static String sanitizeFileName(String name) {
        // Replace all invalid file name characters (like \ / : * ? " < > |) with an underscore
        return name.replaceAll("[\\\\/:*?\"<>|]", "_");
    }

    private void submit(ExtensionContext description, boolean passed) {
        SubmissionRequestParams params = new SubmissionRequestParams()
                .setSolutionHash(Math.random() + "")
                .setTestPassed(passed)
                .setTestIdentifier(description.getTestClass().toString())
                .setTestDetailIdentifier(description.getTestMethod().toString());


        List<File> files = getFilePaths(description.getTestClass().get());
        List<File> allJavaFiles = getJavaFilesInProject(description.getTestClass().get());
        String fileName = PublicSettings.get(PublicSettings.USERNAME);
        fileName = generateFileName(fileName);


        String userDir = System.getProperty("java.io.tmpdir");
        String pathZipFile = userDir.endsWith(File.separator) ?
                userDir + fileName + ".zip" :
                userDir + File.separator + fileName + ".zip";

        //String pathZipFileAll = userDir  + File.separator + fileName+"_All.zip";
        String pathZipFileAll = userDir.endsWith(File.separator) ?
                userDir + fileName + "_All.zip" :
                userDir + File.separator + fileName + "_All.zip";


        File zipFile = new File(pathZipFile);
        File zipFileAll = new File(pathZipFileAll);
        String parentDirectory = zipFileAll.getParent();
        try {
            //zipFiles(files, zipFile);
            zipFiles(allJavaFiles, zipFileAll);
            //System.out.println("zip file fuer Einreichung: "+ pathZipFile);

            String fileUrl = Path.of(pathZipFile).toUri().toString();
            String parentUrl = Path.of(parentDirectory).toUri().toString();
            String htmlLink = "<a href=\"" + parentUrl + "\">Download Temporary File</a>";
            LOG.info("Verzeichnis der Einreichung: "+ htmlLink);
            LOG.info("Dateiname der Einreichung: "+ zipFileAll);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        submissionClient.submitAllProjectFiles(params, pathZipFileAll);

    }

    public List<File> getJavaFilesInProject(Class<?> testClass) {
        String currentDirPath = System.getProperty("user.dir");
        System.out.println(currentDirPath);
        File currentDirFile = new File(currentDirPath);
        File parentFile = currentDirFile
                .getParentFile()
                .getParentFile();

        //exclude some paths:
        Set<String> excludedPaths = Set.of(                              // Exclude the test directory
                "util/src/test"    // Exclude the resources directory
        );

        List<File> filesInProject = findJavaFiles(parentFile.toPath());
        return filesInProject;
    }

    private static boolean isExcluded(Path path, Path rootDir, Set<String> excludedPaths) {
        // Get the relative path of the file to the root directory
        Path relativePath = rootDir.relativize(path);

        // Check if any of the excluded paths match the start of the relative path
        for (String excludedPath : excludedPaths) {
            if (relativePath.startsWith(excludedPath)) {
                return true;
            }
        }
        return false;
    }

    public static List<File> findJavaFiles(Path rootDir) {
        //exclude some paths:
        Set<String> excludedPaths = Set.of(                              // Exclude the test directory
                "util/src/test"    // Exclude the resources directory
        );
        try (Stream<Path> pathStream = Files.walk(rootDir, FileVisitOption.FOLLOW_LINKS)) {
            return pathStream
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".java"))
                    .filter(path -> !path.getFileName().toString().contains("Test"))
                    .filter(path -> !isExcluded(path, rootDir, excludedPaths))
                    .map(Path::toFile) // Convert Path to File
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return List.of();
        }

    }

    private List<File> getFilePaths(Class<?> testClass) {
        String path = System.getProperty("user.dir") + File.separator + "src";

        String pathTarget = System.getProperty("user.dir") + File.separator + "target";
        String pathBin = System.getProperty("user.dir") + File.separator + "build";
        if(Files.exists(Path.of(pathTarget))){
            //System.out.println("target is hier");
        }
        if(Files.exists(Path.of(pathBin))){
            //System.out.println("bin is hier");
        }


        File baseFolder = new File(path);
        List<File> files2Process = Lists.newArrayList();
        List<File> files = Lists.newArrayList();

        if (baseFolder.exists()) {
            files2Process.addAll(Arrays.asList(baseFolder.listFiles()));

            while (!files2Process.isEmpty()) {
                files2Process.parallelStream()
                        .filter(File::isFile)
                        .forEach(files::add);

                files2Process = files2Process.parallelStream()
                        .filter(File::isDirectory)
                        .map(File::listFiles)
                        .filter(c -> null != c && c.length > 0)
                        .map(Arrays::asList)
                        .flatMap(Collection::stream)
                        .collect(Collectors.toList());
            }
        }

        return files;
    }







@Synchronized
public void setupConnection() {
    if (null == submissionClient) {
        System.out.println("set up connection....");
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        PublicSettings.initialize(classLoader);

        submissionClient = SubmissionClient.getInstance();

    }
}




}



