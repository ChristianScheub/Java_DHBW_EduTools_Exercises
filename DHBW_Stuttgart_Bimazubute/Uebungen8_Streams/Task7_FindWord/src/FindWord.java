import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindWord {
    public static void searchWordInFile(String fileName, String targetWord) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                if (line.contains(targetWord)) {
                    System.out.println(lineNumber + ": " + line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}