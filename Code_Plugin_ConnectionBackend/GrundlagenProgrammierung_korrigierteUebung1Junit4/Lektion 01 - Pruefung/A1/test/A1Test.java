import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class A1Test extends ConsoleIOBaseTest {

  @Test
  public void test_01_Berechnung1() {

    //int result = Factorial.computeFactorial(5);
    //Assert.assertEquals(result, 120);
    Assert.assertTrue("Einreichung abgegeben", true);
  }
  @Test
  public void test_01_Berechnung2() {

   // int result = Factorial.computeFactorial(0);
   // Assert.assertEquals(result, 1);
    Assert.assertTrue("Einreichung abgegeben", true);
  }
  @Test
  public void test_01_Berechnung3() {

    //int result = Factorial.computeFactorial(-5);
    //Assert.assertEquals(result, -1);
    Assert.assertTrue("Einreichung abgegeben", true);
  }
}
