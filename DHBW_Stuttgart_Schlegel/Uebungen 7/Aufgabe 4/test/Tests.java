import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    // put your test here
    Circle circle1 = new Circle(1,1,1,true);
    Assert.assertEquals(circle1,circle1.clone());

  }
}