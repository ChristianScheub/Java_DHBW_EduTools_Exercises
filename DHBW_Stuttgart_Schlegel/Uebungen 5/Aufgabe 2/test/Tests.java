import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Tests {
  @Test
  public void testSolution() {
    String input = "23";

    String expectedOutput = "10111";

    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    System.setIn(in);
    System.setOut(new PrintStream(out));

    Task.main(new String[]{});
    Assert.assertTrue("Die duale Repraesentation von 23 ist 10111", out.toString().trim().contains(expectedOutput));
  }

  @Test
  public void testSolution1() {
    String input = "100";

    String expectedOutput = "1100100";

    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    System.setIn(in);
    System.setOut(new PrintStream(out));

    Task.main(new String[]{});
    Assert.assertTrue("Die duale Repraesentation von 100 ist 1100100", out.toString().trim().contains(expectedOutput));
  }

  @Test
  public void testSolution2() {
    String input = "2";

    String expectedOutput = "10";

    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    System.setIn(in);
    System.setOut(new PrintStream(out));

    Task.main(new String[]{});
    Assert.assertTrue("Die duale Repraesentation von 2 ist 10", out.toString().trim().contains(expectedOutput));
  }

}