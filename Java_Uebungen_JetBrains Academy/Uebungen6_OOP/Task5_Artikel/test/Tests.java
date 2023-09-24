import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testArtikel() {
    Artikel artikel = new Artikel(1, 10.0);
    Assert.assertEquals(1, artikel.getId());
    Assert.assertEquals(10.0, artikel.getPreis(), 0.001);
  }

  @Test
  public void testAuftrag() {
    Artikel artikel = new Artikel(2, 20.0);
    Auftrag auftrag = new Auftrag(artikel, 5);
    Assert.assertEquals(5, auftrag.getMenge());
    Assert.assertEquals(artikel, auftrag.getArtikel());
  }

  @Test
  public void testGesamtwert() {
    Artikel a1 = new Artikel(1, 10.0);
    Artikel a2 = new Artikel(2, 20.0);

    Auftrag auf1 = new Auftrag(a1, 2);
    Auftrag auf2 = new Auftrag(a2, 3);

    double gesamtwert = Auftrag.getGesamtwert(auf1, auf2);
    Assert.assertEquals(90.0, gesamtwert, 0.001);
  }
}
