import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;

public class Tests {

  @Test
  public void testSolution() {
    ArrayList<Konto> konten = new ArrayList<>();
    konten.add(new Konto(5122));
    konten.add(new Konto(5123));
    konten.add(new Konto(2233));
    konten.add(new Konto(1282));
    konten.add(new Konto(23));
    konten.add(new Konto(10277));

    Konto konto = new Konto();
    ArrayList<Konto> sortKontenByStudentMethod = konto.sortKonten(konten);

    Collections.sort(konten);

    Assert.assertEquals(konten,sortKontenByStudentMethod);


  }
}