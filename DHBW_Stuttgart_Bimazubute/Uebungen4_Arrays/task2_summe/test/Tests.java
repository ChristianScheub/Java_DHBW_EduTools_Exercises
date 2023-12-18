import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Assert.assertEquals("Die Summe von dem Array {1, 2, 3} ist 6",6, Task.sumArray(new int[] {1, 2, 3}));
    Assert.assertEquals("Die Summe von dem Array {1} ist 1",1, Task.sumArray(new int[] {1}));
    Assert.assertEquals("Die Summe von dem Array { } ist 0",0, Task.sumArray(new int[] {}));
  }
}
