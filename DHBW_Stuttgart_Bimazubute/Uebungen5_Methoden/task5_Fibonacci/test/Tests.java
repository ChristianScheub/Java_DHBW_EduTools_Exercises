import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    // Test für n = 0
    Assert.assertArrayEquals(new long[]{}, Task.fibonacciNumbers(0));

    // Test für n = 1
    Assert.assertArrayEquals(new long[]{0}, Task.fibonacciNumbers(1));

    // Test für n = 2
    Assert.assertArrayEquals(new long[]{0, 1}, Task.fibonacciNumbers(2));

    // Test für n = 5
    Assert.assertArrayEquals(new long[]{0, 1, 1, 2, 3}, Task.fibonacciNumbers(5));

    // Test für n = 10
    Assert.assertArrayEquals(new long[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34}, Task.fibonacciNumbers(10));

    // Test für n = 20
    Assert.assertArrayEquals(new long[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181}, Task.fibonacciNumbers(20));


  }
}
