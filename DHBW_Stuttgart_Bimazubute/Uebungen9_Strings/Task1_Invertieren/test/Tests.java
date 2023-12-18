import org.junit.Assert;
import org.junit.Test;

public class Tests {

  @Test
  public void testInvert() {
    Assert.assertEquals("ollah", InvertString.invert("hallo"));
    Assert.assertEquals("ih", InvertString.invert("hi"));

  }
}
