import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {

    // Test für n = 0
    Assert.assertEquals("0", Task.binaryRepresentation(0));

    // Test für n = 1
    Assert.assertEquals("1", Task.binaryRepresentation(1));

    // Test für n = 5
    Assert.assertEquals("101", Task.binaryRepresentation(5));

    // Test für n = 10
    Assert.assertEquals("11101", Task.binaryRepresentation(29));

    // Test für n = 42
    Assert.assertEquals("101000", Task.binaryRepresentation(40));

  }
}
