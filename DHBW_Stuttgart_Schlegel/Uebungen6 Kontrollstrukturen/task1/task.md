# Aufgabe 1

Das folgende (sehr hässliche) Programm soll testen, ob eine Zahl n größer, kleiner oder gleich 0 ist,
und in den Fällen n=0 und n<0 eine entsprechende Meldung ausgeben.

```
public class Test1 {
    public static void main(String[] args) {
        for(int n = -1; n <=1; n++){
            if(n >= 0)
                if(n == 0) System.out.println(n + " ist 0");
            else
                System.out.println(n + " ist kleiner 0");
        }
}
```

Leider arbeitet das Programm nicht wie gewünscht. Finden Sie den Fehler, erklären Sie ihn und korrigieren Sie das Programm.