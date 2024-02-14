# Person Comparable

Ergänzen Sie den Quelltext von `Person`, so dass Person die Schnittstelle `Comparable`
implementiert. Für den Vergleich zweier Person-Instanzen sollen die Attribute in der genannten Reihenfolge
aus Aufgabe 4 genutzt werden. Das heißt, zunächst werden die `Namen` der
beiden Personen verglichen. Wenn die Namen gleich sind, dann die `Vornamen` usw. 

## Tipp
Zum Vergleich von Strings können Sie die Methode `string1.compareTo(anotherString)` nutzen
und zum Vergleichen von Integer-Werten `Integer.compare(int1, int2)`