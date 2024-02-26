import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Dokument dokument = new Dokument(null,"","test test test");
    Assert.assertEquals(null,dokument.getAuthor());
    Assert.assertEquals("",dokument.getTitle());
    Assert.assertEquals("test test test",dokument.getInhalt());
  }
}