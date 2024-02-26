import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Tests {
  @Test
  public void testSolution() {
    // put your test here
    String input = "a\r\nb\r\nc\r\n#\r\n";

    String expectedOutput = "cba";

    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    System.setIn(in);
    System.setOut(new PrintStream(out));

    Task.main(new String[]{});
    Assert.assertTrue("Das Ergebnis von a b c # ist cba",out.toString().trim().contains(expectedOutput));
  }

  @Test
  public void testSolution1() {
    // put your test here
    String input = "#\r\n";

    String expectedOutput = "Eingabe:";

    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    System.setIn(in);
    System.setOut(new PrintStream(out));

    Task.main(new String[]{});
      Assert.assertEquals("Das Ergebnis von # ist ",out.toString().trim(), expectedOutput);
  }

  @Test
  public void testSolution2() {
    // put your test here
    String input = "a\r\nb\r\nc\r\nd\r\ne\r\nf\r\ng\r\nh\r\ni\r\nj\r\n#\r\n";

    String expectedOutput = "jihgfedcba";

    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    System.setIn(in);
    System.setOut(new PrintStream(out));

    Task.main(new String[]{});
    Assert.assertTrue("Das Ergebnis von a b c d e f g h i j # ist jihgfedcba",out.toString().trim().contains(expectedOutput));
  }
}