# Aufgabe: Implementierung der Beleg-Klasse

Ihre Aufgabe besteht darin, eine Java-Klasse mit dem Namen `Beleg` zu implementieren. Diese Klasse soll automatisch laufende Belegnummern generieren, beginnend bei 10000, wenn ein neues Beleg-Objekt erstellt wird.

## Klasse `Beleg`

Die `Beleg`-Klasse soll die folgenden Eigenschaften haben:

- `belegnummer` (Typ: int): Eine laufende Belegnummer, die bei 10000 beginnt und sich automatisch bei jeder Erstellung eines neuen `Beleg`-Objekts inkrementiert.

Die Klasse sollte die folgenden Methoden unterstützen:

- `getBelegnummer()`: Diese Methode gibt die aktuelle Belegnummer des `Beleg`-Objekts zurück.

- `resetBelegnummer()`: Diese Methode setzt die Belegnummer zurück auf den Anfangswert 10000. Sie sollte als Klassenmethode implementiert werden.
