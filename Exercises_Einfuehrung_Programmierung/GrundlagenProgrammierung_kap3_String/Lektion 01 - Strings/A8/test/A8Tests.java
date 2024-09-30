import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A8Tests {
  @Test
  public void testConvertToInteger() {
    assertEquals(Integer.valueOf(5), A8.convertToInteger(5));
    assertEquals(Integer.valueOf(0), A8.convertToInteger(0));
    assertEquals(Integer.valueOf(-3), A8.convertToInteger(-3));
  }
}