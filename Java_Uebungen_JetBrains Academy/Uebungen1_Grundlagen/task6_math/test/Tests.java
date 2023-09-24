import org.junit.Assert;
import org.junit.Test;

public class MultiplyByTenTest {
  @Test
  public void testMultiplyByTen() {
    Assert.assertEquals("5 mal 10 sollte 50 sein.", 50, Task.multiplyByTen(5));
    Assert.assertEquals("0 mal 10 sollte 0 sein.", 0, Task.multiplyByTen(0));
    Assert.assertEquals("-3 mal 10 sollte -30 sein.", -30, Task.multiplyByTen(-3));
  }
}
