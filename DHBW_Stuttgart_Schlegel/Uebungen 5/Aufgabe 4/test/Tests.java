import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Assert.assertEquals("Die Quersumme von 1 is 1",1,Task.quersummeRekursiv(1));
  }

  @Test
  public void testSolution1() {
    Assert.assertEquals("Die Quersumme von 12345 ist 15",15,Task.quersummeRekursiv(12345));
  }
}