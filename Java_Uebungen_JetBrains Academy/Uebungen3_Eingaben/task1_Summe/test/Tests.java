import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class Tests {
  @Test
  public void testAddition() {
    // Testfall 1: Eingabe n=5
    int result1 = Task.addition(5);
    Assert.assertEquals(15, result1);

    // Testfall 2: Eingabe n=10
    int result2 = Task.addition(10);
    Assert.assertEquals(55, result2);

    // Testfall 3: Eingabe n=1
    int result3 = Task.addition(1);
    Assert.assertEquals(1, result3);

    // Testfall 4: Eingabe n=0
    int result4 = Task.addition(0);
    Assert.assertEquals(0, result4);

    // Testfall 5: Eingabe n=100
    int result5 = Task.addition(100);
    Assert.assertEquals(5050, result5);
  }

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
  public void testMainMethodWithValidInput() {
    // Simuliere die Eingabe "5"
    String input = "5\n";
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    // Rufe die main-Methode auf
    Task.main(new String[]{});

    // Überprüfe die Ausgabe
    Assert.assertEquals("15", outContent.toString().trim());
  }

}
