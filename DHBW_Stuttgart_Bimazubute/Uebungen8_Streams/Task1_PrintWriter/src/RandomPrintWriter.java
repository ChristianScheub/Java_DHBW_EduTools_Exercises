import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Random;

public class RandomPrintWriter {
    public void writeRandomNumbersToFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                int randomNumber = random.nextInt(1000); // Zufallszahl zwischen 0 und 999
                writer.println(randomNumber);
            }
        } catch (IOException e) {
            System.out.println("Fehler beim Schreiben der Datei: " + e.getMessage());
        }
    }


}