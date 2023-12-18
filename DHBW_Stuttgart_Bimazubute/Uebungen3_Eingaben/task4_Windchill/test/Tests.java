import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Tests {
  @Test
  public void testWindchill() {

    Assert.assertEquals("Der Windchill mit t=8 und v=20 ist 4.85", 4.85, Windchill.calcWindchill(8,20));

  }

}
