import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class Tests {
  @Test
  public void testSolution() {

    Paar<String, Integer> paar = new Paar<>("Hallo", 1);

    Assert.assertEquals("Hallo",paar.getAttribut1());
    Assert.assertTrue(paar.getAttribut2() == 1);

  }
}