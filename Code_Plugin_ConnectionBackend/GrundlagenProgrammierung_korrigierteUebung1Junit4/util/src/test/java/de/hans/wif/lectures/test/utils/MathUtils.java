package de.hans.wif.lectures.test.utils;

import java.lang.reflect.Field;
import java.util.Random;

public class MathUtils {

    private static final long DEFAULT_DELAY = 250;

    public static double whatIsTheNextRandomNumber() {
        return whatIsTheNextRandomNumber(DEFAULT_DELAY);
    }

    public static double whatIsTheNextRandomNumber(long millisToWait) {
        try {
            if (millisToWait > 0) {
                Thread.sleep(millisToWait);
            }

            Class<?> clazz = Math.class.getDeclaredClasses()[0];

            Field fldRndNumberGen = clazz.getDeclaredField("randomNumberGenerator");
            fldRndNumberGen.setAccessible(true);

            Random rnd = (Random) fldRndNumberGen.get(null);
            Field fldSeed = Random.class.getDeclaredField("seed");
            fldSeed.setAccessible(true);

            long seed = System.currentTimeMillis();
            rnd.setSeed(seed);

            double nextRandom = Math.random();

            // now adjust seed again ;-)
            rnd.setSeed(seed);

            System.err.println("Current seed: " + seed);
            System.err.println("Next random: " + nextRandom);

            return nextRandom;
        } catch (IllegalAccessException | NoSuchFieldException | InterruptedException e) {
            return Double.NaN;
        }
    }

    public static void setRandomSeed(long seed) {
        try {
            Class<?> clazz = Math.class.getDeclaredClasses()[0];

            Field fldRndNumberGen = clazz.getDeclaredField("randomNumberGenerator");
            fldRndNumberGen.setAccessible(true);

            Random rnd = (Random) fldRndNumberGen.get(null);
            Field fldSeed = Random.class.getDeclaredField("seed");
            fldSeed.setAccessible(true);

            rnd.setSeed(seed);
        } catch (IllegalAccessException | NoSuchFieldException ignored) {}
    }
}
