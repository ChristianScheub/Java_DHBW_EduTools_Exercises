import org.junit.Assert;
import org.junit.Test;

public class Tests {

  @Test
  public void testBelegnummerIncrement() {
    Beleg beleg1 = new Beleg();
    Beleg beleg2 = new Beleg();
    Beleg beleg3 = new Beleg();

    Assert.assertEquals(10000, beleg1.getBelegnummer());
    Assert.assertEquals(10001, beleg2.getBelegnummer());
    Assert.assertEquals(10002, beleg3.getBelegnummer());
  }

  @Test
  public void testBelegnummerNachReset() {
    Beleg.resetBelegnummer();
    Beleg beleg1 = new Beleg();
    Assert.assertEquals(10000, beleg1.getBelegnummer());
  }
}
