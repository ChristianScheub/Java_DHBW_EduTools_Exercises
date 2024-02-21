import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {

    // Test für Basisfall 1: Wenn k gleich 0 oder k gleich n ist, ist der Binomialkoeffizient 1.
    Assert.assertEquals(1, Task.binomialCoefficient(0, 0));
    Assert.assertEquals(1, Task.binomialCoefficient(5, 0));
    Assert.assertEquals(1, Task.binomialCoefficient(5, 5));

    // Test für Basisfall 2: Wenn k größer als n ist, ist der Binomialkoeffizient 0.
    Assert.assertEquals(0, Task.binomialCoefficient(3, 4));
    Assert.assertEquals(0, Task.binomialCoefficient(5, 6));

    // Weitere Tests für die anderen Fälle
    Assert.assertEquals(3, Task.binomialCoefficient(3, 1));
    Assert.assertEquals(6, Task.binomialCoefficient(4, 2));
    Assert.assertEquals(10, Task.binomialCoefficient(5, 2));
    Assert.assertEquals(56, Task.binomialCoefficient(8, 3));

  }
}
