# Grundlagen und Datentypen

----

## Übung 1 (Leicht)

Erstellen Sie eine Funktion Add welche zwei ganze Zahlen als parameter überreicht bekommt und diese addiert.

Beispiel:  
Add(1,2) -> 3  
Add(4,-5) -> -1  

Schaffen Sie es die Funktion zu erstellen ohne Variablen zu verwenden?

## Übung 2 (Fortgeschritten)

Implementieren Sie eine Funktion isGatekeeper(),
welche eine ganze Natürliche Zahl entgegen nimmt und zurückgibt ob die Übergebene Zahl eine Gatekeeperzahl ist.
Eine Gatekeeperzahl ist eine mindestens dreistellige Natürliche Zahl welche durch ihre erste und letzte Ziffer teilbar ist.
Dementsprechend ist 192 eine Gatekeeperzahl, da es sowhol durch 1 als 2 teilbar ist.
Nicht natürliche Zahlen oder Zahlen mit weniger als drei Ziffern sind keine Gatekeeperzahlen.

Beispiel:  
isGatekeeper(192)   -> true  
isGatekeeper(-192)  -> false  
isGatekeeper(36)    -> false  

Tipp: Benutzen Sie '%' als Rechenoperator, so erhalten Sie den Rest einer Division 25 % 10 = 5

## Übung 3 (Leicht)

Implementieren Sie eine Funktion DestroyAliens(),
welche einen String entgegennimmt und jede Erwähnung des Wortes 'Alien' entfernt.
Groß- oder Kleinschreibung soll nicht beachtet werden.

Beispiel:  
DestroyAliens('')                   -> ''  
DestroyAliens(null)                 -> ''  
DestroyAliens('Apfel')              -> 'Apfel'  
DestroyAliens('Alien')              -> ''  
DestroyAliens('Da ist ein Alien!')  -> 'Da ist ein !'  

## Übung 4 (Fortgeschritten)

Implementieren Sie eine Funktion GetSmallestDivisor(),
welche eine Natürliche Zahl entgegennimmt und deren kleinsten natürlichen Divisor findet.
Sollte die Zahl eine Primzahl sein, so gibt die Funktion 1 zurück.
Falls die Zahl keine Natürliche Zahl ist gibt die Funktion 0 zurück.

Beispiel:  
GetSmallestDivisor(25)  -> 5  
GetSmallestDivisor(7)   -> 1
GetSmallestDivisor(-17) -> 0

## Übung 5 (Leicht)

Implementieren Sie eine Funktion PostponeMeeting(time. difference),
welche eine natürliche Zahl entgegennimmt,
die eine Uhrzeit eines Meetings repräsentiert und eine zweite natürliche Zahl, welche die Verschiebung in Sekunden angibt. Die Methode soll nun die Uhrzeit des Meetings um die angegebene Zeit verschieben und die neue Uhrzeit zurückgeben.
Sollte einer der Parameter ungültig sein, so gibt die Funktion -1 zurück.

Beispiel:  
PostponeMeeting(1030,240)   -> 1034  
Da 240 sekunden 4 Minuten entsprechen.  
PostponeMeeting(0,240)      -> 4  
PostponeMeeting(-15,32397)  -> -1  

## Übung 6 (Fortgeschritten)

Erstellen Sie eine Funktion Fibonacci(int n).
Die Funktion soll die n-te Fibonacci Zahl ausgeben.
N ist ein Element der Natürlichen Zahlen.
Sollte ein ungültiger Parameter übergeben werden, geben Sie 0 zurück.

Beispiel:  
Fibonacci(2)    -> 1  
Fibonacci(5)    -> 5  
Fibonacci(-2)   -> 0  

## Übung 7 (Leicht)

Erstellen Sie eine Funktion Invert(), die einen beliebigen String invertiert. Ist der String leer oder `null` so soll ein leerer String zurückgegeben werden. führende und nachfolgende Leerzeichen sollen entfernt werden. Die Groß- und Kleinschreibung soll intakt bleiben.

Beispiel:  
Invert('ABC')   -> 'CBA'  
Invert(null)    -> ''  
Invert(' Burg ')-> 'gurB'  

## Übung 8 (Fortgeschritten)

Erstellen Sie eine Funktion CountWords(),  
welche einen String entgegennimmt und die Anzahl der Wörter darin zählt.  
Ein Wort wird durch mindestens ein Leerzeichen getrennt.  
Groß-/Kleinschreibung ist egal.  
Bei `null` oder leerem String soll `0` zurückgegeben werden.

Beispiel:  
CountWords('Das ist ein Test') -> 4
CountWords('  Hallo  Welt ')   -> 2
CountWords('')                 -> 0
CountWords(null)               -> 0

## Übung 9 (Leicht)

Erstellen Sie eine Funktion CountVowels(),
welche einen String entgegennimmt und die Anzahl der Vokale (a, e, i, o, u) darin zählt.
Groß- und Kleinschreibung soll nicht beachtet werden.
Bei null oder leerem String soll 0 zurückgegeben werden.

Beispiel:

CountVowels('Haus')    -> 2  
CountVowels('')        -> 0  
CountVowels(null)      -> 0  
CountVowels('PYTHON')  -> 1  

## Übung 10 (Fortgeschritten)

Erstellen Sie eine Funktion IsPerfectNumber(),
welche eine natürliche Zahl entgegennimmt und prüft,
ob diese eine vollkommene Zahl ist.
Eine vollkommene Zahl ist gleich der Summe aller ihrer echten Teiler
(z. B. 6 = 1 + 2 + 3).
Falls der Parameter ungültig ist, geben Sie false zurück.

Beispiel:

IsPerfectNumber(6)    -> true  
IsPerfectNumber(28)   -> true  
IsPerfectNumber(12)   -> false  
IsPerfectNumber(-6)   -> false  