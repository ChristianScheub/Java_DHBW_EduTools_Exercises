Erstellen Sie eine Methode, die das kleinste Element aus einem Array zurückliefert
Wenn das übergebene Array die Länge 0 hat, dann soll die Methode das Ergebnis NaN zurückgeben 
Wenn das übergebene Array den Wert null hat, dann soll die Methode das Ergebnis NaN

Die Basisklasse {@link Double} beherbergt verschiedene Konstanten.
Darunter die Konstante für:
den kleinsten möglichen positiven Wert größer als 0: MIN_VALUE 
den größten möglichen Wert: MAX_VALUE
den Wert für keine gültige Zahl: NaN
Beispiele
getMinimum( null ) = Double.NaN 
getMinimum( {1.0,2.0,4.0} ) = 1.0 
getMinimum( {-1.0,-2.0,-4.0} ) = -4.0 
