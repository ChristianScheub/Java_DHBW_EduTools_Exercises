## Fahrzeug

In dieser Aufgabe geht es um die Deklaration einer Klasse `Fahrzeug`, die verschiedene Fortbewegungsmittel wie Fahrrad, Auto oder Eisenbahn repräsentieren kann.

### Anforderungen:

1. Ein Fahrzeug hat folgende Eigenschaften:
  - Eine aktuelle Position vom Typ `Point`. (Hinweis: Für die Angabe der Position eines Fahrzeugs können Sie die Klasse Point verwenden.)
  - Eine bestimmte Anzahl an Rädern
  - Ein Leergewicht
  - Eine aktuelle Geschwindigkeit

2. Implementieren Sie die Klasse `Fahrzeug` mit den genannten Eigenschaften.
  - Ein Konstruktor mit formalen Parametern zur Initialisierung aller Attribute. Für die Position sollten `x` und `y` Koordinaten übergeben werden können.
  - Eine Methode `beschleunigen`, die die aktuelle Geschwindigkeit um einen bestimmten Wert erhöht bzw. erniedrigt. Bei negativer Beschleunigung wird die Geschwindigkeit reduziert.
  - Eine Methode `fahren`, die das Fahrzeug an eine neue Position verschiebt. Die Verschiebung sollte durch die Parameter `dx` und `dy` (beide vom Typ `int`) bestimmt werden.
  - Eine Methode `getAktuelleGeschwindigkeit`, die die aktuelle Geschwindigkeit des Fahrzeugs zurückgibt.
  - Eine Methode `getPosition`, die den aktuellen Point zurückgibt.
