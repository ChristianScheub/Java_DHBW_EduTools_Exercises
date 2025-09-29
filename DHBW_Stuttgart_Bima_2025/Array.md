# Arrays – Übungen

---

## Übung 1 (Leicht)

Schreiben Sie eine Funktion **SumArray()**,  
die ein Array aus ganzen Zahlen entgegennimmt und die Summe aller Elemente berechnet.  
Bei `null` oder leerem Array soll `0` zurückgegeben werden.

Beispiel:  
SumArray([1,2,3]) → 6  
SumArray([]) → 0  

---

## Übung 2 (Leicht)

Schreiben Sie eine Funktion **FindMax()**,  
die das größte Element eines Arrays von Zahlen zurückgibt.  
Bei `null` oder leerem Array soll `null` zurückgegeben werden.

Beispiel:  
FindMax([1,5,3]) → 5  
FindMax([]) → null  

---

## Übung 3 (Leicht)

Schreiben Sie eine Funktion **ReverseArray()**,  
die die Reihenfolge der Elemente eines Arrays umkehrt und ein neues Array zurückgibt.

Beispiel:  
ReverseArray([1,2,3]) → [3,2,1]  
ReverseArray([]) → []  

---

## Übung 4 (Fortgeschritten)

Schreiben Sie eine Funktion **Flatten()**,  
die ein verschachteltes Array (z. B. [[1,2],[3,4]]) in ein eindimensionales Array umwandelt.  

Beispiel:  
Flatten([[1,2],[3,4]]) → [1,2,3,4]  
Flatten([]) → []  

---

## Übung 5 (Leicht)

Schreiben Sie eine Funktion **CountOccurrences(array, value)**,  
die zählt, wie oft ein bestimmter Wert in einem Array vorkommt.  

Beispiel:  
CountOccurrences([1,2,3,2],2) → 2  
CountOccurrences([1,1,1],1) → 3  

---

## Übung 6 (Fortgeschritten)

Schreiben Sie eine Funktion **RemoveDuplicates()**,  
die aus einem Array alle doppelten Werte entfernt und ein neues Array mit eindeutigen Werten zurückgibt.

Beispiel:  
RemoveDuplicates([1,2,2,3,1]) → [1,2,3]  
RemoveDuplicates([]) → []  

---

## Übung 7 (Leicht)

Schreiben Sie eine Funktion **MergeArrays(a,b)**,  
die zwei Arrays zusammenführt und als neues Array zurückgibt.

Beispiel:  
MergeArrays([1,2],[3,4]) → [1,2,3,4]  
MergeArrays([],[]) → []  

---

## Übung 8 (Fortgeschritten)

Schreiben Sie eine Funktion **RotateArray(array, k)**,  
die ein Array um k Positionen nach rechts verschiebt.  
Negative k-Werte sollen nach links verschieben.

Beispiel:  
RotateArray([1,2,3,4],1) → [4,1,2,3]  
RotateArray([1,2,3,4],-1) → [2,3,4,1]  

---

## Übung 9 (Leicht)

Schreiben Sie eine Funktion **FilterEvenNumbers()**,  
die aus einem Array nur die geraden Zahlen zurückgibt.

Beispiel:  
FilterEvenNumbers([1,2,3,4,5]) → [2,4]  
FilterEvenNumbers([]) → []  

---

## Übung 10 (Fortgeschritten)

Schreiben Sie eine Funktion **ChunkArray(array, size)**,  
die ein Array in Teilarrays der Länge size zerlegt.  
Ist die Länge nicht exakt teilbar, soll das letzte Teilarray kürzer sein.

Beispiel:  
ChunkArray([1,2,3,4,5],2) → [[1,2],[3,4],[5]]  
ChunkArray([1,2,3],1) → [[1],[2],[3]]  
