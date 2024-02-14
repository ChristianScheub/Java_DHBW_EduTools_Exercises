import org.junit.Assert;
import org.junit.Test;

import org.junit.After;
import org.junit.Before;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class Tests {
  @Test
  public void testApfel() {
    Apfel apfel = new Apfel();
    Assert.assertEquals("Apfel", apfel.getName());
    Assert.assertEquals("Rot", apfel.getFarbe());
  }

  @Test
  public void testBirne() {
    Birne birne = new Birne();
    Assert.assertEquals("Birne", birne.getName());
    Assert.assertEquals("Gruen", birne.getFarbe());
  }

  @Test
  public void testOrange() {
    Orange orange = new Orange();
    Assert.assertEquals("Orange", orange.getName());
    Assert.assertEquals("Orange", orange.getFarbe());
  }

  @Test
  public void testObstlager() {
    Obstlager lager = new Obstlager();
    lager.addObst(new Apfel());
    lager.addObst(new Birne());
    lager.addObst(new Orange());

  }

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;
  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }

  @After
  public void restoreStreams() {
    System.setOut(originalOut);
  }
  @Test
  public void testPrintFunction() {
    Obstlager lager = new Obstlager();
    lager.addObst(new Apfel());
    lager.addObst(new Birne());
    lager.addObst(new Orange());

    lager.print();

    String expectedOutput = "Apfel Rot" + System.lineSeparator() +
            "Birne Gruen" + System.lineSeparator() +
            "Orange Orange" + System.lineSeparator();
    Assert.assertEquals(expectedOutput, outContent.toString());
  }

}
