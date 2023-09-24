import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Assert.assertArrayEquals(new int[] {3, 2, 1}, Task.reverseArray(new int[] {1, 2, 3}));
    Assert.assertArrayEquals(new int[] {1}, Task.reverseArray(new int[] {1}));
  }
}
