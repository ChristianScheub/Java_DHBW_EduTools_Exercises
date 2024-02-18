import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
//Diese Aufgabe implementiert sowohl Aufgabe 8.1 und 8.2 des Arbeitsblatts
public class Tests {
    @Test
    public void testHierarchy() {
        // put your test here
        Assert.assertSame("Animal soll keine Unterklasse sein", Object.class, Animal.class.getSuperclass());
        Assert.assertSame("Cat soll eine Unterklasse von Animal sein", Animal.class, Cat.class.getSuperclass());
        Assert.assertSame("Dog soll eine Unterklasse von Animal sein", Animal.class, Dog.class.getSuperclass());
        Assert.assertSame("Golden Retriever soll eine Unterklasse von Dog sein", Dog.class, GoldenRetriever.class.getSuperclass());
        Assert.assertSame("Plant soll keine Unterklasse sein", Object.class, Plant.class.getSuperclass());
        Assert.assertSame("Sunflower soll eine Unterklasse von Pflanze sein", Plant.class, Sunflower.class.getSuperclass());
    }
    @Test
    public void testGoldenRetrieverEating() {
        GoldenRetriever goldenRetriever = new GoldenRetriever();
        Method[] methods = goldenRetriever.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equals("eat")) {
                try {
                    method.invoke(goldenRetriever);
                    Assert.assertTrue(goldenRetriever.hasEaten);
                    return;
                } catch (Exception e) {
                    Assert.fail("Fehler beim Aufruf der eat() Methode: " + e.getMessage());
                }
            }
        }
        Assert.fail("Die 'eat' Methode wurde nicht in GoldenRetriever gefunden.");
    }
    @Test
    public void testSunflowerGrowing(){
        Sunflower sunflower = new Sunflower();
        try {
            int size = sunflower.getSize();
            Method method = sunflower.getClass().getDeclaredMethod("grow");
            method.invoke(sunflower);
            Assert.assertEquals(size+1,sunflower.size);
        } catch (NoSuchMethodException e) {
            Assert.fail("grow Method nicht implementiert");
        } catch (InvocationTargetException e) {
            Assert.fail("Dieser Fehler sollte nicht auftreten. Irgendwas ist schief gelaufen");
        } catch (IllegalAccessException e) {
            Assert.fail("Bitte die Methode als public deklarieren");
        }
    }
}