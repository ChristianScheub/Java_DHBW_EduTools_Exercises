import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Tests {

  @Test
  public void testMultiTableWithThree() {

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    MultiTable.main(new String[]{"3"});

    String expected = "1 x 3 = 3\r\n2 x 3 = 6\r\n3 x 3 = 9\r\n";

    Assert.assertEquals(expected, outputStream.toString());

  }

}
