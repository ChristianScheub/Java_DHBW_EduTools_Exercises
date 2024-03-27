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

public class Sternchen_1Test {

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
  public void testPositiveInput() {
    provideInput("5");
    Sternchen_1.main(new String[]{});
    assertEquals("Geben Sie eine positive Zahl ein: *****", outContent.toString().trim());
  }

  @Test
  public void testZeroInput() {
    provideInput("0");
    Sternchen_1.main(new String[]{});
    assertEquals("Geben Sie eine positive Zahl ein:", outContent.toString().trim());
  }

  @Test
  public void testNegativeInput() {
    provideInput("-3");
    Sternchen_1.main(new String[]{});
    assertEquals("Geben Sie eine positive Zahl ein: Zahl ist nicht positiv!", outContent.toString().trim());
  }

  private void provideInput(String data) {
    System.setIn(new ByteArrayInputStream(data.getBytes()));
  }
}
