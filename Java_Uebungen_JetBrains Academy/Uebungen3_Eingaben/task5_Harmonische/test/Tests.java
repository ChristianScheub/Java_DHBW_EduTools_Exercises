import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Tests {


  @Test
  public void testSolutionWithOne() {

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    HarmonicSeries.main(new String[]{"1"});

    Assert.assertEquals("Harmonische Reihe von 1 ist 1","1.0" ,outputStream.toString());
  }
  @Test
  public void testSolutionWithFive() {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    HarmonicSeries.main(new String[]{"5"});
    Assert.assertEquals("Harmonische Reihe von 5 ist 2,283333333333333","2.283333333333333" ,outputStream.toString() );
  }

  @Test
  public void testSolutionWithNegativ() {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    HarmonicSeries.main(new String[]{"-1"});
    Assert.assertEquals("Harmonische Reihe von -1 ist 0","0.0" ,outputStream.toString());
  }
}
