import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import org.junit.Assert;
import org.junit.Test;

public class FormulaTests extends ConsoleIOBaseTest {
    private final static String TEST_CASE_A = "1" + System.lineSeparator();

    private final static String TEST_CASE_B = "2" + System.lineSeparator();

    private final static String TEST_CASE_C = "-5" + System.lineSeparator();

    @Test
    public void testA() {
        flush();
        simulateInput(TEST_CASE_A);

        Formula.main(new String[] {});

        Assert.assertEquals(
                "Fehlerhafte Ausgabe gefunden!",
                "Bei x = 1.0 ergibt die Gleichung den Wert -1.0",
                getLastConsoleOutput()
        );
    }

    @Test
    public void testB() {
        flush();
        simulateInput(TEST_CASE_B);

        Formula.main(new String[] {});

        Assert.assertEquals(
                "Fehlerhafte Ausgabe gefunden!",
                "Bei x = 2.0 ergibt die Gleichung den Wert 0.0",
                getLastConsoleOutput()
        );
    }


    @Test
    public void testC() {
        flush();
        simulateInput(TEST_CASE_C);

        Formula.main(new String[] {});

        Assert.assertEquals(
                "Fehlerhafte Ausgabe gefunden!",
                "Bei x = -5.0 ergibt die Gleichung den Wert 119.0",
                getLastConsoleOutput()
        );
    }
}
