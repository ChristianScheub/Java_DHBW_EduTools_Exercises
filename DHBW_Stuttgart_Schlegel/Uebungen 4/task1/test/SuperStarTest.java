import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;

public class SuperStarTest {

  @Test
  public void testAnzahlAnrufe() {
    String input = "5";
    System.setIn(new ByteArrayInputStream(input.getBytes()));
    Scanner scan = new Scanner(System.in);

    int result = SuperStar.anzahlAnrufe(1);

    assertEquals(5, result);
  }
}
