import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    boolean[] expected = new boolean[50];
    int[] primeNumbersUnder50 = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
    for (int prime : primeNumbersUnder50) {
      expected[prime] = true;
    }
    Assert.assertArrayEquals(expected, Task.sieveOfEratosthenes());
  }
}
