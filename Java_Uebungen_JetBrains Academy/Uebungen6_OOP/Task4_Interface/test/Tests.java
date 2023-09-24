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
}
