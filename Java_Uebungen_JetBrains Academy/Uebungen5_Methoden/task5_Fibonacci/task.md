**Aufgabentext: Berechnung der ersten n Fibonacci-Zahlen**

Ihre Aufgabe besteht darin, eine rekursive Methode in Java zu implementieren, die die ersten n Fibonacci-Zahlen generiert und zurückgibt.

Die Fibonacci-Folge ist eine Sequenz von Zahlen, bei der jede Zahl (ab der dritten Zahl) die Summe der beiden vorherigen Zahlen ist. Die ersten beiden Zahlen der Fibonacci-Folge sind normalerweise 0 und 1.

**Beispiel der Fibonacci-Folge:**
- Die ersten fünf Fibonacci-Zahlen sind: 0, 1, 1, 2, 3.
- Die ersten acht Fibonacci-Zahlen sind: 0, 1, 1, 2, 3, 5, 8, 13.

**Ihre Methode `fibonacciNumbers`** sollte als Parameter eine ganze Zahl `n` erhalten und ein Array zurückgeben, das die ersten n Fibonacci-Zahlen enthält.

**Anforderungen:**

1. Implementieren Sie die Methode `fibonacciNumbers` in Java.

2. Beachten Sie, dass n eine nicht-negative ganze Zahl ist. Für n = 0 sollte die Methode ein leeres Array zurückgeben. Für n = 1 sollte das Array `[0]` zurückgegeben werden, und für n = 2 sollte das Array `[0, 1]` zurückgegeben werden.

3. Verwenden Sie eine rekursive Vorgehensweise, um die Fibonacci-Zahlen zu generieren. In den rekursiven Aufrufen sollten Sie die vorherigen Fibonacci-Zahlen verwenden, um die nächsten zu berechnen.

4. Geben Sie das Array mit den ersten n Fibonacci-Zahlen als Ergebnis zurück.

**Beispiel:**

```java
int[] fibonacci = fibonacciNumbers(5);
// Das Ergebnis sollte das Array [0, 1, 1, 2, 3] sein.
