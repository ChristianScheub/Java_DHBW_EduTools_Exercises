import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Tests {
  @Test
  public void testSolution() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    Task.main(new String[]{});
    String expectedOutput = "1000 1001 1002 1003 1004\n1005 ... [restliche Ausgabe]";
    Assert.assertTrue(outContent.toString().startsWith("1000 1001 1002 1003 1004"));
  }
}
