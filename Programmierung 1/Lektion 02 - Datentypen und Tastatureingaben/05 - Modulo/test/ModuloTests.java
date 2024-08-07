import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import de.hans.wif.lectures.test.utils.ReflectionHelper;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ModuloTests extends ConsoleIOBaseTest {

    public ModuloTests() {
        super(Modulo.class);
    }

    @Test
    public void testOutput() {
        flush();

        ReflectionHelper.invokeMain("Modulo");

        final String[] lines = getLastConsoleOutput(2);

        assertEquals("Gebrochener Anteil nicht korrekt",
                0.14150000000000018,
                Double.parseDouble(lines[0]),
                0.00000000000000001);

        assertEquals("Ganzzahliger Anteil nicht korrekt",
                3.0,
                Double.parseDouble(lines[1]),
                0.00000000000000001);
    }

    @Test
    public void testNoMethodsOfClassMathUsed() {
        final var method = getMethodBody("main");
        final var matcher = Pattern.compile("Math.*;")
                .matcher(method);

        if (matcher.find()) {
            final var code = method.substring(
                    matcher.start(),
                    matcher.end()
            );

            assertEquals("no use of class Math",
                    code);
        }
    }
}