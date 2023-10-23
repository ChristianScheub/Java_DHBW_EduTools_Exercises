# Windchill-Berechnung


Der Windchill beschreibt den Unterschied zwischen der gemessenen Lufttemperatur und
der gefühlten Temperatur in Abhängigkeit von der Windgeschwindigkeit.
Bei einer gegebenen Temperatur t (in Grad Celsius) und einer Windgeschwindigkeit v (in
Kilometer pro Stunde) wird der Windchill wie folgt berechnet:
`w = 13,12 + 0,6215t - (11,37*v^0,16) + (0,3965*t*v^0,16)`



## Anforderungen:

- Berechnen Sie den Windchill mit den Double t und v als Konsoleneingabe. `System.out.println("t: ")` und `System.out.println("v: ")`
- Runden Sie den berechneten Windchill-Wert auf 2 Dezimalstellen.
- Geben Sie den Windchill mit `System.out.print` aus

## Beispiel:

Eingabe:
```
t = 
6.0
v = 
10.0
```

Ausgabe:
```
3.85
```
