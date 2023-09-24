import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    String expected2 = "2 4 6 8 10..."; // usw. bis zum Maximum von long.
    Assert.assertTrue(Task.printMultiples(2).startsWith(expected2));
  }
}
