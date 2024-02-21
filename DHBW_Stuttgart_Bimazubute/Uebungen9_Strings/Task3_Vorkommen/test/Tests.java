import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class Tests {

  @Test
  public void testCharacterFound1() {
    StringAnalyzer analyzer = new StringAnalyzer();
    assertEquals("l kommt 3 mal in Hello World vor.",3, analyzer.findOccurence("Hello World", 'l'));
  }

  @Test
  public void testCharacterNotFound() {
    StringAnalyzer analyzer = new StringAnalyzer();
    assertEquals("Z kommt nicht in Hello World vor.",0, analyzer.findOccurence("hello world", 'z'));
  }

  @Test
  public void testCharacterFound2() {
    StringAnalyzer analyzer = new StringAnalyzer();
    assertEquals(". kommt 2 mal in www.dhbw-stuttgart.de vor.",2, analyzer.findOccurence("www.dhbw-stuttgart.de", '.'));
  }
}
