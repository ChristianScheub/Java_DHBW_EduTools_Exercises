import org.junit.Assert;
import org.junit.Test;

public class Tests {

  @Test
  public void testIsPalindrome() {
    Assert.assertTrue(CheckPalindrome.isPalindrome("aaabaaa"));
    Assert.assertFalse(CheckPalindrome.isPalindrome("hello"));
    Assert.assertTrue(CheckPalindrome.isPalindrome("Uhu"));
    Assert.assertTrue(CheckPalindrome.isPalindrome("Radar"));
    Assert.assertFalse(CheckPalindrome.isPalindrome("DHBW"));

  }
}
