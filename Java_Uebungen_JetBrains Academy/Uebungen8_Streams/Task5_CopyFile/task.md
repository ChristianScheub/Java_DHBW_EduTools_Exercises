# Copy File

Schreiben Sie ein Programm, das Dateien `byteweise` kopiert. Nutzen Sie die Klassen
`java.io.FileInputStream` und `java.io.FileOutputStream` dazu. Nennen Sie die
Kopierfunktion `static boolean fileCopy(String sourceFile, String destFile)`. Fehler sollen
innerhalb der Methode aufgefangen werden, aber die Rückgabe ist true, falls es keine
Fehler gab, und false, falls Fehler auftraten.