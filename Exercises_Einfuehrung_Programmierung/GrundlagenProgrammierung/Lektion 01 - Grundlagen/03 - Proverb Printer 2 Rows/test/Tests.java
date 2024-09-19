import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Tests extends ConsoleIOBaseTest {

  @Test
  public void testSolution() {
    // Set up to capture console output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalSystemOut = System.out;
    System.setOut(new PrintStream(outputStream));

    // Run the ProverbPrinterRows's main method
    ProverbPrinterRows.main(new String[0]);

    // Restore the original System.out
    System.setOut(originalSystemOut);



    // Expected output
    String expectedOutput = "Arbeit ist\nAnbetung";

    // Capture the actual output
    String actualOutput = outputStream.toString().trim();

    // Assert that the expected output matches the actual output
    assertEquals(expectedOutput, actualOutput);

  }
}