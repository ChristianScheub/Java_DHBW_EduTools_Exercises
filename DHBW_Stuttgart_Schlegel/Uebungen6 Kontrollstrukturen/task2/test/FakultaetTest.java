import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class FakultaetTest {

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
  public void testNegativeNumber() {
    provideInput("-1");
    Fakultaet.main(new String[]{});
    assertEquals("Bitte geben Sie ein Zahl >= 0 ein: Eingabe '-1' ist < 0." + System.lineSeparator(), outContent.toString());
  }

  @Test
  public void testZero() {
    provideInput("0");
    Fakultaet.main(new String[]{});
    assertEquals("Bitte geben Sie ein Zahl >= 0 ein: Das Ergebniss lautet 0!=1" + System.lineSeparator(), outContent.toString());
  }

  @Test
  public void testPositiveNumber() {
    provideInput("5");
    Fakultaet.main(new String[]{});
    assertEquals("Bitte geben Sie ein Zahl >= 0 ein: Das Ergebniss lautet 5!=120" + System.lineSeparator(), outContent.toString());
  }

  private void provideInput(String data) {
    System.setIn(new ByteArrayInputStream(data.getBytes()));
  }
}
