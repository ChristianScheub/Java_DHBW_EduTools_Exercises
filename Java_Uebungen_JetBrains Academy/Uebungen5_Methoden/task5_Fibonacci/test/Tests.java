import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Assert.assertArrayEquals(new int[]{0, 1, 1, 2, 3}, Task.fibonacciNumbers(5));
  }
}
