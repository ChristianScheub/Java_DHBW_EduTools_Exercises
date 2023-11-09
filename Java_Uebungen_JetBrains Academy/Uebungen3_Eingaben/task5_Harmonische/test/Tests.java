import org.junit.Assert;
import org.junit.Test;


public class Tests {


  @Test
  public void testSolutionWithOne() {

    Assert.assertEquals("Harmonische Reihe von 1 ist 1",1 , HarmonicSeries.calcHarmonicNum(1),0);

  }
  @Test
  public void testSolutionWithFive() {

    Assert.assertEquals("Harmonische Reihe von 5 ist 2.28",2.28 , HarmonicSeries.calcHarmonicNum(5),0.2 );

  }

  @Test
  public void testSolutionWithNegativ() {

    Assert.assertEquals("Harmonische Reihe von -1 ist 0",0 ,HarmonicSeries.calcHarmonicNum(-1),0);

  }
}
