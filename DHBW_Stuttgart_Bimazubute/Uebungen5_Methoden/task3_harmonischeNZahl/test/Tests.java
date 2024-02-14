import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Assert.assertEquals(1.5, Task.recHarmonicNumber(2), 0.01);

    Assert.assertEquals(1.0, Task.recHarmonicNumber(1), 0.01);

    // Test für n = 2
    Assert.assertEquals(1.5, Task.recHarmonicNumber(2), 0.01);

    // Test für n = 3
    Assert.assertEquals(1.8333, Task.recHarmonicNumber(3), 0.01);

    // Test für n = 5
    Assert.assertEquals(2.2833, Task.recHarmonicNumber(5), 0.01);

    // Test für n = 10
    Assert.assertEquals(2.9289, Task.recHarmonicNumber(10), 0.01);


  }
}
