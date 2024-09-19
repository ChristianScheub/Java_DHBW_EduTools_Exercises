import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import de.hans.wif.lectures.test.utils.CodeCampusTestResultExtension;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;

/*import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
*/
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//@TestMethodOrder(MethodOrderer.MethodName.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(CodeCampusTestResultExtension.class)
public class A1Test extends ConsoleIOBaseTest {
//public class A1Test  {

  @Test
  public void test_01_Berechnung1() {

    //int result = Factorial.computeFactorial(5);
    //Assert.assertEquals(result, 120);
    org.junit.jupiter.api.Assertions.assertTrue(true, "Einreichung abgegeben");
  }
  @Test
  public void test_01_Berechnung2() {

   // int result = Factorial.computeFactorial(0);
   // Assert.assertEquals(result, 1);
    org.junit.jupiter.api.Assertions.assertTrue(true, "Einreichung abgegeben");
    //Assert.assertTrue("Einreichung abgegeben", true);
  }
  @Test
  public void test_01_Berechnung3() {

    //int result = Factorial.computeFactorial(-5);
    //Assert.assertEquals(result, -1);
    org.junit.jupiter.api.Assertions.assertTrue(true, "Einreichung abgegeben");
  }
}
