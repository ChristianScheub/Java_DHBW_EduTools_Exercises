import org.junit.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;

public class Tests {
    @Test
    public void testCalc(){
        try {
            Method doCalculation = Class.forName("Math").getDeclaredMethod("doCalculation", double.class, double.class, char.class);
            Optional<Constructor<?>> constructor = Arrays.stream(Class.forName("Math").getConstructors()).findFirst();
            if(!constructor.isPresent()){
                Assert.fail("Konstruktor konnte nicht gefunden werden. Haben Sie die Klassen geändert ?");
            }
            Double result = (Double) doCalculation.invoke(constructor.get().newInstance(),3.0,2.0,'+');
            Assert.assertEquals(Double.valueOf(5),result);
            result = (Double) doCalculation.invoke(constructor.get().newInstance(),2.5,2.5,'+');
            Assert.assertEquals(Double.valueOf(5),result);
            result = (Double) doCalculation.invoke(constructor.get().newInstance(),-2.111,2.444,'*');
            Assert.assertEquals(Double.valueOf(-2.111*2.444),result,0.001);
            result = (Double) doCalculation.invoke(constructor.get().newInstance(),9,3,'/');
            Assert.assertEquals(Double.valueOf(3),result);
        } catch (NoSuchMethodException e) {
            Assert.fail("doCalculation Methode wurde gelöscht");
        } catch (ClassNotFoundException e) {
            Assert.fail("Klasse konnte nicht gefunden werden, bitte nicht umbenennen");
        } catch (InvocationTargetException e) {
            Assert.fail("Die Methode hat einen Fehler geworfen");
            e.getCause().printStackTrace();
        } catch (IllegalAccessException e) {
            Assert.fail("Methode bitte mit public Access");
        } catch (InstantiationException e) {
            Assert.fail("Fehler bei der Objekterzeugung");
        }
    }
}