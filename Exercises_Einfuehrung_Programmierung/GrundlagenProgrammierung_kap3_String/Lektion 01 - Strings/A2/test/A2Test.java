import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class A2Test extends ConsoleIOBaseTest {

  @Test
  public void testCountCharacterOccurrences() {
    StringCharacters tasks = new StringCharacters();
    assertEquals(3, tasks.countCharacterOccurrences("banana", 'a'));
    assertEquals(0, tasks.countCharacterOccurrences("apple", 'z'));
  }
}