import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Assert.assertEquals(1, Task.calculateSum(1));
    Assert.assertEquals(3, Task.calculateSum(2));
    Assert.assertEquals(6, Task.calculateSum(3));
    Assert.assertEquals(10, Task.calculateSum(4));
  }
}
