import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    // put your test here
    double[] data = {5.0, 3.0, 9.0, 2.0, 7.0};
    Statistik stats = new Statistik(data);
    Assert.assertEquals(2.0, stats.minValue(), 0.0001);
    Assert.assertEquals(9.0, stats.maxValue(), 0.0001);
    Assert.assertEquals(2.5612, stats.standardDeviation(), 0.0001);
  }
}