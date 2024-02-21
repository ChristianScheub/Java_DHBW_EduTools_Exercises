import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class Tests {
  @Test
  public void testSolution() {

    Paar<String, Integer> paar1 = new Paar<>("Hallo", 1);

    Assert.assertEquals("Hallo",paar1.getAttribut1());
    Assert.assertTrue(paar1.getAttribut2() == 1);

    Paar<String, Paar<String, Integer>> paar2 = new Paar<>("Hi", paar1);
    Assert.assertEquals("Hi", paar2.getAttribut1());
    Assert.assertEquals(paar1, paar2.getAttribut2());

  }
}