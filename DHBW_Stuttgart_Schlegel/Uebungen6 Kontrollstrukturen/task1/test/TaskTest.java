import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TaskTest {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }

  @After
  public void restoreStreams() {
    System.setOut(originalOut);
  }

  @Test
  public void testPositiveNumber() {
    Task.main(new String[]{});
    String[] lines = outContent.toString().split(System.lineSeparator());
    assertEquals("0 ist 0", lines[1].trim()); // Assert that "0 ist 0" is printed
    assertTrue(lines[0].contains("0")); // Assert that 0 is printed
  }

  @Test
  public void testNegativeNumber() {
    Task.main(new String[]{});
    String[] lines = outContent.toString().split(System.lineSeparator());
    assertEquals("-1 ist kleiner 0", lines[0].trim()); // Assert that "-1 ist kleiner 0" is printed
    assertTrue(lines[0].contains("-1")); // Assert that -1 is printed
  }

  @Test
  public void testZero() {
    Task.main(new String[]{});
    String[] lines = outContent.toString().split(System.lineSeparator());
    assertEquals(2, lines.length); // Ensure no extra lines are printed
    assertTrue(lines[1].contains("0")); // Assert that 0 is printed
    assertTrue(lines[1].contains("ist 0")); // Assert that "ist 0" is printed
  }
}
