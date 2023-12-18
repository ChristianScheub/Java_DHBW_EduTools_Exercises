import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class Tests {

  @Test
  public void testPrintInt() {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outputStream));

    PrintInteger.main(new String[]{});

    System.setOut(originalOut);

    String output = outputStream.toString();
    String expectedStart = "1000 1001 1002 1003 1004 \r\n";
    String expectedEnd = "1995 1996 1997 1998 1999 \r\n2000 ";

    Assert.assertTrue(output.startsWith(expectedStart));
    Assert.assertTrue(output.endsWith(expectedEnd));

  }

}
