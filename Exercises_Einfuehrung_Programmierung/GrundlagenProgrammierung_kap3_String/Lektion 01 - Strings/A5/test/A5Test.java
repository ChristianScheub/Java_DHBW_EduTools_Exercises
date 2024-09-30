import de.hans.wif.lectures.test.utils.ConsoleIOBaseTest;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class A5Test extends ConsoleIOBaseTest {

  @Test
  public void testIsPalindrome() {
    StringPalindrom tasks = new StringPalindrom();
    assertTrue(tasks.isPalindrome("madam"));
    assertTrue(tasks.isPalindrome("A man a plan a canal Panama"));
    assertFalse(tasks.isPalindrome("hello"));
  }
}