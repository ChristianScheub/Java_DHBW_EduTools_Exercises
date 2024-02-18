import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testAddTeilnehmer() {
    Kurs kurs = new Kurs("Java 1", true);
    String[] expectedTeilnehmer = new String[11];
    for (int i = 0; i < 11; i++) {
      String teilnehmerName = "Johannes" + i;
      kurs.addTeilnehmer(teilnehmerName);
      expectedTeilnehmer[i] = teilnehmerName;
    }
    Assert.assertArrayEquals("Teilnehmer konnten nicht gesetzt werden",expectedTeilnehmer, kurs.getTeilnehmer());
  }

  @Test
  public void testSetKostenlos() {
    Kurs kurs = new Kurs("Java 2", false);
    kurs.setKostenlos(true);
    Assert.assertTrue("Kurs konnte nicht kostenlos gesetzt werden",kurs.isKostenlos());
  }

  @Test
  public void testGetTitel() {
    Kurs kurs = new Kurs("Java 2", false);
    Assert.assertEquals("Kurs Titel konnte nicht gesetzt werden","Java 2", kurs.getTitel());
  }
}