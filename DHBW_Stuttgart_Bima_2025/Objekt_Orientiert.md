# Objekt-Orientierung

## Übung 1

Erstellen Sie eine Konto-Klasse.
Diese Klasse soll eine natürliche Zahl als Kontonummer haben,
eine 32-bit fließkommazahl als Kontostand und den Namen des Besitzers als Zeichenkette.
Beachte, beim Erstellen der Klasse, dass Prinzip der Enkapsulierung.
Die Klasse soll getter und setter Methoden für die hier genannten Attribute öffentlich anbieten.

## Übung 2

Erstellen Sie processPayment() Methode.
Diese Methode nimmt zwei Objekte der Konto-Klasse entgegen und transferiert einen Betrag X vom erstgenannten Konto auf das zweite. Hierfür werden die Kontostände über die internen GetKontostand() und SetKontostand() gelesen und modifiziert.
Die Konto Klasse ist nicht teil der Aufgabe und darf nicht modifiziert werden.

## Übung 3

Erstellen Sie eine Klasse 'Bridge', diese Klasse hat folgende Attribute. Ein zulässiges Höchstgewicht 'MaxWeight' als natürliche Zahl, eine Länge in Metern (natürliche Zahl) und Boolschen Wert 'hasBikeLane'. Die Klasse soll öffentliche Getter Methoden für alle Attribute anbieten, sowie eine Funktion canPass(), welche einen Boolschen Wert zurückgibt, welcher aussagt, ob das als Parameter übergebene Gewicht über dem zulässigen Höchstgewicht liegt. Die Attribute sollen über einen öffentlichen Konstruktur Bridge(MaxWeight, Length, hasBikeLane) gesetzt werden und danach nicht mehr modifiziert werden.

## Übung 4

Erstellen Sie eine Klasse **Car**,  
die folgende Attribute hat:  

- **Brand** (Zeichenkette)  
- **Model** (Zeichenkette)  
- **Year** (natürliche Zahl)

Alle Attribute sollen im Konstruktor gesetzt und danach nur lesbar sein.  
Die Klasse soll eine Methode **GetInfo()** anbieten,  
die alle Informationen als Zeichenkette zurückgibt.

---

## Übung 5

Erstellen Sie eine Klasse **Rectangle**,  
die zwei Attribute **Width** und **Height** (natürliche Zahlen) enthält.  
Die Klasse soll:

- Über einen Konstruktor beide Werte setzen  
- Getter und Setter für beide Attribute haben  
- Eine Methode **GetArea()** implementieren, die die Fläche berechnet  

---

## Übung 6

Erstellen Sie eine Klasse **Student**,  
die Attribute **Name** (Zeichenkette) und **Grades** (Array von ganzen Zahlen) enthält.  
Die Klasse soll Methoden haben, um:
- Eine neue Note hinzuzufügen (**AddGrade()**)  
- Den Durchschnitt aller Noten zu berechnen (**GetAverage()**)  

---

## Übung 7

Erstellen Sie eine abstrakte Klasse **Animal**  
mit den Attributen **Name** (Zeichenkette) und **Age** (natürliche Zahl).  
Fügen Sie eine abstrakte Methode **MakeSound()** hinzu.  

Leiten Sie davon zwei Klassen **Dog** und **Cat** ab,  
die die Methode **MakeSound()** mit einem passenden Text implementieren.

---

## Übung 8

Erstellen Sie eine Klasse **Library**,  
die ein Array von **Books** enthält.  
Die Klasse soll Methoden anbieten, um:

- Ein neues Buch hinzuzufügen (**AddBook()**)  
- Ein Buch nach Titel zu suchen (**FindBookByTitle()**)  
- Alle Bücher zurückzugeben (**GetAllBooks()**)  

Erstellen Sie außerdem eine einfache Klasse **Book** mit Titel und Autor als Zeichenketten.

---

## Übung 9

Erstellen Sie eine Schnittstelle (Interface) **IMovable** mit einer Methode **Move(distance)**.  
Implementieren Sie diese Schnittstelle in zwei Klassen **Car** und **Bicycle**,  
wobei jede Klasse bei Aufruf von **Move()** eine passende Ausgabe liefert.

---

## Übung 10

Erstellen Sie eine Klasse **Bank**,  
die eine Liste von **Konten** verwaltet (verwenden Sie die bereits erstellte Konto-Klasse aus Übung 1).  
Die Bank soll Methoden haben, um:

- Ein Konto hinzuzufügen (**AddAccount()**)  
- Alle Konten eines Besitzers aufzulisten (**GetAccountsByOwner()**)  
- Eine Überweisung zwischen zwei Konten durchzuführen (**Transfer()**)

---

## Übung 11

Erstellen Sie eine Klasse **Employee**,  
die Attribute **Name**, **Salary** (Fließkommazahl) und **Position** (Zeichenkette) enthält.  
Erstellen Sie außerdem eine Klasse **Department**,  
die mehrere Employees verwaltet und Methoden anbietet, um:

- Einen neuen Employee hinzuzufügen  
- Den Gesamtsaldo der Gehälter zu berechnen  
- Alle Employees mit einer bestimmten Position zu finden  

---

## Übung 12

Erstellen Sie eine Klasse **Shape** mit einer Methode **GetArea()**,  
die 0 zurückgibt.  
Leiten Sie davon die Klassen **Circle** (mit Radius) und **Square** (mit Seitenlänge) ab  
und überschreiben Sie die Methode **GetArea()**,  
um die jeweilige Fläche korrekt zu berechnen.
