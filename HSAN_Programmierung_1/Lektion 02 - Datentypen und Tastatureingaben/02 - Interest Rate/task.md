Erstellen Sie ein Programm, welches zur Zinsberechnung eingesetzt werden kann.
  Das Programm soll die folgenden Informationen von der Konsole (Tastatur) einlesen:

* Das investierte Kapital in € (Gleitkommazahl)
* Der vereinbarte Zins pro Jahr in Prozent (ganze Zahl)
* Die vereinbarte Laufzeit in Jahren (ganze Zahl).

Die Formel zur Berechnung des Guthabens lautet:

![Formel zur Berechnung des Guthabens](Zinsberechnung.png)

Hierbei ist K<sub>n</sub> das nach n Jahren angesparte Kapital inklusive Zinsen, K das investierte Kapital und Z der Zinssatz in Prozent.

Das Programm soll die folgenden Werte berechnen und ausgeben:
  * Den durch Zinsen erwirtschafteten Betrag nach der Laufzeit n
  * Das nach der Laufzeit n angesparte Kapital

Ablauf mit Bildschirmausgabe (grün = Eingaben des Anwenders; Ihre Lösung muss eine analoge Ausgabe erzeugen):

  ![](Zinsberechnung-output.png)

<div class="hint">

* Zur Berechnung einer Exponentialfunktion x<sup>n</sup> gibt es in Java **keinen** Operator.
Stattdessen muss eine Funktion verwendet werden.
Schlagen Sie die Klasse `Math` in der Dokumentation nach, diese bietet eine passende Methode an.
Verwenden Sie diese Methode in Ihrer Implementierung!
* Runden ist nicht notwendig!
</div>