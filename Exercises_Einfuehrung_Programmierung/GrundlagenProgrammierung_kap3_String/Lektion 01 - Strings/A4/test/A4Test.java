import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class A4Test extends ConsoleIOBaseTest {

  @Test
  public void testCountWords() {
    WordsSentence tasks = new WordsSentence();
    assertEquals(5, tasks.countWords("This is a test sentence"));
    assertEquals(1, tasks.countWords("Word"));
    assertEquals(0, tasks.countWords(""));
  }
}