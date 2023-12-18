import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    double startBalance = 500.0;
    double interestRate = 0.09;
    double expectedBalance = startBalance * Math.pow(1 + interestRate, 2);
    Assert.assertEquals("Die Zinsrechnung ist nicht korrekt.", expectedBalance, Task.calculateInterest(), 0.01);
  }
}
