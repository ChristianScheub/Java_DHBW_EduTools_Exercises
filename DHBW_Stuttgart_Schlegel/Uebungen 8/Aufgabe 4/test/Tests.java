import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Tests {
    @Test
    public void testImplementation() {
        // put your test here
        Class<?>[] interfaces = Biene.class.getInterfaces();
        for (Class inter : interfaces) {
            if (inter.getName().equalsIgnoreCase("Fliegen")) {
                Assert.assertTrue(inter.getName().equalsIgnoreCase("Fliegen"));
                return;
            }
        }
        Assert.fail("Interface Fliegen wurde nicht von Biene implementiert");
    }
    @Test
    public void testInterfaceFliegen(){
        try {
            Class<?>[] interfaces = Biene.class.getInterfaces();
            boolean found = false;
            for (Class<?> inter : interfaces) {
                if (inter.getSimpleName().equals("Fliegen")) {
                    found = true;
                    Method[] methods = inter.getDeclaredMethods();
                    boolean methodFound = false;
                    for (Method method : methods) {
                        if (method.getName().equals("fliegen")) {
                            methodFound = true;
                            break;
                        }
                    }
                    Assert.assertTrue(methodFound);
                    break;
                }
            }
            if (!found) {
                Assert.fail("Interface Fliegen not implemented by Biene");
            }
        } catch (Exception e) {
            Assert.fail("Exception occurred: " + e.getMessage());
        }
    }
    @Test
    public void testBiene(){
        Biene Maya = new Biene();
        try {
            Method method = Maya.getClass().getDeclaredMethod("fliegen");
            Assert.assertEquals("Summ Summ Summ",method.invoke(Maya));
        } catch (NoSuchMethodException e) {
            Assert.fail("fliegen wurde nicht in Biene implementiert");
        } catch (InvocationTargetException | IllegalAccessException e) {
            Assert.fail("Methode fliegen entweder privat oder ein unbekannter Fehler ist aufgetreten");
        }
    }
    @Test
    public void testAbflug(){
        try {
            Method method = Task.class.getDeclaredMethod("abflug", Biene.class);
            Assert.assertEquals("Summ Summ Summ",method.invoke(new Biene(), new Biene()));
        } catch (NoSuchMethodException e) {
            Assert.fail("Keine Abflug Methode gefunden");
        } catch (InvocationTargetException | IllegalAccessException e) {
            Assert.fail("Methode abflug entweder privat oder ein unbekannter Fehler ist aufgetreten");
        } catch (IllegalArgumentException e){
            Assert.fail("Methode Abflug hat eine ungueltige Parameter deklaration");
        }

    }
}