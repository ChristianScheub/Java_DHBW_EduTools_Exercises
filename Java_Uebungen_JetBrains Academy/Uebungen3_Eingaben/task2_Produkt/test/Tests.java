import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Tests {
  @Test
  public void testAdditionWithFive() {

    String input = "5"; // Benutzereingabe für n
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outputStream));

    Product.main(new String[]{});

    System.setIn(System.in);
    System.setOut(originalOut);

    Assert.assertEquals("n: 120", outputStream.toString());

  }

  @Test
  public void testProductWithNull() {

    String input = "0"; // Benutzereingabe für n
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outputStream));

    Product.main(new String[]{});

    System.setIn(System.in);
    System.setOut(originalOut);

    Assert.assertEquals("n: 1", outputStream.toString());

  }

  @Test
  public void testProductWithOne() {

    String input = "1"; // Benutzereingabe für n
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outputStream));

    Product.main(new String[]{});

    System.setIn(System.in);
    System.setOut(originalOut);

    Assert.assertEquals("n: 1", outputStream.toString());

  }

}
