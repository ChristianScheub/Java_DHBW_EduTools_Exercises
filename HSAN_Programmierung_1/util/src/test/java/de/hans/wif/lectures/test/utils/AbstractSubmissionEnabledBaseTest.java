package de.hans.wif.lectures.test.utils;

import com.google.common.collect.Lists;
import de.hans.wif.lectures.test.utils.submission.SubmissionClient;
import de.hans.wif.lectures.test.utils.submission.model.SubmissionRequestParams;
import lombok.Synchronized;
import org.junit.*;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractSubmissionEnabledBaseTest {

    private static final class SubmissionTestWatcher extends TestWatcher {
        @Override
        protected void failed(Throwable e, Description description) {
            super.failed(e, description);

            submit(description, false);
        }

        @Override
        protected void succeeded(Description description) {
            super.succeeded(description);

            submit(description, true);
        }

        private void submit(Description description, boolean passed) {
            SubmissionRequestParams params = new SubmissionRequestParams()
                    .setSolutionHash(Math.random() + "")
                    .setTestPassed(passed)
                    .setTestIdentifier(description.getClassName())
                    .setTestDetailIdentifier(description.getMethodName());

            submissionClient.submitResult(params, getFilePaths(description.getTestClass()));
        }

        private List<File> getFilePaths(Class<?> testClass) {
            String path = System.getProperty("user.dir") + File.separator + "src";

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
    }

    @Rule
    public SubmissionTestWatcher submissionTestWatcher = new SubmissionTestWatcher();

    private static SubmissionClient submissionClient;

    @Before
    @Synchronized
    public void setupConnection() {
        if (null == submissionClient) {
            PublicSettings.initialize(getClassLoader());
            submissionClient = SubmissionClient.getInstance();
        }
    }

    protected abstract ClassLoader getClassLoader();

}
