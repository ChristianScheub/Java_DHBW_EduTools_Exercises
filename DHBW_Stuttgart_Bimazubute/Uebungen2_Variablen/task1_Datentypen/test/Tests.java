import org.junit.Assert;
import org.junit.Test;


public class Tests {
  @Test
  public void testInitialization() {
    Datatypes datatypes = new Datatypes();
    Assert.assertNotEquals("intVal sollte initialisiert werden.", null, datatypes.intVal);
    Assert.assertNotEquals("byteVal sollte initialisiert werden.", null, datatypes.byteVal);
    Assert.assertNotEquals("shortVal sollte initialisiert werden.", null, datatypes.shortVal);
    Assert.assertNotEquals("longVal sollte initialisiert werden.", null, datatypes.longVal);
    Assert.assertNotEquals("floatVal sollte initialisiert werden.", null, datatypes.floatVal);
    Assert.assertNotEquals("doubleVal sollte initialisiert werden.", null, datatypes.doubleVal);
    Assert.assertNotEquals("charVal sollte initialisiert werden.", null, datatypes.charVal);
    Assert.assertNotEquals("boolVal sollte initialisiert werden.", null, datatypes.boolVal);
  }

  @Test
  public void testDatatypes() {
    Datatypes datatypes = new Datatypes();
    Assert.assertEquals("intVal sollte vom Typ Integer sein", "Integer", ((Object) datatypes.intVal).getClass().getSimpleName());
    Assert.assertEquals("byteVal sollte vom Typ Byte sein", "Byte", ((Object) datatypes.byteVal).getClass().getSimpleName());
    Assert.assertEquals("shortVal sollte vom Typ Short sein", "Short", ((Object) datatypes.shortVal).getClass().getSimpleName());
    Assert.assertEquals("longVal sollte vom Typ Long sein", "Long", ((Object) datatypes.longVal).getClass().getSimpleName());
    Assert.assertEquals("floatVal sollte vom Typ Float sein", "Float", ((Object) datatypes.floatVal).getClass().getSimpleName());
    Assert.assertEquals("doubleVal sollte vom Typ Double sein", "Double", ((Object) datatypes.doubleVal).getClass().getSimpleName());
    Assert.assertEquals("charVal sollte vom Typ Character sein.", "Character", ((Object) datatypes.charVal).getClass().getSimpleName());
    Assert.assertEquals("boolVal sollte vom Typ Boolean sein.", "Boolean", ((Object) datatypes.boolVal).getClass().getSimpleName());
  }
}
