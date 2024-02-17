import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    // put your test here
    String test[] = new String[11];
    Kurs kurs1 = new Kurs("Java 1",true);
    Kurs kurs2 = new Kurs("Java 2", false);
    for (int i = 0; i < 11; i++) {
      kurs1.addTeilnehmer("Johannes"+i);
      test[i] = "Johannes"+i;
    }
    Assert.assertArrayEquals(test,kurs1.getTeilnehmer());
    kurs2.setKostenlos(true);
    Assert.assertTrue(kurs2.isKostenlos());
    Assert.assertEquals("Java 2",kurs2.getTitel());
  }
}