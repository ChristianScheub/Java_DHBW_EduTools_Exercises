import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Tests {
  private Sparbuch sparbuch;

  @Before
  public void setUp() {
    sparbuch = new Sparbuch("123456", 500.0, 0.05); // Kontonummer, Kapital, Zinssatz
  }

  @Test
  public void testEinZahlen() {
    sparbuch.zahleEin(100.0);
    Assert.assertEquals(600.0, sparbuch.getKapital(), 0.01);
  }

  @Test
  public void testAbHeben() {
    sparbuch.hebeAb(100.0);
    Assert.assertEquals(400.0, sparbuch.getKapital(), 0.01);
  }

  @Test
  public void testKontonummer() {
    Assert.assertEquals("123456", sparbuch.getKontonummer());
  }

  @Test
  public void testZinssatz() {
    Assert.assertEquals(0.05, sparbuch.getZinssatz(), 0.01);
  }

  @Test
  public void testVerzinse() {
    sparbuch.verzinse();
    Assert.assertEquals(525.0, sparbuch.getKapital(), 0.01);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNegativeEinzahlung() {
    sparbuch.zahleEin(-50.0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNegativesAbheben() {
    sparbuch.hebeAb(-50.0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testMehrAbhebenAlsGuthaben() {
    sparbuch.hebeAb(600.0);
  }
}
