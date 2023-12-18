import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testMessage() {
    String expectedMessage = "Hallo Edu!";
    String actualMessage = Task.getMessage();

    Assert.assertEquals("Die Nachricht sollte 'Hallo Edu!' sein.", expectedMessage, actualMessage);
  }
}
