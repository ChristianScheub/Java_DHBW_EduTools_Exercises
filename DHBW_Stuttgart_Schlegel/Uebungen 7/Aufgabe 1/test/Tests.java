import org.junit.Assert;
import org.junit.Test;

public class Tests {
  private static final BruchRechnung br = new BruchRechnung();
  @Test
  public void testSolution() {
    Assert.assertTrue("",equals(br.init(1,9),new Bruch(1,9)));
  }
  public boolean equals(Bruch bruch1,Bruch bruch2) {
    return bruch1.getNenner() == bruch2.getNenner() && bruch1.getZaehler() == bruch2.getNenner();
  }
}