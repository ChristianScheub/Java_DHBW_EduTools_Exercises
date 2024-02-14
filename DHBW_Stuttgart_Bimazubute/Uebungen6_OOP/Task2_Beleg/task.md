# Aufgabe: Implementierung der Beleg-Klasse

Implementieren Sie eine Java-Klasse mit dem Namen `Beleg`. Diese Klasse soll automatisch laufende Belegnummern generieren, beginnend bei 10000, wenn ein neues Beleg-Objekt erstellt wird.

## Klasse `Beleg`

Die `Beleg`-Klasse soll die folgenden Eigenschaften haben:

- `belegNummer` (Typ: int): Eine laufende Belegnummer, die bei 10000 beginnt und sich automatisch bei jeder Erstellung eines neuen `Beleg`-Objekts inkrementiert.

Die Klasse sollte die folgenden Methoden unterstützen:

- `getBelegNummer()`: Diese Methode gibt die aktuelle Belegnummer des `Beleg`-Objekts zurück.

- `resetBelegNummer()`: Diese Methode setzt die Belegnummer zurück auf den Anfangswert 10000. Sie sollte als Klassenmethode implementiert werden.
