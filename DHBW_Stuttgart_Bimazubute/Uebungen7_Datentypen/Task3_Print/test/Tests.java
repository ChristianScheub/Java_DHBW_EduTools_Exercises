import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Tests {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;


  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }

  @Test
  public void testIntPrintList() {
    List<Integer> v = new ArrayList<>();
    v.add(100);
    v.add(200);
    v.add(300);

    Print.printList(v);

    Assert.assertEquals("100\r\n200\r\n300\r\n", outContent.toString());
  }

  @Test
  public void testStringPrintList() {
    List<String> a = new ArrayList<>();
    a.add("Hallo");
    a.add("das ist ein");
    a.add("Test");

    Print.printList(a);

    Assert.assertEquals("Hallo\r\ndas ist ein\r\nTest\r\n", outContent.toString());
  }

  @After
  public void restoreStreams() {
    System.setOut(originalOut);
  }
}