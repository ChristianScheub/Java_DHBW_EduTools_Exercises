import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Tests {
  @Test
  public void testSolution() {
    // Simulierte Eingabe, die wahrscheinlich zu einer der drei Ausgaben führt
    String simulatedInput = "50\n";
    ByteArrayInputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    System.setIn(inContent);
    System.setOut(new PrintStream(outContent));

    Task.main(new String[0]);

    System.setOut(System.out);

    String actualOutput = outContent.toString().trim();
    boolean containsExpectedOutput = actualOutput.contains("Zu niedrig!") || actualOutput.contains("Zu hoch!") || actualOutput.contains("Korrekt!");

    Assert.assertTrue("Die Ausgabe des Ratespiels sollte eine der erwarteten Antworten enthalten.", containsExpectedOutput);
  }
}