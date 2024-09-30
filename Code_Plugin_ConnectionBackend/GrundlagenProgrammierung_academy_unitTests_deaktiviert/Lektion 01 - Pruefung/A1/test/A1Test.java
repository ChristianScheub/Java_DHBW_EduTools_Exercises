import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import de.hans.wif.lectures.test.utils.CodeCampusTestResultExtension;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(CodeCampusTestResultExtension.class)
public class A1Test extends ConsoleIOBaseTest {
//public class A1Test  {

  @Test
  public void test_01_Berechnung1() {

    assertTrue(true, "Einreichung abgegeben");
  }
  @Test
  public void test_01_Berechnung2() {

   assertTrue(true, "Einreichung abgegeben");
  }
  @Test
  public void test_01_Berechnung3() {
   assertTrue(true, "Einreichung abgegeben");
  }
}
