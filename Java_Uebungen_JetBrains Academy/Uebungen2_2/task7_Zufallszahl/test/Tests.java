import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Tests {
  @Test
  public void testSolution() {
    String input = "5" + System.lineSeparator() + "20" + System.lineSeparator() + "30" + System.lineSeparator();
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

    String actualOutput = out.toString();

    boolean containsExpectedOutput = actualOutput.contains("Zu niedrig!") || actualOutput.contains("Zu hoch!") || actualOutput.contains("Korrekt!");

    Assert.assertTrue("Die Ausgabe des Ratespiels sollte eine der erwarteten Antworten enthalten.", containsExpectedOutput);
  }
}