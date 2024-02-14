import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Assert.assertEquals("Die rekursive Summe von 3 ist 6.",6, Task.recursiveSum(3));
    Assert.assertEquals("Die rekursive Summe von 20 ist 210.",210, Task.recursiveSum(20));
  }
}
