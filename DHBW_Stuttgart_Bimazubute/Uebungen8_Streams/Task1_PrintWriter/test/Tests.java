import org.junit.Assert;
import org.junit.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.io.File;

public class Tests {
  @Test
  public void testWriteRandomNumbersToFile() {
    String fileName = "test_random_numbers.txt";
    RandomPrintWriter randomPrintWriter = new RandomPrintWriter();
    randomPrintWriter.writeRandomNumbersToFile(fileName);

    File file = new File(fileName);
    Assert.assertTrue(file.exists());

    int numberOfLines = countLinesInFile(file);
    Assert.assertEquals(100, numberOfLines);

    deleteFile(fileName);
  }

  private int countLinesInFile(File file) {
    int count = 0;
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      while (reader.readLine() != null) {
        count++;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return count;
  }

  private boolean deleteFile(String fileName) {
    return new File(fileName).delete();
  }
}