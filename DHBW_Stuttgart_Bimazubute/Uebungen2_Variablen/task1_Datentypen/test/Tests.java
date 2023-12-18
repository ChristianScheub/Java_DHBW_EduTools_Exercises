import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testInitialization() {
    Task pt = new Task();
    Assert.assertNotEquals("intVal sollte initialisiert werden.", 0, pt.intVal);
    Assert.assertNotEquals("byteVal sollte initialisiert werden.", 0, pt.byteVal);
    Assert.assertNotEquals("shortVal sollte initialisiert werden.", 0, pt.shortVal);
    Assert.assertNotEquals("longVal sollte initialisiert werden.", 0L, pt.longVal);
    Assert.assertNotEquals("floatVal sollte initialisiert werden.", 0.0f, pt.floatVal, 0.0);
    Assert.assertNotEquals("doubleVal sollte initialisiert werden.", 0.0, pt.doubleVal, 0.0);
    Assert.assertNotEquals("charVal sollte initialisiert werden.", '\0', pt.charVal);
    Assert.assertNotEquals("boolVal sollte initialisiert werden.", false, pt.boolVal);

  }
}
