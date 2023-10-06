# Comparator

Definieren Sie zwei Klassen, die beide die Schnittstelle `Comparator<Person>`
implementieren. Für die erste der beiden Comparator-Klassen soll der Vergleich zwischen
`Personen` wie in Aufgabe 5 erfolgen. Die zweite Comparator-Klasse soll dagegen für den
Vergleich die Attributreihenfolge `Postleitzahl, Straße, Hausnummer, Name und Vorname`
nutzen.
Schreiben Sie ein `Testprogramm`, das ein Array von Person-Instanzen einmal nach Namen
und einmal nach Postleitzahlen sortiert und nach der Sortierung ausgibt. Nutzen Sie hierzu
die `Comparator-Klassen` sowie die Methode `sort()` aus der `Klasse java.util.Arrays`