import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    // put your test here
    String input = "100\n"; // Simulierte Benutzereingabe
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(out);

    Main.execute(in, ps);

    String expectedOutput = "Geben Sie die Temperatur in Celsius ein: 100.0 Grad Celsius entspricht 212.0 Grad Fahrenheit.\n";
    assertEquals(expectedOutput, out.toString());
  }
}