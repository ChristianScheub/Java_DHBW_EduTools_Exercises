import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Assert.assertEquals(6, Task.sumArray(new int[] {1, 2, 3}));
    Assert.assertEquals(1, Task.sumArray(new int[] {1}));
    Assert.assertEquals(0, Task.sumArray(new int[] {}));
  }
}
