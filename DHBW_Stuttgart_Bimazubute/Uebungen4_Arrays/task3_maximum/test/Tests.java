import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Assert.assertEquals("Das maxElement von {1, 2, 3} ist 3",3, Task.findMaxElement(new int[] {1, 2, 3}));
    Assert.assertEquals("Das maxElement von {1} ist 1",1, Task.findMaxElement(new int[] {1}));
  }
}
