import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class A1Test extends ConsoleIOBaseTest {

  @Test
  public void testGetCharacterAtValidIndex() {
    StringTasks tasks = new StringTasks();
    assertEquals('a', tasks.getCharacterAt("apple", 0));
  }

}
