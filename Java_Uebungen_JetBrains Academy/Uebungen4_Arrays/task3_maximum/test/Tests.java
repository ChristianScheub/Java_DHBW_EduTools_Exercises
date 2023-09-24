import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Assert.assertEquals(3, Task.maxArray(new int[] {1, 2, 3}));
    Assert.assertEquals(1, Task.maxArray(new int[] {1}));
  }
}
