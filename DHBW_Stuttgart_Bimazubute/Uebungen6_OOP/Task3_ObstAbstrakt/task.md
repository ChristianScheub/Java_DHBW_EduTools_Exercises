## Übung: Obstlager

Implementieren Sie ein einfaches System zur Verwaltung von Obst in einem Lager.

### Schritte:

1. Erstellen Sie eine abstrakte Klasse `Obst`. Sie sollte die folgenden abstrakten Methoden enthalten:
  - `getName()`: Gibt den Namen des Obstes zurück.
  - `getFarbe()`: Gibt die Farbe des Obstes zurück.

2. Erstellen Sie drei Klassen: `Apfel`, `Birne`, und `Orange`. Jede dieser Klassen sollte von `Obst` erben und die abstrakten Methoden implementieren.

3. Erstellen Sie die Klasse `Obstlager`. Sie sollte:
  - Eine private ArrayList `lager` vom Typ `Obst` enthalten.
  - Eine Methode `addObst(Obst obst)` haben, die ein Obst zum Lager hinzufügt.
  - Eine Methode `print()`, die für jedes Obst im Lager den Namen und die Farbe ausgibt. (z.B. "Birne Gruen")

Viel Erfolg!
