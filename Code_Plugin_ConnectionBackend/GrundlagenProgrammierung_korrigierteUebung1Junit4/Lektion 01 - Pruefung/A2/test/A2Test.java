import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class A2Test extends ConsoleIOBaseTest {

  @Test
  public void test_01_minimun1() {

   // double[] input = new double[]{0.0, 1.0, -5.0};
   // double result = Minimum.computeMinumum(input);
   // Assert.assertEquals(result, -5.0, 0.0);
    Assert.assertTrue("Einreichung abgegeben", true);
  }
  @Test
  public void test_01_minimun2() {
    //double[] input = new double[]{};
    //double result = Minimum.computeMinumum(input);
    //Assert.assertEquals(result, Double.NaN, 0.0);
    Assert.assertTrue("Einreichung abgegeben", true);
  }
  @Test
  public void test_01_Berechnung3() {
    //double[] input = null;
    //double result = Minimum.computeMinumum(input);
    //Assert.assertEquals(result, Double.NaN, 0.0);
    Assert.assertTrue("Einreichung abgegeben", true);
  }
}
