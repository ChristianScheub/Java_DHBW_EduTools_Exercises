import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Tests {

  @Test
  public void testMultiTableWithThree() {

    String input = "3"; // Benutzereingabe für n
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outputStream));

    MultiTable.main(new String[]{});

    System.setIn(System.in);
    System.setOut(originalOut);

    String expected = "n: \r\n1 x 3 = 3\r\n2 x 3 = 6\r\n3 x 3 = 9\r\n";

    Assert.assertEquals(expected, outputStream.toString());

  }

}
