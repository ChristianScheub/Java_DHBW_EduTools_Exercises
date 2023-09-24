import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Tests {
  @Test
  public void testPositiveMultiples4() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    Task.main(new String[]{"4"});

    String[] results = outContent.toString().trim().split("\n");
    for (int i = 0; i < results.length; i++) {
      Assert.assertEquals((i + 1) * 4, Long.parseLong(results[i]));
    }
  }

  @Test
  public void testPositiveMultiples16() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    Task.main(new String[]{"16"});

    String[] results = outContent.toString().trim().split("\n");
    for (int i = 0; i < results.length; i++) {
      Assert.assertEquals((i + 1) * 16, Long.parseLong(results[i]));
    }
  }
}
