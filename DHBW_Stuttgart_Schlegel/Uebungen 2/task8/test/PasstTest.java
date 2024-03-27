import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PasstTest {

  @Test
  public void testVergleichenPassen() {
    char klein = 'a';
    char gross = 'A';

    String result = Passt.vergleichen(klein, gross);

    assertEquals("passen", result);
  }

  @Test
  public void testVergleichenPassenNicht() {
    char klein = 'a';
    char gross = 'B';

    String result = Passt.vergleichen(klein, gross);

    assertEquals("passen nicht", result);
  }
}