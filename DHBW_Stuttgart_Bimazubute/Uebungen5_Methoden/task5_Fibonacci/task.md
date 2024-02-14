## Berechnung der ersten n Fibonacci-Zahlen

Implementieren Sie eine rekursive Methode in Java, die die ersten n Fibonacci-Zahlen generiert und zurückgibt.

Die Fibonacci-Folge ist eine Sequenz von Zahlen, bei der jede Zahl die Summe der beiden vorherigen Zahlen ist. 

**Beispiel der Fibonacci-Folge:**
- Die ersten fünf Fibonacci-Zahlen sind: 0, 1, 1, 2, 3.
- Die ersten acht Fibonacci-Zahlen sind: 0, 1, 1, 2, 3, 5, 8, 13.

Die Methode `long[] fibonacciNumbers(int n)` sollte als Parameter eine ganze Zahl `n` erhalten und ein Array zurückgeben, das die ersten n Fibonacci-Zahlen enthält.

**Tipp:** Sie können noch eine zweite Methode als helper-Methode implementieren

**Anforderungen:**

1. Implementieren Sie die Methode `fibonacciNumbers` in Java.

2. Beachten Sie, dass n eine nicht-negative ganze Zahl ist. Für n = 0 sollte die Methode ein leeres Array zurückgeben. Für n = 1 sollte das Array `[0]` zurückgegeben werden, und für n = 2 sollte das Array `[0, 1]` zurückgegeben werden.

3. Verwenden Sie eine rekursive Vorgehensweise, um die Fibonacci-Zahlen zu generieren.

