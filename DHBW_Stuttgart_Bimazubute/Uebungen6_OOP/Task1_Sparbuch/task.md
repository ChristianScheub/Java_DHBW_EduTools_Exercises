# Aufgabe: Implementierung einer Sparbuch-Klasse

Ihre Aufgabe besteht darin, eine Java-Klasse mit dem Namen `Sparbuch` zu implementieren. Diese Klasse soll die Verwaltung eines Sparbuchs ermöglichen, einschließlich Einzahlungen, Abhebungen, Verzinsungen und Abfrage von Kontoinformationen.

## Klasse `Sparbuch`

Die `Sparbuch`-Klasse soll die folgenden Attribute haben:

- `kontonummer` (Typ: String): Die Kontonummer des Sparbuchs.
- `kapital` (Typ: double): Der aktuelle Kontostand des Sparbuchs.
- `zinssatz` (Typ: double): Der jährliche Zinssatz des Sparbuchs (z.B., 0.05 für 5%).

Die Klasse sollte die folgenden Methoden unterstützen:

- `zahleEin(double betrag)`: Diese Methode erhöht das Kapital des Sparbuchs um den angegebenen Betrag. Beachten Sie, dass negative Einzahlungen nicht erlaubt sind und eine `IllegalArgumentException` ausgelöst werden sollte, wenn ein negativer Betrag übergeben wird.

- `hebeAb(double betrag)`: Diese Methode verringert das Kapital des Sparbuchs um den angegebenen Betrag. Beachten Sie, dass Abhebungen nicht zulässig sind, wenn sie das aktuelle Kapital übersteigen, und eine `IllegalArgumentException` ausgelöst werden sollte, wenn ein negativer Betrag übergeben wird.

- `verzinse()`: Diese Methode berechnet die Zinsen auf das aktuelle Kapital basierend auf dem Zinssatz und fügt sie dem Kapital hinzu.

- `getKontonummer()`: Diese Methode gibt die Kontonummer des Sparbuchs zurück.

- `getZinssatz()`: Diese Methode gibt den Zinssatz des Sparbuchs zurück.

- `getKapital()`: Diese Methode gibt das aktuelle Kapital des Sparbuchs zurück.
