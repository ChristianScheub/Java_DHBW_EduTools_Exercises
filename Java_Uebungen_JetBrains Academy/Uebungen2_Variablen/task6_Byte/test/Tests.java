import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Assert.assertEquals("Der Überlauf des byte-Wertes ist nicht korrekt.", (byte)(Byte.MAX_VALUE + 1), Task.addOneToMaxByte());
  }
}
