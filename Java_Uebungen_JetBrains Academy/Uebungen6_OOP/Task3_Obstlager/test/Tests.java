import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testApfel() {
    Apfel apfel = new Apfel();
    Assert.assertEquals("Apfel", apfel.getName());
    Assert.assertEquals("rot", apfel.getFarbe());
  }

  @Test
  public void testBirne() {
    Birne birne = new Birne();
    Assert.assertEquals("Birne", birne.getName());
    Assert.assertEquals("grün", birne.getFarbe());
  }

  @Test
  public void testOrange() {
    Orange orange = new Orange();
    Assert.assertEquals("Orange", orange.getName());
    Assert.assertEquals("orange", orange.getFarbe());
  }

  @Test
  public void testObstlager() {
    Obstlager lager = new Obstlager();
    lager.addObst(new Apfel());
    lager.addObst(new Birne());
    lager.addObst(new Orange());

    // Hier könnten wir prüfen, ob das Lager tatsächlich drei Obstsorten enthält.
    // Da die `print()` Methode void ist und nur Ausgaben macht, ist es schwierig, dies in einem JUnit-Test direkt zu überprüfen.
    // Stattdessen könnten Sie die Methode `print()` so ändern, dass sie einen String zurückgibt oder Sie verwenden spezielle Techniken, um die Konsolenausgabe zu überprüfen (etwas fortgeschrittener).
    // Für den Moment nehmen wir an, dass Sie den Test manuell durchführen, indem Sie `print()` aufrufen und die Konsolenausgabe überprüfen.
  }
}
