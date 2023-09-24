import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testBeschleunigen() {
    Fahrzeug fahrzeug = new Fahrzeug(0, 0, 4, 1000, 0);
    fahrzeug.beschleunigen(10);
    Assert.assertEquals(10.0, fahrzeug.getAktuelleGeschwindigkeit(), 0.001);
    fahrzeug.beschleunigen(-5);
    Assert.assertEquals(5.0, fahrzeug.getAktuelleGeschwindigkeit(), 0.001);
  }

  @Test
  public void testFahren() {
    Fahrzeug fahrzeug = new Fahrzeug(0, 0, 4, 1000, 0);
    fahrzeug.fahren(10, 5);
    Assert.assertEquals(10, fahrzeug.getPosition().x);
    Assert.assertEquals(5, fahrzeug.getPosition().y);
  }

  @Test
  public void testGeschwindigkeit() {
    Fahrzeug fahrzeug = new Fahrzeug(0, 0, 4, 1000, 20);
    Assert.assertEquals(20.0, fahrzeug.getAktuelleGeschwindigkeit(), 0.001);
  }
}
