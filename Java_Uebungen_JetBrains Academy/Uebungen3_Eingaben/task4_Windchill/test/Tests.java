import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Tests {
  @Test
  public void testWindchill() {

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
    Windchill.main(new String[]{"8","20"});

    String expected = "4.85";

    Assert.assertEquals("The Windchill with t=8 and v=20 should be 4.85",expected, outputStream.toString());

  }

}
