import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
}