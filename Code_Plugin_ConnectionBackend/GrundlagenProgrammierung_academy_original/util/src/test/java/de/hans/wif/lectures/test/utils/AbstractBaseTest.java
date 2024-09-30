package de.hans.wif.lectures.test.utils;

public class AbstractBaseTest extends SubmissionEnabledBaseTest {
    protected ClassLoader getClassLoader() {
        return getClass().getClassLoader();
    }
}
