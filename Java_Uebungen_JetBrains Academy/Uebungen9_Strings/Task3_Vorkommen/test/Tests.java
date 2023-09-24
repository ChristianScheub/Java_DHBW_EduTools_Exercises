import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class Tests {

  @Test
  public void testPrintOccurrences() {
    // Prepare to capture the output of System.out.println
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    // Call the method
    CharacterOccurrences.printOccurrences("hallo", 'l');

    // Check the output
    String expectedOutput = "Char 'l' found at position: 2" + System.lineSeparator()
            + "Char 'l' found at position: 3" + System.lineSeparator();
    assertEquals(expectedOutput, outContent.toString());

    // Reset the System.out
    System.setOut(System.out);
  }
}
