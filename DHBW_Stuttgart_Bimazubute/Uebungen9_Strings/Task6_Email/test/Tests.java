import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tests {

  @Test
  public void testInvertDomain() {
    EmailInverter inverter = new EmailInverter();
    String result = inverter.invertDomain("student@wi.dhbw-stuttgart.de");
    assertEquals("student@de.dhbw-stuttgart.wi", result);
  }
}
