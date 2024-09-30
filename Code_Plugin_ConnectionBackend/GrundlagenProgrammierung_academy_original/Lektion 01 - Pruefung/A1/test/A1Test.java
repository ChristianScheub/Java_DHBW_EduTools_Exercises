import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import de.hans.wif.lectures.test.utils.CodeCampusTestResultExtension;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(CodeCampusTestResultExtension.class)
public class A1Test extends ConsoleIOBaseTest {

  @Test
  public void test_01_Berechnung1() {

    int result = Factorial.computeFactorial(5);
    assertEquals(result, 120);

  }
  @Test
  public void test_01_Berechnung2() {

    int result = Factorial.computeFactorial(0);
   assertEquals(result, 1);
    org.junit.jupiter.api.Assertions.assertTrue(true, "Einreichung abgegeben");
  }
  @Test
  public void test_01_Berechnung3() {

    int result = Factorial.computeFactorial(-5);
    assertEquals(result, -1);

  }
}
