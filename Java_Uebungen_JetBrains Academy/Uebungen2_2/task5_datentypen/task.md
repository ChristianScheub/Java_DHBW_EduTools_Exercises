# Umgang mit primitiven Datentypen in Java

In dieser Aufgabe werden Sie mit den primitiven Datentypen in Java arbeiten. Sie sollen jeden primitiven Datentyp definieren, ihn initialisieren und verschiedene Operationen ausführen.

## Anforderungen

1. Definieren Sie Variablen für jeden primitiven Datentyp (byte, short, int, long, float, double, char, boolean).
2. Initialisieren Sie jede Variable mit einem Wert.
3. Führen Sie mindestens eine Operation mit jeder Variable aus:
  - Arithmetische Operationen (z.B. Addition, Subtraktion) für numerische Datentypen.
  - Vergleichsoperationen (z.B. `==`, `!=`, `<`, `>`) für numerische Datentypen.
  - Logische Operationen (z.B. `&&`, `||`) für den booleschen Datentyp.
  - Verwenden Sie den `char`-Datentyp in einer Ausgabeoperation.

## Beispiel

Hier ist ein Beispiel für die Definition und Initialisierung einer `int`-Variable und das Durchführen einer arithmetischen Operation:

```java
public class Main {
    public static void main(String[] args) {
        // Definition und Initialisierung
        int myInt = 10;

        // Arithmetische Operation
        myInt = myInt + 5;

        // Ausgabe
        System.out.println("Der neue Wert von myInt ist: " + myInt);
    }
}
```
Führen Sie Ähnliches für die anderen Datentypen durch und zeigen Sie die Ergebnisse der Operationen in der Konsole an. Testen Sie auch, was passiert, wenn Sie unterschiedliche Datentypen in Operationen mischen (z.B. int und double).
Anbei die Testfunktion funktioniert bei dieser Aufgabe leider nicht.

