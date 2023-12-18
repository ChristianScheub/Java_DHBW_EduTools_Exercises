package de.hans.wif.lectures.test.utils;

public class ArrayHelper {
    @SuppressWarnings("unchecked")
    public static <T> T[] of(T... t) {
        if (t.length > 0) {
            return t;
        }

        return (T[]) (new Object[] {null});
    }
}
