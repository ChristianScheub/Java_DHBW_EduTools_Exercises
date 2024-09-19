import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Tests extends ConsoleIOBaseTest {

  @Test
  public void testSolution() {
    // Create an output stream to capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outputStream));
    System.out.println("Keine Überprüfung. Bitte Ausgabe selbst überprüfen!");
    assertTrue(true);

  }
}