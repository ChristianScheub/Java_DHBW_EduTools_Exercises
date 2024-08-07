import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import de.hans.wif.lectures.test.utils.ReflectionHelper;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CircleCalculatorTests extends ConsoleIOBaseTest {

    @Test
    public void test_Implementation_and_Output() {
        flush();

        try {
            ReflectionHelper.invokeMain("CircleCalculator", true, true);
        } catch (AssertionError e) {
            Assert.fail(e.getMessage());
        }

        Assert.assertEquals(
                "Die Ausgabe Ihres Programms stimmt nicht mit der erwarteten Ausgabe überein. Prüfen Sie Ihr Programm, ob dieses dem vorgegebenen Code entspricht!",
                "Der Wert von u lautet: 18,85, unformatiert: 18.849555921540002 Der Wert von f lautet: 28,27433, unformatiert: 28.274333882310003",
                getConsoleOutput(true)
        );
    }

}
