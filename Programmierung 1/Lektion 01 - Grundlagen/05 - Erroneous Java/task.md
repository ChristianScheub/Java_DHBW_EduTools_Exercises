Schreiben Sie den nachfolgenden Code __zeichengenau__ in die Datei `ErroneousJava.java`:

 ```
 public clas ErroneousJava {
 
     public static void main(String[ args) {
         int x  2;
         int y = 4;
         int h = 4
 
         double v = x ;
 
         System.out.println("v = " + v);
     }
 
 }
 ```

Wie Sie durch diverse rote Markierungen in IntelliJ feststellen können, ist dieses Programm nicht fehlerfrei.
 Insgesamt haben sich __6 syntaktische Fehler__ eingeschlichen.

* Beheben Sie zunächst die syntaktischen Fehler!
  Erst dann sollte sich das Programm übersetzen lassen.  

* Das Programm soll das Volumen einer Pyramide mit rechteckiger Grundfläche berechnen und in die Variable `v` schreiben.
  Leider hat sich __ein semantischer Fehler__ eingeschlichen, der Programmierer hat einen Teil vergessen.
  
  Ergänzen Sie die Berechnung des Volumens!

<div class="hint">

* Als Rechenoperatoren stehen Ihnen zur Verfügung:

  * Addition: `+`
  * Subtraktion: `-`
  * Multiplikation: `*`
  * Division: `/`

    Diese funktionieren, wie aus der Mathematik gewohnt.

* Sie haben die Zuweisung noch nicht kennengelernt.
    Die Bestimmung des Volumens muss auf der *rechten* Seite des `=`-Zeichens in `double v =` stehen!

* Wenn Sie eine genaue Angabe des Ergebnisses im Rahmen einer Division erwarten, muss mindestens Dividend oder Divisor als Gleitkommazahl angegeben werden. 
    D.h. wenn Sie _ein Viertel_ einer Zahl bestimmen wollen, müssen Sie in Java `<Ihre Zahl> / 4.0` schreiben.
    Eine Erklärung wird in der Vorlesung nachgeliefert!
</div>