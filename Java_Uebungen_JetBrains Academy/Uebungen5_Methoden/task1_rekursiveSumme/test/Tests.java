import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Assert.assertEquals(6, Task.recursiveSum(3));
    Assert.assertEquals(10, Task.recursiveSum(4));
  }
}
