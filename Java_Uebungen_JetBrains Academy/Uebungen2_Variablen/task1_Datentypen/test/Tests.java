import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testInitialization() {
    Task pt = new Task();

    Assert.assertNotNull("intVal sollte initialisiert werden.", pt.intVal);
    Assert.assertNotNull("byteVal sollte initialisiert werden.", pt.byteVal);
    Assert.assertNotNull("shortVal sollte initialisiert werden.", pt.shortVal);
    Assert.assertNotNull("longVal sollte initialisiert werden.", pt.longVal);
    Assert.assertNotNull("floatVal sollte initialisiert werden.", pt.floatVal);
    Assert.assertNotNull("doubleVal sollte initialisiert werden.", pt.doubleVal);
    Assert.assertNotNull("charVal sollte initialisiert werden.", pt.charVal);
    Assert.assertNotNull("boolVal sollte initialisiert werden.", pt.boolVal);
  }
}
