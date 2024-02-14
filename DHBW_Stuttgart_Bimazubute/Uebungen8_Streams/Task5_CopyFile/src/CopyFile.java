import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static boolean fileCopy(String sourceFile, String destFile) {
        try (FileInputStream fileInputStream = new FileInputStream(sourceFile);
             FileOutputStream fileOutputStream = new FileOutputStream(destFile)) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }

            return true; // Kopiervorgang erfolgreich
        } catch (IOException e) {
            e.printStackTrace();
            return false; // Fehler beim Kopieren
        }
    }
}