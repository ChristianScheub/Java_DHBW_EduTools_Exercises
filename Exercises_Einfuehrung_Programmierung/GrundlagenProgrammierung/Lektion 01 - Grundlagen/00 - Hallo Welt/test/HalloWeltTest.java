import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HalloWeltTest extends ConsoleIOBaseTest {

    @Test
    public void test_01_Output() {
        flush();
        HalloWelt.main(new String[0]);
        final String output = getConsoleOutput(true);

        Assert.assertEquals("Achten Sie auf den genauen Wortlaut der Ausgabe auf der Konsole. Ihre Ausgabe '" + output + "' stimmt nicht mit der in der Aufgabenstellung geforderten überein!",
                "Hallo Welt!",
                output);
    }
}
