import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    double epsilon = 0.01;
    Assert.assertEquals(1.0, Task.calculateHarmonic(1), epsilon);
    Assert.assertEquals(1.5, Task.calculateHarmonic(2), epsilon);
    Assert.assertEquals(1.83, Task.calculateHarmonic(3), 0.01);
  }
}
