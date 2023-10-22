# Windchill-Berechnung

## Beschreibung:

Schreiben Sie ein Java-Programm, das die Windchill-Temperatur berechnet. Der Benutzer sollte in der Lage sein, die aktuelle Temperatur in Grad Celsius und die Windgeschwindigkeit in km/h einzugeben. Das Programm soll dann den Windchill-Wert berechnen und ausgeben.

## Details:

1. Der Benutzer gibt die Temperatur in Grad Celsius und die Windgeschwindigkeit in km/h über den Standardinput ein.
2. Das Programm berechnet den Windchill-Wert.
3. Das Ergebnis wird im folgenden Format ausgegeben:
   ```
   Der Windchill-Wert bei einer Temperatur von [TEMPERATUR]°C und einer Windgeschwindigkeit von [WINDGESCHWINDIGKEIT] km/h beträgt: [WINDCHILL]°C
   ```
4. Bei ungültigen Eingaben (z. B. Buchstaben statt Zahlen) sollte das Programm eine Fehlermeldung ausgeben:
   ```
   Ungültige Eingabe. Bitte stellen Sie sicher, dass Sie gültige double-Werte für Temperatur und Windgeschwindigkeit eingeben.
   ```

## Anforderungen:

- Verwenden Sie die `Scanner`-Klasse zur Eingabeaufforderung.
- Implementieren Sie eine separate Methode `calculateWindchill`, um den Windchill-Wert zu berechnen.
- Runden Sie den berechneten Windchill-Wert auf 2 Dezimalstellen.

## Beispiel:

Eingabe:
```
10
5
```

Ausgabe:
```
Der Windchill-Wert bei einer Temperatur von 10.00°C und einer Windgeschwindigkeit von 5.00 km/h beträgt: 9.46°C
```
