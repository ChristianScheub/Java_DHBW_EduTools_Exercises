import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Assert.assertEquals("Die Potenz von 2 hoch 3 ist 8",8,Task.potenz(2.0,3),0);
  }

  @Test
  public void testSolution1() {
    Assert.assertEquals("Die Potenz von 2 hoch -3 ist 0.125",0.125,Task.potenz(2.0, -3),0);
  }

  @Test
  public void testSolution2() {
    Assert.assertEquals("Die Potenz von 2 hoch 1 ist 2",2,Task.potenz(2.0,1),0);
  }

  @Test
  public void testSolution3() {
    Assert.assertEquals("Die Potenz von 2 hoch 0 ist 1",1,Task.potenz(2.0, 0),0);
  }
}