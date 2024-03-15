# Aufgabe 1

Wir simulieren die Abstimmung bei "Deutschland sucht den Superstar". 
Die Zuschauer können anrufen und ihren Favoriten aus einer bestimmten Anzahl an Sängerinnen und Sängern wählen. 
Auf dem TV ausgegeben wird letztendlich pro Sängerin bzw. Sänger die Anzahl an Zuschauern, die für sie bzw. ihn gestimmt haben, 
und zwar prozentual.

Schreiben Sie eine Methode, die entsprechende Balken auf den Bildschirm ausgibt.
Die Methode bekommt ein eindimensionales int-Array (Mit nicht-negativen Werten) als Parameter übergeben (Die jeweiligen Anrufe pro Sängerin bzw. Sänger)
und soll entsprechend der prozentualen Verteilung Balken aus *-Zeichen (100 % entsprechen dabei 100 *-Zeichen) sowie anschließend den
absoluten Wert und den Prozentsatz auf den Bildschirm zeichnen.

Beispiel: f([50, 50, 40, 60]) produziert:
*************************50(25.0%)
*************************50(25.0%)
********************40(20.0%)
******************************60(30.0%)

Integrieren Sie diese Methode in ein Java Programm, mit dessen Hilfe diese Methode getestet werden kann.

