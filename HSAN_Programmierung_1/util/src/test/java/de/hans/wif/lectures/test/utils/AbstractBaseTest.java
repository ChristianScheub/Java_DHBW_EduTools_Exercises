package de.hans.wif.lectures.test.utils;

public class AbstractBaseTest extends AbstractSubmissionEnabledBaseTest {
    protected ClassLoader getClassLoader() {
        return getClass().getClassLoader();
    }
}
