import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Tests {
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;
  private final ByteArrayInputStream inContent;
  private final String LINE_SEPARATOR = System.lineSeparator();

  public Tests() {
    String inputData = "10\n5\n";
    inContent = new ByteArrayInputStream(inputData.getBytes());
  }

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
    System.setIn(inContent);
  }

  @After
  public void restoreStreams() {
    System.setOut(originalOut);
    System.setIn(System.in);
  }

  @Test
  public void testWindchillCalculation() {
    Task.main(null);  // Passing null as args since it's not used

    String output = outContent.toString();
    String[] parts = output.split("beträgt: ");
    String windchillStr = parts[1].split("°C")[0].replace(",", "."); // Convert comma to point for parsing
    double windchillValue = Double.parseDouble(windchillStr);

    double expectedWindchill = 9.46;
    double delta = 0.5;  // You can adjust this value as needed

    Assert.assertEquals(expectedWindchill, windchillValue, delta);
  }

}
