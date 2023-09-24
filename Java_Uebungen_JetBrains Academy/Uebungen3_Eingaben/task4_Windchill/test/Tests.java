import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Tests {
  @Test
  public void testWindchill() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    Task.main(new String[]{"10.0", "5.0"});
    String result = outContent.toString().trim();
    Assert.assertTrue(result.startsWith("Windchill-Wert: "));
  }
}
