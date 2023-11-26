# Fehlerbehebung in Java-Quelldateien

Diese Übung zielt darauf ab, Ihre Fähigkeiten im Umgang mit Java-Code zu verbessern, insbesondere im Hinblick auf das Kompilieren und Debuggen. Unten finden Sie drei separate Java-Quelldateien. Zwei davon enthalten Fehler. Ihre Aufgabe ist es, den Code jeder Datei zu kompilieren und zu überprüfen, ob er fehlerfrei ist. Wenn Sie auf Fehler stoßen, sollten Sie diese korrigieren, um sicherzustellen, dass der Code erfolgreich kompiliert und ausgeführt werden kann.

## Übung 2a

Finden sie hier den Fehler, falls einer vorhanden ist.
```java
public class Übung2a {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            if (x > 3) {
                System.out.println("großes x");
            }
            x++;
        }
    }
}
```

## Übung 2b

Finden sie hier den Fehler, falls einer vorhanden ist.

```java
public static void main(String[] args) {
    int x = 5;
    while (x > 1) {
        x = x - 1;
        if (x > 3) {
            System.out.println("kleines x");
        }
    }
}
```

## Übung 2c

Finden sie hier den Fehler, falls einer vorhanden ist.

```java
public class Übung2b {
    int x = 5;
    while (x > 1) {
        x = x - 1;
        if (x > 3) {
            System.out.println("kleines x");
        }
    }
}
```

Nachdem Sie die Fehler in den Dateien korrigiert haben, sollte jede Datei erfolgreich kompilieren und eine entsprechende Ausgabe liefern, wenn sie ausgeführt wird. Verwenden Sie Ihre bevorzugte Entwicklungsumgebung oder die Befehlszeile, um die Aufgaben zu lösen.
Lösen sie anschließend das Quiz und geben sie an welche Fehler es gab.

Viel Erfolg bei der Fehlerbehebung!
