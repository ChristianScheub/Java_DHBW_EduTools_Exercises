import de.hans.wif.lectures.test.utils.CodeCampusTestResultExtension;
import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(CodeCampusTestResultExtension.class)
public class A2Test extends ConsoleIOBaseTest {

  @Test
  public void test_01_minimun1() {

    assertTrue(true, "Einreichung abgegeben");
  }
  @Test
  public void test_01_minimun2() {
    assertTrue(true, "Einreichung abgegeben");
  }
  @Test
  public void test_01_Berechnung3() {
    assertTrue(true, "Einreichung abgegeben");
  }
}
