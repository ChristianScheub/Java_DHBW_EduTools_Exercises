# Windchill-Berechnung


Der Windchill beschreibt den Unterschied zwischen der gemessenen Lufttemperatur und
der gefühlten Temperatur in Abhängigkeit von der Windgeschwindigkeit.
Bei einer gegebenen Temperatur t (in Grad Celsius) und einer Windgeschwindigkeit v (in
Kilometer pro Stunde) wird der Windchill wie folgt berechnet:
`w = 13,12 + 0,6215t - (11,37*v^0,16) + (0,3965*t*v^0,16)`



## Aufgabe:

- Berechnen Sie den Windchill in der `calcWindchill(double t, double v)`-Methode
- Runden Sie den berechneten Windchill-Wert auf 2 Dezimalstellen.


