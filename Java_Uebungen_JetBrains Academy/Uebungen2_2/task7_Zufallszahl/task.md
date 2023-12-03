# Ratespiel mit Zufallszahlen

In dieser Übung werden Sie ein einfaches Ratespiel programmieren. Das Programm generiert eine Zufallszahl zwischen 0 und 100, und der Benutzer muss versuchen, diese Zahl zu erraten. Basierend auf der Benutzereingabe gibt das Programm einen Hinweis aus, ob die geratene Zahl zu hoch, zu niedrig oder korrekt ist. Wenn die Zahl korrekt geraten wird, beendet das Programm und gibt die Anzahl der Versuche aus.

## Aufgabenstellung

1. Generieren Sie eine Zufallszahl zwischen 0 und 100 mit `Math.random()`.
2. Implementieren Sie eine Schleife, in der der Benutzer eine Zahl eingibt.
3. Nach jeder Eingabe gibt das Programm einen Hinweis aus:
  - Wenn die Eingabe zu hoch ist, soll "Zu hoch!" ausgegeben werden.
  - Wenn die Eingabe zu niedrig ist, soll "Zu niedrig!" ausgegeben werden.
  - Wenn die Eingabe korrekt ist, soll "Korrekt! Sie haben die Zahl nach X Versuchen erraten." ausgegeben werden, wobei X die Anzahl der Versuche ist.
4. Das Programm soll beendet werden, sobald die Zahl richtig geraten wurde oder 3 Versuche schon gemacht wurden.

## Hinweise

- Sie können die Zufallszahl mit folgendem Code generieren:
  ```java
  int zufallszahl = (int) (Math.random() * 101);
