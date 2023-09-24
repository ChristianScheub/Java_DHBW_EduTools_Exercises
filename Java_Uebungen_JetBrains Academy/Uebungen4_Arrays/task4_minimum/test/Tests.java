import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Assert.assertEquals(1, Task.minArray(new int[] {1, 2, 3}));
    Assert.assertEquals(1, Task.minArray(new int[] {1}));
    Assert.assertEquals(0, Task.minArray(new int[] {0, 1, 2, 3}));
  }
}
