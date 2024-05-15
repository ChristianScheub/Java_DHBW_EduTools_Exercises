import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Tests {
    @Test
    public void testSolution() {
        // put your test here
        Class<?> rekursion;
        try {
            rekursion = Class.forName("Rekursion");
            Method fibZahl = rekursion.getDeclaredMethod("fib", long.class);
            long result = (Long) fibZahl.invoke(null,4);
            Assert.assertEquals(3,result);
            result = (long) fibZahl.invoke(null,1);
            Assert.assertEquals(1,result);

            //might need to be commented out on very slow / old machines
            result = (long) fibZahl.invoke(null,25); // Recursion depth 25 !!
            Assert.assertEquals(75025,result);
        } catch (ClassNotFoundException ignore) {
            Assert.fail("Klasse hat strukturellen Fehler");
        } catch (NoSuchMethodException ignore) {
            Assert.fail("fibonacci Funktion nicht implementiert");
        } catch (InvocationTargetException | IllegalAccessException ignore){
            Assert.fail("Exception wurde innerhalb der fib Methode geworfen oder sie ist private");
        }
    }
}