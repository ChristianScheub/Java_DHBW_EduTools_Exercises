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

    double[] input = new double[]{0.0, 1.0, -5.0};
    double result = Minimum.computeMinumum(input);
    assertEquals(result, -5.0, 0.0);
      }
  @Test
  public void test_01_minimun2() {
    double[] input = new double[]{};
    double result = Minimum.computeMinumum(input);
    assertEquals(result, Double.NaN, 0.0);

  }
  @Test
  public void test_01_Berechnung3() {
    double[] input = null;
    double result = Minimum.computeMinumum(input);
    assertEquals(result, Double.NaN, 0.0);

  }
}
