import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Tests {
  @Test
  public void testSolution() {
    Assert.assertEquals("17 ist eine Primzahl",true,Task.testIterativ(17));
  }

  @Test
  public void testSolution1() {
    Assert.assertEquals("18 ist keine Primzahl",false,Task.testIterativ(18));
  }

}