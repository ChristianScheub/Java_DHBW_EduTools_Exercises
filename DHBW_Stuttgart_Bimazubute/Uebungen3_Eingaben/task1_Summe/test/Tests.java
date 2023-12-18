import org.junit.Assert;
import org.junit.Test;

public class Tests {

  @Test
  public void testAdditionWithFive() {

    Assert.assertEquals("Summe von 5 gleich 15", 15, Summe.sumInt(5));

  }

  @Test
  public void testAdditionWithNull() {

    Assert.assertEquals("Summe von 0 gleich 0", 0,  Summe.sumInt(0));

  }

  @Test
  public void testAdditionWithOne() {

    Assert.assertEquals("Summe von 1 gleich 1", 1, Summe.sumInt(1));

  }

}
