import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;


public class Tests {

  @Before
  public void setUp() {
    Beleg.resetBelegNummer();
  }

  @Test
  public void testBelegnummerInkrement() {
    Beleg beleg1 = new Beleg();
    Beleg beleg2 = new Beleg();
    Beleg beleg3 = new Beleg();

    Assert.assertEquals(10000, beleg1.getBelegNummer());
    Assert.assertEquals(10001, beleg2.getBelegNummer());
    Assert.assertEquals(10002, beleg3.getBelegNummer());
  }

  @Test
  public void testResetBelegnummer() {
    Beleg beleg1 = new Beleg();
    Beleg.resetBelegNummer();

    Beleg beleg2 = new Beleg();

    Assert.assertEquals(10000, beleg1.getBelegNummer());
    Assert.assertEquals(10000, beleg2.getBelegNummer());
  }
}
