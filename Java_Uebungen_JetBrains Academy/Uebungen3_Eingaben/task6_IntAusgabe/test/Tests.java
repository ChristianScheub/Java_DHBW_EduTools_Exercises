import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    String expected = "1000 1001 1002 1003 1004\n1005 1006 1007 1008 1009\n";  // usw.
    String result = Task.printNumbers();
    Assert.assertTrue(result.startsWith(expected));
  }
}
