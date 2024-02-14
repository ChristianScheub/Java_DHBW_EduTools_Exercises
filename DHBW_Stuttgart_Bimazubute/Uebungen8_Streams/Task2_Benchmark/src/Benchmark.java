import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Benchmark {

    public long writeUnbufferedFile(String fileName, String content) {
        long startTime = System.currentTimeMillis();
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public long writeBufferedFile(String fileName, String content) {
        long startTime = System.currentTimeMillis();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}