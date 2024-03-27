import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class MorseTest {

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
  public void testUpperCaseLetter() {
    provideInput("A");
    Morse.main(new String[]{});
    assertEquals("Geben Sie n Zeichen ein: .-", outContent.toString().trim());
  }

  @Test
  public void testLowerCaseLetter() {
    provideInput("m");
    Morse.main(new String[]{});
    assertEquals("Geben Sie n Zeichen ein: --", outContent.toString().trim());
  }

  @Test
  public void testNumber() {
    provideInput("5");
    Morse.main(new String[]{});
    assertEquals("Geben Sie n Zeichen ein: .....", outContent.toString().trim());
  }

  @Test
  public void testInvalidCharacter() {
    provideInput("$");
    Morse.main(new String[]{});
    assertEquals("Geben Sie n Zeichen ein: Keine gültiges Zeichen!", outContent.toString().trim());
  }

  private void provideInput(String data) {
    System.setIn(new ByteArrayInputStream(data.getBytes()));
  }
}
