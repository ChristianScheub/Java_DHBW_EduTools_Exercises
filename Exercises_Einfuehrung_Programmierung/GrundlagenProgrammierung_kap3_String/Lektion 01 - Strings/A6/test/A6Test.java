import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class A6Test extends ConsoleIOBaseTest {

  @Test
  public void testGetOrdinalValue() {
    assertEquals(0, MonthEnum.JANUARY.getOrdinalValue());
    assertEquals(1, MonthEnum.FEBRUARY.getOrdinalValue());
    assertEquals(2, MonthEnum.MARCH.getOrdinalValue());
  }
}