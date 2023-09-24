import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Assert.assertEquals("Int nach Double Konvertierung ist falsch.", 5.0, Task.convertIntToDouble(5), 0.0001);
    Assert.assertEquals("Double nach Int Konvertierung ist falsch.", 5, Task.convertDoubleToInt(5.123));
  }
}
