import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import de.hans.wif.lectures.test.utils.ReflectionHelper;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RectCalculatorTests extends ConsoleIOBaseTest {

  @Test
  public void test_Implementation_and_Output() {
    flush();

    try {
      ReflectionHelper.invokeMain("RectCalculator", true, true);
    } catch (AssertionError e) {
      Assert.fail(e.getMessage());
    }

    Assert.assertEquals(
            "Die Ausgabe Ihres Programms stimmt nicht mit der erwarteten Ausgabe überein. Prüfen Sie Ihr Programm, ob dieses dem vorgegebenen Code entspricht!",
            "Der Wert von u lautet: 14 " + "Der Wert von f lautet: 12",
            getConsoleOutput(true)
    );
  }

}