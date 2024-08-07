import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import de.hans.wif.lectures.test.utils.ReflectionHelper;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BruttoNettoTests extends ConsoleIOBaseTest {
    private final static String TEST_CASE_A = "20" + System.lineSeparator();

    private final static String TEST_CASE_B = "10" + System.lineSeparator();

    private final static String TEST_CASE_C = "-5" + System.lineSeparator();

    @Test
    public void testCaseA() {
        flush();
        simulateInput(TEST_CASE_A);

        ReflectionHelper.invokeMain("BruttoNetto");

        final String output = getLastConsoleOutput();

        assertEquals("Fehlerhafte Ausgabe gefunden!",
                "Bei einem Bruttopreis von 20.0EUR betraegt der Nettopreis bei 19.0% MwSt genau 16.80672268907563EUR",
                output);
    }

    @Test
    public void testCaseB() {
        flush();
        simulateInput(TEST_CASE_B);

        ReflectionHelper.invokeMain("BruttoNetto");

        final String output = getLastConsoleOutput();

        assertEquals("Fehlerhafte Ausgabe gefunden!",
                "Bei einem Bruttopreis von 10.0EUR betraegt der Nettopreis bei 19.0% MwSt genau 8.403361344537815EUR",
                output);
    }

    @Test
    public void testCaseC() {
        flush();
        simulateInput(TEST_CASE_C);

        ReflectionHelper.invokeMain("BruttoNetto");

        final String output = getLastConsoleOutput();

        assertEquals("Fehlerhafte Ausgabe gefunden!",
                "Bei einem Bruttopreis von -5.0EUR betraegt der Nettopreis bei 19.0% MwSt genau -4.201680672268908EUR",
                output);
    }

}