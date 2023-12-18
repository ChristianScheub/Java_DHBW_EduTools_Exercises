import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InterestRateTests extends ConsoleIOBaseTest {

    private final static String TEST_CASE_A = "1000" + System.lineSeparator() +
            "1" + System.lineSeparator() +
            "1" + System.lineSeparator();

    private final static String TEST_CASE_B = "200" + System.lineSeparator() +
            "5" + System.lineSeparator() +
            "5" + System.lineSeparator();

    private final static String TEST_CASE_C = "5000" + System.lineSeparator() +
            "5" + System.lineSeparator() +
            "10" + System.lineSeparator();

    protected String getMessage(final String testCase) {
        final String[] lines = testCase.split(System.lineSeparator());

        return "Bei der Eingabe von " +
                "Start-Kapital = " + lines[0] +
                ", Zinssatz in % = " + lines[1] +
                ", Laufzeit = " + lines[2] +
                " ist ein Fehler aufgetreten! Pruefen Sie Ihr Programm mit diesen Werten!";
    }

    @Test
    public void testA() {
        flush();
        simulateInput(TEST_CASE_A);

        InterestRate.main(null);
        final String[] output = getLastConsoleOutput(2);
        final String message = getMessage(TEST_CASE_A);

        Assert.assertEquals(
                message,
                "Der Gewinn durch Zinsen betraegt: 10.0EUR",
                output[0]
        );

        Assert.assertEquals(
                message,
                "Nach 1 Jahren betraegt das angesparte Kapital 1010.0EUR",
                output[1]
        );
    }

    @Test
    public void testB() {
        flush();
        simulateInput(TEST_CASE_B);

        InterestRate.main(null);

        final String[] output = getLastConsoleOutput(2);
        final String message = getMessage(TEST_CASE_B);

        Assert.assertEquals(
                message,
                "Der Gewinn durch Zinsen betraegt: 55.256312500000064EUR",
                output[0]
        );

        Assert.assertEquals(
                message,
                "Nach 5 Jahren betraegt das angesparte Kapital 255.25631250000006EUR",
                output[1]
        );
    }

    @Test
    public void testC() {
        flush();
        simulateInput(TEST_CASE_C);

        InterestRate.main(null);

        final String[] output = getLastConsoleOutput(2);
        final String message = getMessage(TEST_CASE_C);

        Assert.assertEquals(
                message,
                "Der Gewinn durch Zinsen betraegt: 3144.4731338872098EUR",
                output[0]
        );

        Assert.assertEquals(
                message,
                "Nach 10 Jahren betraegt das angesparte Kapital 8144.47313388721EUR",
                output[1]
        );
    }
}