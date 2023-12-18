import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tests {

  @Test
  public void testRemoveMultipleSpaces() {
    StringFormatter formatter = new StringFormatter();
    assertEquals("Dies ist ein Test",  formatter.removeMultipleSpaces("Dies ist    ein   Test"));
    assertEquals("Die DHBW ist toll",  formatter.removeMultipleSpaces("Die    DHBW ist       toll"));

  }
}
