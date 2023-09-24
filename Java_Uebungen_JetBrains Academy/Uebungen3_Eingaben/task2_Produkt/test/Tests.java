import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Assert.assertEquals(1, Task.calculateFactorial(1));
    Assert.assertEquals(2, Task.calculateFactorial(2));
    Assert.assertEquals(6, Task.calculateFactorial(3));
    Assert.assertEquals(24, Task.calculateFactorial(4));
  }
}
