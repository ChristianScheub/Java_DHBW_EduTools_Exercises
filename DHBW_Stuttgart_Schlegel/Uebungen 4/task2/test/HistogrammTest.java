import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class HistogrammTest {

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
  public void testPrintHistogramm() {
    int[] testArray = {3, 1, 2, 2, 4, 1, 0, 3, 4};
    String[] expectedOutput = {
            "***  *  **\n",
            " **  *  **\n",
            " **  *  **\n",
            " **  * ***\n",
            "**** * ***\n",
            "**** * ***\n",
            "**** * ***\n",
            "**** * ***\n",
            "**** * ***\n"
    };

    Histogramm.printHistogramm(testArray);

    String[] actualOutput = outContent.toString().split(System.lineSeparator());

    assertEquals(expectedOutput.length, actualOutput.length);
    for (int i = 0; i < expectedOutput.length; i++) {
      assertEquals(expectedOutput[i], actualOutput[i]);
    }
  }
}