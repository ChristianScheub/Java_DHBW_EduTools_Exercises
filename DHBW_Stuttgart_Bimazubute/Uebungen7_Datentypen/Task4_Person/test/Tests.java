import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Person person = new Person("Pfleiderer", "Johann", 71032, "Sindelfinger Strasse", 42);
    Assert.assertEquals("Pfleiderer",person.getName());
    Assert.assertEquals("Johann",person.getVorname());
    Assert.assertEquals(71032,person.getPLZ());
    Assert.assertEquals("Sindelfinger Strasse",person.getStrasse());
    Assert.assertEquals(42,person.getHausNummer());
  }
}