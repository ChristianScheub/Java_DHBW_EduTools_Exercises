import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class Tests {
  @Test
  public void testMatchingLetters() {
    String input = "a\nA\n";
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(out);

    System.setIn(in);
    System.setOut(ps);

    Task.main(new String[0]);

    System.setIn(System.in);
    System.setOut(System.out);

    String output = out.toString();
    assertTrue(output.contains("Die Buchstaben passen zusammen."));
  }

  @Test
  public void testNonMatchingLetters() {
    String input = "a\nB\n";
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(out);

    System.setIn(in);
    System.setOut(ps);

    Task.main(new String[0]);

    System.setIn(System.in);
    System.setOut(System.out);

    String output = out.toString();
    assertTrue(output.contains("Die Buchstaben passen nicht zusammen."));
  }
}