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
  public void testSolution() {
    String input = "3" + System.lineSeparator();
    ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
    System.setIn(inContent);

    Task.main(new String[]{});

    String lineSeparator = System.lineSeparator();
    String expected = "Bitte geben Sie eine Zahl für die Multiplikationstabelle ein: " +
            "1 x 3 = 3" + lineSeparator +
            "2 x 3 = 6" + lineSeparator +
            "3 x 3 = 9" + lineSeparator;

    Assert.assertEquals(expected, outContent.toString());
  }

}
