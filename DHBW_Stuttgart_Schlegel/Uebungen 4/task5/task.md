# Aufgabe 5

1. Bei einem ihrer Kunden wird viel mit Münzen gearbeitet. Der Kunde will in den Programmen 
mit Ausdrücken in der Art "FUENFER", "ZEHNER", "ZWANZIGER", "FUENFZIGER", "EIN_FRAENKLER" und "ZWEI_FRAENKLER" arbeiten können.
Im Weiteren haben die Münzen neben der Eigenschaft des Wertes in Rappen noch die Eigenschaft des Gewichtes in Gramm.
Definieren Sie einen entsprechenden enum, welcher diesen Anforderungen genügt.
2. Im Weiteren soll auch die Münz-Farbe mit den Werten für das Farb-Tripel "Rot-Grün_blau" pro Münze definiert sein.
Der Kunde will, dass wenn man eine Münze vie System.out auf die Konsole ausgibt, der Output für einen Fünfer wie folgt aussieht:

"FUENFER: Gewicht=2 Farbe: Gold =154-114-50"

Tipp: Implementieren Sie hierzu eine Methode public String toString() {...}

Erstellen Sie die dazu nötigen enum's sodass folgende Test-Sequenzen funktioniert:

```
Muenze meineMuenzVariable = Muenze.FUENFER;
if(meineMuenzVariable == Muenze.FUENFER){
  System.out.println("Das ist ein FUENFER");
}
System.out.println(meineMuenzVariable);
```
//Ausgabe

Das ist ein FUENFER
FUENFER: Gewicht=2 Farbe: Gold = 154-114-50