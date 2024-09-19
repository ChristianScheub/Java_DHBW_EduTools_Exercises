import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
  @Test
  public void testGenerateDiamond() {
    int n = 3;
    String expected =
            "  *\n" +
                    " ***\n" +
                    "*****\n" +
                    " ***\n" +
                    "  *\n";

    String actual = DiamondShape.generateDiamond(n);
    assertEquals(expected, actual);
  }

  @Test
  public void testGenerateDiamondWithHeight5() {
    int n = 5;
    String expected =
            "    *\n" +
                    "   ***\n" +
                    "  *****\n" +
                    " *******\n" +
                    "*********\n" +
                    " *******\n" +
                    "  *****\n" +
                    "   ***\n" +
                    "    *\n";

    String actual = DiamondShape.generateDiamond(n);
    assertEquals(expected, actual);
  }

  @Test
  public void testGenerateDiamondWithHeight1() {
    int n = 1;
    String expected = "*\n";

    String actual = DiamondShape.generateDiamond(n);
    assertEquals(expected, actual);
  }
}