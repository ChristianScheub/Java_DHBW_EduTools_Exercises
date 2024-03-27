import junit.extensions.TestDecorator;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RateSpielTest {

  @Test
  public void testSpielen() {
    String input = "50\n" + "70\n" + "60\n";
    System.setIn(new ByteArrayInputStream(input.getBytes()));
    Scanner scan = new Scanner(System.in);

    RateSpiel.spielen(scan);

    // Überprüfen, ob die Ausgabe die erwartete Nachricht enthält
    TestDecorator outContent = null;
    assertTrue(outContent.toString().contains("Nach 3 Tipp(s) haben Sie einen Treffer gelandet!"));
  }
}