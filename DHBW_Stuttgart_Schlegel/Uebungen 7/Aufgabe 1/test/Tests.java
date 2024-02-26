import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Tests {
    private static final BruchRechnung br = new BruchRechnung();
    private static final Pattern BRUCHFINDER = Pattern.compile("\\d+/\\d+ = \\d+");

    @Test
    public void testInit() {
        Assert.assertEquals("Fehler in init(). Zurückgegebener Bruch ist ungleich dem erwarteten Bruch.", new Bruch(1, 9), br.init(1, 9));
    }

    @Test
    public void testToString() {
        Bruch bruch = new Bruch(1, 9);
        Assert.assertTrue("ToString gibt einen leeren String oder null zurück", !bruch.toString().isEmpty() || bruch.toString() != null);
    }

    @Test
    public void testToStringPattern() {
        Bruch bruch = new Bruch(1, 9);
        String bruchStr = bruch.toString();
        Matcher matcher = BRUCHFINDER.matcher(bruchStr);
        Assert.assertTrue("ToString folgt nicht dem Muster des Javadocs", matcher.find());
    }

    @Test
    public void testKuerzen() {
        Bruch bruch = new Bruch(1, 9);
        Assert.assertEquals("Fehler beim Kürzen des Bruchs", bruch, br.kuerzen(new Bruch(9, 81)));
    }

    @Test
    public void testAddTo() {
        Bruch bruch = new Bruch(1, 9);
        Assert.assertEquals("Fehler beim Addieren von Brüchen", new Bruch(2, 9), br.addTo(bruch, bruch));
        Assert.assertEquals("Fehler beim Addieren von Brüchen", new Bruch(7, 10), br.addTo(new Bruch(1, 5), new Bruch(2, 4)));
    }

    @Test
    public void testMultTo() {
        Bruch bruch = new Bruch(1, 9);
        Assert.assertEquals("Fehler beim Multiplizieren von Brüchen", new Bruch(1, 81), br.multTo(bruch, bruch));
        Assert.assertEquals("Fehler beim Multiplizieren von Brüchen", new Bruch(8, 15), br.multTo(new Bruch(2, 3), new Bruch(4, 5)));
        Assert.assertEquals("Fehler beim Multiplizieren von Brüchen", new Bruch(1, 9), br.multTo(bruch, new Bruch(9, 9)));
    }
}