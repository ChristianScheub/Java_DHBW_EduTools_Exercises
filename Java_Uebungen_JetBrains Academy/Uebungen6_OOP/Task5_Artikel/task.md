## Artikel & Auftrag

### Anforderungen

1. Erstellen Sie eine Klasse `Artikel`:
  - `id`: Ein `int`-Attribut zur Speicherung der Artikelnummer.
  - `preis`: Ein `double`-Attribut zur Speicherung des Artikelpreises.
  - Geeignete Konstruktoren und Getter-/Setter-Methoden.

2. Erstellen Sie eine Klasse `Auftrag`:
  - `artikel`: Ein Attribut vom Typ `Artikel` zur Speicherung einer Referenz auf den jeweils bestellten Artikel.
  - `menge`: Ein `int`-Attribut zur Speicherung der bestellten Menge des Artikels.
  - Geeignete Konstruktoren und Getter-/Setter-Methoden.
  - Implementieren Sie die Methode `public static double getGesamtwert(Auftrag... auftraege)`. Diese Methode soll die Summe aller einzelnen Auftragswerte (Menge * Artikelpreis) zurückgeben.
