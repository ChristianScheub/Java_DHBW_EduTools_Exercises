import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class Tests {

  @Test
  public void testPrintSubstrings() {
    StringSplitter splitter = new StringSplitter();
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    splitter.printSubstrings("Hallo Welt, wie geht's?");

    String expectedOutput = "Hallo\nWelt,\nwie\ngeht's?\n";
    assertEquals(expectedOutput, outContent.toString());
  }
}
