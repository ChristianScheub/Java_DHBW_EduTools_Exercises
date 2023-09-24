import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Tests {
  @Test
  public void testSolution() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    Task.main(new String[]{"3"});
    String expected = "1 x 3 = 3\n2 x 3 = 6\n3 x 3 = 9\n";
    Assert.assertEquals(expected, outContent.toString());
  }
}
