import org.junit.Assert;
import org.junit.Test;

public class Tests {

  @Test
  public void testIsPalindrome1() {
    Assert.assertEquals("Hallo ist kein Palindrom",false, CheckPalindrome.isPalindrome("Hello"));
  }

  @Test
  public void testIsPalindrome2() {
    Assert.assertEquals("Uhu ist ein Palindrom",true, CheckPalindrome.isPalindrome("Uhu"));
  }

  @Test
  public void testIsPalindrome3() {
    Assert.assertEquals("Radar ist ein Palindrom",true, CheckPalindrome.isPalindrome("Radar"));
  }

  @Test
  public void testIsPalindrome4() {
    Assert.assertEquals("DHBW ist kein Palindrome",false, CheckPalindrome.isPalindrome("DHBW"));
  }
}
