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

    Summe.main(new String[]{});

    System.setIn(System.in);
    System.setOut(originalOut);

    Assert.assertEquals("n: 15", outputStream.toString());

  }

  @Test
  public void testAdditionWithNull() {

    String input = "0"; // Benutzereingabe für n
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outputStream));

    Summe.main(new String[]{});

    System.setIn(System.in);
    System.setOut(originalOut);

    Assert.assertEquals("n: 0", outputStream.toString());

  }

  @Test
  public void testAdditionWithOne() {

    String input = "1"; // Benutzereingabe für n
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outputStream));

    Summe.main(new String[]{});

    System.setIn(System.in);
    System.setOut(originalOut);

    Assert.assertEquals("n: 1", outputStream.toString());

  }

}
