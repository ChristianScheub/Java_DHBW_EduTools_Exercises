import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class DownloadsTest {

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
  public void testFreeDownloads() {
    provideInput("3");
    Downloads.main(new String[]{});
    assertEquals("Geben Sie die Anzahl der Downloads an: Die ersten 5 Downloads sind kostenlos." + System.lineSeparator(), outContent.toString());
  }

  @Test
  public void testCostForThirtyDownloads() {
    provideInput("35");
    Downloads.main(new String[]{});
    assertEquals("Geben Sie die Anzahl der Downloads an: Sie müssen 6.0 Euro bezahlen." + System.lineSeparator(), outContent.toString());
  }

  @Test
  public void testCostForFiftyDownloads() {
    provideInput("50");
    Downloads.main(new String[]{});
    assertEquals("Geben Sie die Anzahl der Downloads an: Sie müssen 8.25 Euro bezahlen." + System.lineSeparator(), outContent.toString());
  }

  private void provideInput(String data) {
    System.setIn(new ByteArrayInputStream(data.getBytes()));
  }
}
