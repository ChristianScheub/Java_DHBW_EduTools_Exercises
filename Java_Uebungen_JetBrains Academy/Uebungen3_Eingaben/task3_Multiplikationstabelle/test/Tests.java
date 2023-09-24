import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    String expected2 = "1 x 2 = 2\n2 x 2 = 4\n";
    String expected3 = "1 x 3 = 3\n2 x 3 = 6\n3 x 3 = 9\n";
    Assert.assertEquals(expected2, Task.createTable(2));
    Assert.assertEquals(expected3, Task.createTable(3));
  }
}
