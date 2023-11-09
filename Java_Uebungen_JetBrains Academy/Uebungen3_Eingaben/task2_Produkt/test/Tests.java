import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Tests {
  @Test
  public void testAdditionWithFive() {

    Assert.assertEquals("Produkt von 5 gleich 120",120, Product.multiInt(5));

  }

  @Test
  public void testProductWithNull() {

    Assert.assertEquals("Produkt von 0 gleich 1",1, Product.multiInt(0));

  }

  @Test
  public void testProductWithOne() {

    Assert.assertEquals("Produkt von 1 gleich 1",1, Product.multiInt(1));

  }

}
