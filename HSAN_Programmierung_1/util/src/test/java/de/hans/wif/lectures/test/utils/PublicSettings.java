package de.hans.wif.lectures.test.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class PublicSettings {

    public static final String USERNAME = "plearn.username";
    public static final String PASSWORD = "plearn.password";

    public static final String COURSE_ID = "plearn.course.id";

    public static final String EXERCISE_ID = "plearn.exercise.id";

    public static final String PLEARN_API_URL = "plearn.api.url";

    public static final String AUTHENTICATION_TOKEN = "plearn.authentication.token";
    public static final String USER_ID = "plearn.user.id";

    private static final String PROPERTIES_FILE = "plearn.properties";

    private static final Properties properties = new Properties();

    public static void initialize(ClassLoader classLoader) {
        InputStream propertiesStream = classLoader.getResourceAsStream(PROPERTIES_FILE);

        if (propertiesStream != null) {
            try {
                properties.load(propertiesStream);
                propertiesStream.close();
            } catch (IOException e) {
                // an error happened: maybe the file was not found?
                e.printStackTrace();
            }
        }
    }

    public static String get(final String key) {
        return properties.getProperty(key);
    }

    static void set(final String key, final String value) {
        properties.setProperty(key, value);
    }

    public static boolean pLearnEnabled() {
        return !((String) properties.getOrDefault(USERNAME, "")).isEmpty() &&
                !((String) properties.getOrDefault(PASSWORD, "")).isEmpty() &&
                !((String) properties.getOrDefault(PLEARN_API_URL, "")).isEmpty() &&
                !((String) properties.getOrDefault(COURSE_ID, "")).isEmpty();
    }



    public static String getAuthenticationToken() {
        return get(AUTHENTICATION_TOKEN);
    }


    public static int getUserId() {
        return Integer.parseInt(get(USER_ID));
    }
    public static void setUserId(int userId) {
        properties.setProperty(USER_ID, Integer.toString(userId));
    }

    public static void setAuthenticationToken(String authenticationToken) {
        properties.setProperty(AUTHENTICATION_TOKEN, authenticationToken);
    }
    public static String getUserEmail() {
        return get(USERNAME);
    }
    public static void setUserEmail(String email) {
        properties.setProperty(USERNAME, email);
    }
}
