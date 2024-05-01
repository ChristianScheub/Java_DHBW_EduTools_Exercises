import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class Tests {
    @Test
    public void testSolution() {
        // put your test here
        Class<?> randomArr = null;
        try {
            randomArr = Class.forName("RandomArray");
        } catch (ClassNotFoundException e) {
            Assert.fail("Klasse wurde umbenannt");
            return;
        }
        Optional<Constructor<?>> optionalConstructor = Arrays.stream(randomArr.getConstructors()).findFirst();
        Constructor<?> c = null;
        if (optionalConstructor.isPresent()) {
            c = optionalConstructor.get();
        }else {
            Assert.fail("Die Klasse ist nicht korrekt aufgebaut. Fehlt eine Klammer ?");
            return;
        }
        Method m = null;
        try {
            m = randomArr.getDeclaredMethod("createArray");
        } catch (NoSuchMethodException e) {
            Assert.fail("createArray Methode nicht implementiert");
            return;
        }
        Object o = null;
        try {
            o = c.newInstance();
        } catch (InstantiationException | InvocationTargetException | IllegalAccessException e) {
            Assert.fail("Fehler aufgetreten. Klasse nicht Aufgaben konform");
            e.printStackTrace();
            return;
        }
        try {
            int[] result = (int[]) m.invoke(o);
            Assert.assertNotNull(result);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        m =null;
        try {
            m = randomArr.getDeclaredMethod("showQuantity", int[].class);
        } catch (NoSuchMethodException e) {
            Assert.fail("showQuantity Methode nicht implementiert");
            return;
        }
        Integer[] result = null;
        try {
            int[] test = {1,1,1,1,2,3};
            Object s = m.invoke(o, test);
            result = (Integer[]) s;
            Assert.assertArrayEquals(new Integer[]{4,1,1},result);
        } catch (IllegalAccessException | InvocationTargetException e) {
            Assert.fail("Fehler aufgetreten. Klasse nicht Aufgaben konform");
        }
        m=null;
        try {
            m = randomArr.getDeclaredMethod("doArith", int[].class);
        } catch (NoSuchMethodException e) {
            Assert.fail("doArith Methode nicht implementiert.");
            return;
        }
        try {
            int[] test = {3,2,1};
            double res = (double) m.invoke(o,test);
            Assert.assertEquals(2,res,0.000001);
        }catch (IllegalAccessException | InvocationTargetException e){
            Assert.fail("Fehler aufgetreten. Klasse nicht Aufgaben konform");
        }
    }
}