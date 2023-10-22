import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class Tests {

  @Test
  public void testPrintOccurrences() {
    StringAnalyzer analyzer = new StringAnalyzer();
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    analyzer.printOccurrences("hello world", 'l');

    String expectedOutput = "2;" + "3;" + "9;";  // Die Zeichen 'l' sind an den Positionen 2, 3 und 9.
    assertEquals(expectedOutput, outContent.toString());
  }

  @Test
  public void testCharacterNotFound() {
    StringAnalyzer analyzer = new StringAnalyzer();
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    analyzer.printOccurrences("hello world", 'z');

    String expectedOutput = "Character not found";
    assertEquals(expectedOutput, outContent.toString());
  }
}
