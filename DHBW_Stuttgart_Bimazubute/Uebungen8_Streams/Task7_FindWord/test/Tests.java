import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Tests {
  @Test
  public void testSolution() {
    String testData = "This is a search test line\r\n" +
            "WordSearcher class example\r\n" +
            "Another line for search word\r\n" +
            "End of the file\n\r";

    String fileName = "test_example.txt";
    createTestFile(fileName, testData);

    String targetWord = "search";

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outputStream));

    FindWord.searchWordInFile(fileName, targetWord);

    System.setOut(originalOut);

    String expectedOutput = "1: This is a search test line\r\n" +
            "3: Another line for search word\r\n";

    Assert.assertEquals(expectedOutput, outputStream.toString());

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