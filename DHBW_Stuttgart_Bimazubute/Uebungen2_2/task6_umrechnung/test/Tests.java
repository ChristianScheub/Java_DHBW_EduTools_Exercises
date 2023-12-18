import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Tests {
  @Test
  public void testSolution() {
    String input = "100\n"; // Simulierte Benutzereingabe für 100 Grad Celsius
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(out);

    // Setzen des System.in und System.out auf die simulierten Streams
    System.setIn(in);
    System.setOut(ps);

    // Ausführen der main-Methode der Task-Klasse
    Task.main(new String[0]);

    // Zurücksetzen von System.in und System.out auf die Standard-Streams
    System.setIn(System.in);
    System.setOut(System.out);

    // Erwarteter Output
    String expectedOutput = "Geben Sie die Temperatur in Celsius ein: 100.0 Grad Celsius entspricht 212.0 Grad Fahrenheit."+System.lineSeparator();;
    assertEquals(expectedOutput, out.toString());
  }
}
