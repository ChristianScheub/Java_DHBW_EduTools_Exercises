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

    String lineSeparator = System.getProperty("line.separator");
    String expectedOutput = "Hallo" + lineSeparator + "Welt," + lineSeparator + "wie" + lineSeparator + "geht's?" + lineSeparator;
    assertEquals(expectedOutput, outContent.toString());
  }
}
