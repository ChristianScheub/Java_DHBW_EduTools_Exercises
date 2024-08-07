import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import de.hans.wif.lectures.test.utils.ReflectionHelper;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.text.NumberFormat;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErroneousJavaTests extends ConsoleIOBaseTest {

  @Test
  public void test_Implementation_and_Output() {
    flush();

    try {
      ReflectionHelper.invokeMain("ErroneousJava", true, true);
    } catch (AssertionError e) {
      Assert.fail(e.getMessage());
    }

    Assert.assertEquals(
            "Die Ausgabe Ihres Programms stimmt nicht mit der erwarteten Ausgabe überein. Prüfen Sie Ihr Programm, ob dieses dem vorgegebenen Code entspricht!",
            "v = " + NumberFormat.getInstance().format(10.67),
            getConsoleOutput(true)
    );
  }

}
