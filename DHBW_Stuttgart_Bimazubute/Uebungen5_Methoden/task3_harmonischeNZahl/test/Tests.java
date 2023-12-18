import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Assert.assertEquals(1.5, Task.harmonicNumber(2), 0.01);

    Assert.assertEquals(1.0, Task.harmonicNumber(1), 0.01);

    // Test für n = 2
    Assert.assertEquals(1.5, Task.harmonicNumber(2), 0.01);

    // Test für n = 3
    Assert.assertEquals(1.8333, Task.harmonicNumber(3), 0.01);

    // Test für n = 5
    Assert.assertEquals(2.2833, Task.harmonicNumber(5), 0.01);

    // Test für n = 10
    Assert.assertEquals(2.9289, Task.harmonicNumber(10), 0.01);


  }
}
