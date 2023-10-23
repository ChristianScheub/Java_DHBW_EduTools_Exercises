import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Tests {


  @Test
  public void testSolutionWithOne() {

    String input = "1"; // Benutzereingabe für n
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outputStream));

    HarmonicSeries.main(new String[]{});

    System.setIn(System.in);
    System.setOut(originalOut);

    Assert.assertEquals("Harmonische Reihe von 1 ist 1","n: 1.0" ,outputStream.toString());
  }
  @Test
  public void testSolutionWithFive() {
    String input = "5"; // Benutzereingabe für n
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outputStream));

    HarmonicSeries.main(new String[]{});

    System.setIn(System.in);
    System.setOut(originalOut);

    Assert.assertEquals("Harmonische Reihe von 5 ist 2,283333333333333","n: 2.283333333333333" ,outputStream.toString() );
  }

  @Test
  public void testSolutionWithNegativ() {
    String input = "-1"; // Benutzereingabe für n
    InputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outputStream));

    HarmonicSeries.main(new String[]{});

    System.setIn(System.in);
    System.setOut(originalOut);

    Assert.assertEquals("Harmonische Reihe von -1 ist 0","n: 0.0" ,outputStream.toString());
  }
}
