# Daten einlesen und ausgeben in Java

In dieser Aufgabe werden Sie die Grundlagen der Datenausgabe und das Einlesen von Daten in Java mithilfe der `System.out`-Klasse und der `Scanner`-Klasse vertiefen. Sie werden auch lernen, wie Inkrementoperationen in Java funktionieren. Zusätzlich sollten Sie die [Javadoc](http://download-llnw.oracle.com/javase/6/docs/api/index.html) für weitere Informationen über diese Klassen nutzen.

## Aufgabe 2

Betrachten Sie das untenstehende Java-Programm und überprüfen Sie die Ausgaben der `println`-Methoden. Was stellen Sie fest? Erläutern Sie Ihre Beobachtungen.

```java
public class EingabeTest {
    public static void main(String[] args) {
        int value_1;
        int value_2;
        
        value_1 = 1;
        value_2 = ++value_1 + 10;
        System.out.println("Der Wert von Value_2 ist " + value_2);
        
        value_1 = 1;
        value_2 = value_1++ + 10;
        System.out.println("Der Wert von Value_2 ist " + value_2);
    }
}
