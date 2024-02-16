import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Tests {
  private static final BruchRechnung br = new BruchRechnung();
  private static final Pattern BRUCHFINDER = Pattern.compile("\\d+/\\d+ = \\d+");

    @Test
  public void testSolution() {
    Assert.assertEquals("Fehler in init(). zurück gegebener Bruch ist ungleich equivalenten Bruch",new Bruch(1,9),br.init(1,9));
    Bruch bruch = new Bruch(1,9);
    Assert.assertTrue("ToString gibt einen leeren String oder null zurück", !Objects.equals(bruch.toString(), "") ||br.init(1,9)!=null);
    String bruchStr = bruch.toString();
    Matcher matcher = BRUCHFINDER.matcher(bruchStr);
    Assert.assertTrue("toString folgt nicht dem Muster des Javadocs", matcher.find());
    Assert.assertEquals(bruch,br.kuerzen(new Bruch(9,81)));
    Assert.assertEquals(new Bruch(2,9),br.addTo(bruch,bruch));
    Assert.assertEquals(new Bruch(7,10),br.addTo(new Bruch(1,5),new Bruch(2,4)));
    Assert.assertEquals(new Bruch(1,81),br.multTo(bruch,bruch));
    Assert.assertEquals(new Bruch(8,15),br.multTo(new Bruch(2,3),new Bruch(4,5)));
    Assert.assertEquals(new Bruch(1,9),br.multTo(bruch,new Bruch(9,9)));
  }
}