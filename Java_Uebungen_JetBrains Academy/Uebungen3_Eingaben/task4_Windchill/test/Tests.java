import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Tests {
  @Test
  public void testWindchill() {

    String input = "8\n20\n";

    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outputStream));

    Windchill.main(new String[]{});

    System.setIn(System.in);

    String expected = "t: v: 4.85";

    Assert.assertEquals("The Windchill with t=8 and v=20 should be 4.85",expected, outputStream.toString());

  }

}
