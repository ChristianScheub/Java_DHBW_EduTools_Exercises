import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class A3Test extends ConsoleIOBaseTest {

  @Test
  public void testReverseString() {
    StringTasksReverse tasks = new StringTasksReverse();
    assertEquals("olleh", tasks.reverseString("hello"));
    assertEquals("tac", tasks.reverseString("cat"));
  }
}