import org.junit.Assert;
import org.junit.Test;

public class Tests {

  private static String generateRandomContent(int length) {
    StringBuilder content = new StringBuilder();
    for (int i = 0; i < length; i++) {
      content.append((char) (Math.random() * 26 + 'A')); // Zufälliger Großbuchstabe
    }
    return content.toString();
  }


  private boolean deleteFile(String fileName) {
    return new java.io.File(fileName).delete();
  }

  @Test
  public void testFileWritingTimes() {
    String content = generateRandomContent(1000000); // Beispielinhalt mit 1 Million Zeichen
    String unbufferedFileName = "unbuffered_test_file.txt";
    String bufferedFileName = "buffered_test_file.txt";

    Benchmark benchmark = new Benchmark();

    long unbufferedTime = benchmark.writeUnbufferedFile(unbufferedFileName, content);
    long bufferedTime = benchmark.writeBufferedFile(bufferedFileName, content);

    System.out.println("Unbuffered: "+unbufferedTime);
    System.out.println("Buffered: "+bufferedTime);


    Assert.assertTrue(unbufferedTime > 0);
    Assert.assertTrue(bufferedTime > 0);

    // Löschen der erstellten Testdateien
    Assert.assertTrue(deleteFile(unbufferedFileName));
    Assert.assertTrue(deleteFile(bufferedFileName));
  }



}