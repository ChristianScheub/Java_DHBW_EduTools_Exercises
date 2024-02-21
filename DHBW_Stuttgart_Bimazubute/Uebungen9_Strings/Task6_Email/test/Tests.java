import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Tests {

  @Test
  public void testInvertDomain() {
    EmailInverter inverter = new EmailInverter();
    assertEquals("student@wi.dhbw-stuttgart.de sollte zu student@de.dhbw-stuttgart.wi konvertiert werden.","student@de.dhbw-stuttgart.wi", inverter.invertDomain("student@wi.dhbw-stuttgart.de"));
  }
}
