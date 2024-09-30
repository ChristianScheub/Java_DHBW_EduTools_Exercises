import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class A7Test extends ConsoleIOBaseTest {

  @Test
  public void testGetVehicleName() {
    assertEquals("CAR", Vehicle.CAR.getVehicleName());
    assertEquals("MOTORCYCLE", Vehicle.MOTORCYCLE.getVehicleName());
    assertEquals("TRUCK", Vehicle.TRUCK.getVehicleName());
  }
}