import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class Tests {
  @Test
  public void testAdditionWithFive() {

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    Summe.main(new String[]{"5"});

    Assert.assertEquals("15", outputStream.toString());

  }

  @Test
  public void testAdditionWithNull() {

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    Summe.main(new String[]{"0"});

    Assert.assertEquals("0", outputStream.toString());

  }

  @Test
  public void testAdditionWithOne() {

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    Summe.main(new String[]{"1"});

    Assert.assertEquals("1", outputStream.toString());

  }

}
