import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Tests {
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;
  private final InputStream originalIn = System.in;

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }

  @After
  public void restoreStreams() {
    System.setOut(originalOut);
    System.setIn(originalIn);
  }

  @Test
  public void testFactorialOfZero() {
    // Teste Fakultät von 0
    long result = Task.calculateFactorial(0);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testFactorialOfOne() {
    // Teste Fakultät von 1
    long result = Task.calculateFactorial(1);
    Assert.assertEquals(1, result);
  }

  @Test
  public void testFactorialOfSmallNumber() {
    // Teste Fakultät einer kleinen Zahl (z.B. 5)
    long result = Task.calculateFactorial(5);
    Assert.assertEquals(120, result);
  }

  @Test
  public void testFactorialOfLargeNumber() {
    // Teste Fakultät einer größeren Zahl (z.B. 10)
    long result = Task.calculateFactorial(10);
    Assert.assertEquals(3628800, result);
  }
  @Test
  public void testFactorialCalculationWithValidInput() {
    // Simuliere die Eingabe "5"
    String input = "5" + System.lineSeparator();
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    // Rufe die main-Methode auf
    Task.main(new String[]{});

    // Teile die Ausgabe in Zeilen auf und überprüfe die letzte Zeile
    String[] lines = outContent.toString().split(System.lineSeparator());
    Assert.assertEquals("120", lines[lines.length - 1].trim());
  }


}
