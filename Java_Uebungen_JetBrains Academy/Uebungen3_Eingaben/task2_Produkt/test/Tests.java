import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Tests {
  @Test
  public void testAdditionWithFive() {

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    Product.main(new String[]{"5"});

    Assert.assertEquals("120", outputStream.toString());

  }

  @Test
  public void testProductWithNull() {

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    Product.main(new String[]{"0"});

    Assert.assertEquals("1", outputStream.toString());

  }

  @Test
  public void testProductWithOne() {

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    Product.main(new String[]{"1"});

    Assert.assertEquals("1", outputStream.toString());

  }

}
