import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    double epsilon = 0.01;
    Assert.assertEquals(12.52, Task.calculateWindchill(0, 5), epsilon);
    Assert.assertEquals(10.01, Task.calculateWindchill(0, 10), epsilon);
  }
}
