import org.junit.Assert;
import org.junit.Test;
import java.io.FileOutputStream;
import java.io.File;


public class Tests {

    @Test
    public void testFileCopySuccess() {
      String sourceFile = "test_source.txt";
      String destFile = "test_destination.txt";

      // Erstelle eine Testquelle mit Inhalt
      createTestFile(sourceFile, "Hello, FileCopier!");

      boolean success = CopyFile.fileCopy(sourceFile, destFile);

      Assert.assertTrue(success);
      Assert.assertTrue(new File(destFile).exists());

      // Lösche die erstellten Testdateien
      Assert.assertTrue(deleteFile(sourceFile));
      Assert.assertTrue(deleteFile(destFile));
    }

    @Test
    public void testFileCopyFailure() {
      String sourceFile = "non_existent_file.txt";
      String destFile = "test_destination.txt";

      boolean success = CopyFile.fileCopy(sourceFile, destFile);

      Assert.assertFalse(success);
      Assert.assertFalse(new File(destFile).exists());
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