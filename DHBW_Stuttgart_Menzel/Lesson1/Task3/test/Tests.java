import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.*;
import java.util.*;

public class Tests {
    @Test
    public void testSolution() {
        Class<?> arrShift = null;
        try {
            arrShift = Class.forName("ArrayShifter");
        } catch (ClassNotFoundException e) {
            Assert.fail("Klasse wurde umbenannt/gelöscht");
            return;
        }
        Constructor<?> constructor = null;
        try {
            constructor = arrShift.getConstructor();
        } catch (NoSuchMethodException e) {
            Assert.fail("Klasse weist strukturelle Fehler auf");
            return;
        }
        Method shiftarr = null;
        try {
            shiftarr = arrShift.getDeclaredMethod("shiftArray", int[].class, int.class);
        } catch (NoSuchMethodException e) {
            Assert.fail("Methode generate Array nicht Implementiert");
            return;
        }
        Object o = null;
        try {
            o = constructor.newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            Assert.fail("Klasse hat einen strukturellen Fehler oder konnte nicht erfolgreich ausführen");
            e.getCause().printStackTrace();
        }
        try {
            int[] result = (int[]) shiftarr.invoke(o, new int[]{3, 2, 1, 1}, 2);
            Assert.assertArrayEquals(new int[]{1, 1, 3, 2}, result);
            result = (int[]) shiftarr.invoke(o,new int[]{1,2,3},5);
            Assert.assertArrayEquals(new int[]{2,3,1},result);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

    }
}