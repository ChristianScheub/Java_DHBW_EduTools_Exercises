import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Assert.assertEquals("Das minElement von {1, 2, 3} ist 1",1, Task.findMinElement(new int[] {1, 2, 3}));
    Assert.assertEquals("Das minElement von {1} ist 1", 1, Task.findMinElement(new int[] {1}));
    Assert.assertEquals("Das minElement von { } ist 0", 0, Task.findMinElement(new int[] {0, 1, 2, 3}));
  }
}
