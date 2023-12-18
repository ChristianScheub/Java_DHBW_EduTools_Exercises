1. Implementierung einer einfachen Bankanwendung
   Ziel ist es, ein kleines Programm zu erstellen, mit dem ein einfacher Bankbetrieb simuliert
   werden kann. Hierzu sollen Klassen nach Vorgaben erstellt werden und notwendige Algorithmen implementiert werden. Die definierten Vorgaben sind verbindlich müssen unbedingt eingehalten werden.
   
1.1 Einzuhaltende Konventionen und Regeln

- Das Projekt benötigt Java 11 (oder höher) zur Umsetzung
- Evtl. bereits vorhandene Klassen und Interfaces dürfen nicht verändert oder angepasst werden (Dies gilt zum Beispiel für die Exceptions im Package „de.dhbw.assignments.bankmanager.exceptions“).
- Sämtliche Implementierungen dürfen nur im Package „de.dhbw.assignments.bankmanager.impl“ gemäß den Vorgaben abgelegt werden.
- Für die Implementierungen der Klassen gelten folgende Namenskonventionen:
  o Bezeichnungen für Interfaces beginnen immer mit einem großem ‚I‘, gefolgt
  von der namentlichen Bezeichnung, ebenfalls beginnend mit einem Großbuchstaben. Z.B: IBank
  o Die Bezeichnung der Implementierungsklassen entspricht dem der Interfaces,
  wobei das führende I entfällt
  o Das Suffix ‚Impl‘ wird noch an den Namen angehangen
  o Beispiel:
  ▪ IBank -> BankImpl
- Eventuell notwendige Hilfsklassen dürfen nur im Package „de.dhbw.assignments.bankmanager.impl“ abgelegt werden
- Es dürfen keine Dritt-Libraries verwendet werden. Nur die Standard-Bibliotheken sind
  erlaubt (bzw. all die, welche bereits im pom.xml eingebunden wurden).
- Der Code soll kompilierbar sein und stabil laufen.
- Vorgaben zu Bezeichnungen, Parameter und Rückgabewerte sind genau einzuhalten.


1.2 Programmierung
Für das Projekt wird ein Java JDK 11 (oder höher) benötigt. Als IDE können IntelliJ oder Eclipse verwenden. Insgesamt sind 2 Klassen zu programmieren.
1. Öffnen Sie das Start-Projekt. 
2. Machen Sie sich mit der Struktur des Projektes vertraut.
- Sie werden womöglich Compiler-Fehler im Code finden.
- Diese verschwinden, wenn sie die Klassen sauber angelegt und implementiert haben.
- Die vorgegebenen Interfaces sind kommentiert. Aus diesen sogenannten JavadocKommentaren können Sie die zu implementierenden Methoden und ihre Logik
  erkennen.
3. Implementieren Sie notwendigen Klassen.
4. Prüfen Sie, ob Ihre Implementierungen richtig sind (Dies ist ein optionaler Schritt).
   Sie können dazu zum Beispiel eine Startklasse (Name: App.java) mit einer Main-Methode im
   Package impl erstellen und Ihre Implementierung damit testen.
   
1.3 Interfaces
   Folgende Interfaces sind im Start-Projekt bereits vorbereitet. Die Interfaces dürfen nicht modifiziert werden. An den einzelnen Methoden finden sie entsprechende Anweisungen/Anmerkungen, wie die Logik
   zu implementieren ist.
   Interface Beschreibung
   IBank Das Interface beschreibt eine Banksoftware zur Handhabung von
   Konten und Kunden.
   IBankAccount Das Interface beschreibt ein Bankkonto.
   1.4 Implementierungsklassen
   Insgesamt sind zwei Klassen zu bearbeiten.
   Für die Implementierungsklassen der vorgegebenen Interfaces gelten folgende Namenskonventionen:
   Die Bezeichnung der Klassen entspricht dem der Interfaces. Das führende I beim Interface entfällt und
   es wird das Suffix „Impl“ angehangen. Damit ergeben sich folgende Klassen, die im Packet
   „de.dhbw.assignments.bankmanager.impl“ zu implementieren sind:
   Implementierungsklasse
   Beschreibung
   BankAccountImpl • Die Klasse umfasst die Funktionalität eines Bankkontos.
   • Die Klasse implementiert das Interface IBankAccount
   o Anweisungen befinden sich an den Kommentaren der einzelnen
   Methodendefinitionen des Interfaces
   o
   BankImpl • Die Klasse enthält die Funktionalität einer Bank.
   • Die Klasse implementiert das Interface IBank
   o Anweisungen befinden sich an den Kommentaren der einzelnen
   Methodendefinitionen des Interfaces
• Die Klasse hat einen öffentlichen parameterlosen Konstruktor (DefaultKonstruktor)
• Testen sie die Klasse (nicht Bestandteil der Bewertung):
o Erstellen sie eine Testklasse mit einer main-Methode
o Legen sie eine neue Instanz dieser Klasse an
o Zahlen sie einen Wert auf ein Konto ein und prüfen sie die Balance bzw. die zu erwartenden Exceptions
o Heben sie einen Wert von einem Konto ab u
