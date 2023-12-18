import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Tests {
  @Test
  public void testSolution() {
    String testData = "Line 1\r\nLine 2\r\nLine 3\r\n";
    String fileName = "test_example.txt";

    // Schreibe Testdaten in die Datei
    createTestFile(fileName, testData);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outputStream));

    // Lese Daten aus der Datei und leite sie zum Standardausgang um
    ReadLine.readAndPrintLines(fileName);

    System.setOut(originalOut);

    // Überprüfe die Ausgabe auf Zeilenumbrüche
    Assert.assertEquals(testData, outputStream.toString());

    //Löschen der Testdatei
    deleteFile(fileName);
  }

  private void createTestFile(String fileName, String content) {
    try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
      fileOutputStream.write(content.getBytes());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private boolean deleteFile(String fileName) {
    return new File(fileName).delete();
  }
}