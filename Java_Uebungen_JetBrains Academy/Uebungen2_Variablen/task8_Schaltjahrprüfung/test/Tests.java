import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Assert.assertTrue("2000 sollte ein Schaltjahr sein.", Task.findLeapYear(2000));
    Assert.assertFalse("1900 sollte kein Schaltjahr sein.", Task.findLeapYear(1900));
    Assert.assertTrue("2004 sollte ein Schaltjahr sein.", Task.findLeapYear(2004));
    Assert.assertFalse("2001 sollte kein Schaltjahr sein.", Task.findLeapYear(2001));
  }
}
