import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Tests {
  private double[] konstantesPolynom = {3.0};
  private double[] linearesPolynom = {5.0, 2.0};
  private double[] quadratischesPolynom = {4.0, 3.0, -1.0};
  private double[] nullPolynom = {0.0};
  private double[] polynomMitNegativenKoeffizienten = {7.0, -2.0, 0.0, -4.0};
  private double[][] arrays = {konstantesPolynom,linearesPolynom,quadratischesPolynom,polynomMitNegativenKoeffizienten,nullPolynom};

  @Test
  public void testPolynomOVR() {
      try {
          Constructor<Polynom> constructor = Polynom.class.getDeclaredConstructor(double[].class);
          Polynom poly;
          try {
              poly = constructor.newInstance((Object) konstantesPolynom);
          }catch (InvocationTargetException e){
              throw new InstantiationException();
          }
          Assert.assertTrue(true); // Intentional - Test is meant to Assert that the Class behaves as expected
          try {
              poly = constructor.newInstance((Object) null);
              Assert.fail("Polynom mit null-referenz darf nicht erstellbar sein");
          }catch (InvocationTargetException | IllegalArgumentException ex){
              Assert.assertTrue(true);
          }
          try {
              poly = constructor.newInstance((Object) new double[0]);
              Assert.fail("Polynom ohne Koeffizenten darf nicht erstellbar sein");
          }catch (IllegalArgumentException | InvocationTargetException ex){
              Assert.assertTrue(true);
          }
          poly = constructor.newInstance((Object) new double[]{0.0, 0.0, 0.0});
          Assert.assertTrue(true);
      } catch (NoSuchMethodException e) {
          Assert.fail("Konstruktor nicht richtig implementiert");
      } catch (IllegalAccessException e) {
          Assert.fail("Keine Zugriffsberechtigung auf Konstruktor");
      } catch (InstantiationException e) {
          Assert.fail("Polynom Klasse konnte nicht instanziiert werden");
      } catch (InvocationTargetException e) {
          Assert.fail("Unerwartete Exception geworfen. Bitte aus dem Code entfernen");
      }
  }
    @Test
    public void testGradDetection() {
        int[] exVals = {0,1,2,3};
        int[] exVals2 = {0,0,1,2};
        try {
            Constructor<Polynom> constructor = Polynom.class.getDeclaredConstructor(double[].class);
            for (int i = 0; i < 4; i++) {
                Polynom polynom = constructor.newInstance((Object) arrays[i]);
                Method grad = polynom.getClass().getDeclaredMethod("grad");
                Method ableitung = polynom.getClass().getDeclaredMethod("ableiten");
                Assert.assertEquals("Grad falsch erkannt, Polynom: "+ Arrays.toString(arrays[i]),exVals[i], grad.invoke(polynom));
                polynom = (Polynom) ableitung.invoke(polynom);
                Assert.assertEquals("Ableitung nicht korrekt, Polynom: "+Arrays.toString(arrays[i]),exVals2[i],grad.invoke(polynom));
            }
        } catch (NoSuchMethodException e) {
            Assert.fail("Konstruktor oder grad() oder ableiten() nicht implementiert");
        } catch (IllegalAccessException e) {
            Assert.fail("Keine Zugriffsberechtigung auf Konstruktor");
        } catch (InstantiationException e) {
            Assert.fail("Polynom Klasse konnte nicht instanziiert werden");
        } catch (InvocationTargetException e) {
            e.getCause().printStackTrace();
            Assert.fail("Unerwartete Exception geworfen. Bitte aus dem Code entfernen");
        }

    }
    @Test
    public void testFunktionsWert() {
        try {
            Constructor<Polynom> constructor = Polynom.class.getDeclaredConstructor(double[].class);

            double[][] coefficients = {
                    {1.0},
                    {0.0, 1.0},
                    {2.0, -3.0, 1.0}
            };
            double[] expectedValues = {1.0, 1.0, 0.0};

            for (int i = 0; i < coefficients.length; i++) {
                Polynom polynomial = constructor.newInstance((Object) coefficients[i]);
                Method evaluate = polynomial.getClass().getDeclaredMethod("wertAnStelle", double.class);
                double result = (double) evaluate.invoke(polynomial, 1.0);
                Assert.assertEquals(
                        "Funktionswert nicht korrekt, Polynom: " + Arrays.toString(coefficients[i]), expectedValues[i], result, 0.0001
                );
            }
        } catch (NoSuchMethodException e) {
            Assert.fail("Konstruktor oder wertAnStelle nicht implementiert");
        } catch (InvocationTargetException e) {
            e.getCause().printStackTrace();
            Assert.fail("Unerwartete Exception geworfen. Bitte aus dem Code entfernen");
        } catch (InstantiationException e) {
            Assert.fail("Polynom Klasse konnte nicht instanziiert werden");
        } catch (IllegalAccessException e) {
            Assert.fail("Keine Zugriffsberechtigung auf Konstruktor");
        }
    }

    @Test
    public void testAbleiten() {
        try {
            Constructor<Polynom> constructor = Polynom.class.getDeclaredConstructor(double[].class);
            double[][] coefficients = {
                    {1.0},
                    {0.0, 1.0},
                    {2.0, -3.0, 1.0},
                    {0.0}
            };
            double[][] expectedCoefficients = {
                    {0.0},
                    {1.0},
                    {-3.0, 2.0},
                    {0.0}
            };

            for (int i = 0; i < coefficients.length; i++) {
                Polynom polynomial = constructor.newInstance((Object) coefficients[i]);
                Method differentiate = polynomial.getClass().getDeclaredMethod("ableiten");
                Polynom result = (Polynom) differentiate.invoke(polynomial);
                double[] resultCoefficients = result.getKoeffizienten();

                Assert.assertArrayEquals("Ableitung nicht korrekt, Polynom: " + Arrays.toString(coefficients[i]),
                        expectedCoefficients[i], resultCoefficients, 0.0001);
            }
        } catch (NoSuchMethodException e) {
            Assert.fail("Konstruktor oder ableiten Methode nicht implementiert");
        } catch (InvocationTargetException e) {
            e.getCause().printStackTrace();
            Assert.fail("Unerwartete Exception geworfen. Bitte aus dem Code entfernen");
        } catch (InstantiationException e) {
            Assert.fail("Polynom Klasse konnte nicht instanziiert werden");
        } catch (IllegalAccessException e) {
            Assert.fail("Keine Zugriffsberechtigung auf Konstruktor");
        }
    }
    @Test
    public void testAddition(){
      double[] exResult = {4.0,8.0,1.0};
      try {
          Constructor<Polynom> constructor = Polynom.class.getDeclaredConstructor(double[].class);
          Polynom poly1 = constructor.newInstance((Object) linearesPolynom);
          Polynom poly2 = constructor.newInstance((Object) quadratischesPolynom);
          Polynom result = constructor.newInstance((Object) exResult);
          Method add = poly1.getClass().getDeclaredMethod("addPolynom", Polynom.class);
          Polynom res = (Polynom) add.invoke(poly1,poly2);
          System.err.println("Es wird versucht zu addieren: "+Arrays.toString(poly1.getKoeffizienten())+" "+Arrays.toString(poly2.getKoeffizienten()));
          Assert.assertEquals("Polynom: "+Arrays.toString(result.getKoeffizienten())+" ungleich "+Arrays.toString(res.getKoeffizienten()),result, res);
      } catch (NoSuchMethodException e) {
          Assert.fail("Konstruktor oder ableiten Methode nicht implementiert");
      } catch (InvocationTargetException e) {
          e.getCause().printStackTrace();
          Assert.fail("Unerwartete Exception geworfen. Bitte aus dem Code entfernen");
      } catch (InstantiationException e) {
          Assert.fail("Polynom Klasse konnte nicht instanziiert werden");
      } catch (IllegalAccessException e) {
          Assert.fail("Keine Zugriffsberechtigung auf Konstruktor");
      }
    }
}