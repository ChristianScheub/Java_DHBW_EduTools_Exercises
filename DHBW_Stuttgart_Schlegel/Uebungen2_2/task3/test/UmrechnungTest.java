import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UmrechnungTest {

  @Test
  public void testCelsiusToFahrenheit() {
    float celsius = 20.0f;
    float expectedFahrenheit = 68.0f;

    float actualFahrenheit = Umrechnung.celsiusToFahrenheit(celsius);

    assertEquals(expectedFahrenheit, actualFahrenheit, 0.001f);
  }
}