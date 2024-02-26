import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Tests {
  public Werkstatt werkstattAssembler(){
    Werkstatt werkstatt = new Werkstatt(10);

    for (int i = 0; i < 10; i++) {
      Fahrzeug fahrzeug = new Fahrzeug("Audi rs "+i,"Robert Geisen");
      werkstatt.addFahrzeug(fahrzeug,i);
      test[i] = fahrzeug;
    }
    return werkstatt;
  }
  @Test
  public void testFahrzeug() {
    Fahrzeug fahrzeug = new Fahrzeug("Audi","Thomas");
    Assert.assertEquals("Audi",fahrzeug.getTyp());
    Assert.assertEquals("Thomas",fahrzeug.getEigentuemer());
  }
  private final Fahrzeug[] test = new Fahrzeug[10];
  @Test
  public void testWerkstatt() {
    Werkstatt werkstatt = werkstattAssembler();
    Assert.assertArrayEquals(test,werkstatt.getFahrzeuge());
    for (int i = 0; i < 10; i++) {
      werkstatt.removeFahrzeug(i);
      test[i] = null;
    }
    Assert.assertArrayEquals(test, werkstatt.getFahrzeuge());
  }
  private final Pattern FAHRZEUGLISTE = Pattern.compile("^(Platz)?\\s*(:)?\\s*\\d+\\s+Fahrzeug\\{.+}$");
  @Test
  public void testListe(){
    Werkstatt werkstatt = werkstattAssembler();
    Matcher matcher = FAHRZEUGLISTE.matcher(werkstatt.druckeListe());
    Assert.assertTrue(matcher.find());
  }
}