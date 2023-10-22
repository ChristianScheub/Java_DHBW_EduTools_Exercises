## Aufgabenstellung: Multiplikationstabelle

### Ziel

Erstellen Sie ein Java-Programm namens `Task`, das den Benutzer auffordert, eine ganze Zahl `n` einzugeben. Das Programm sollte dann die Multiplikationstabelle für diese Zahl ausgeben.

### Anforderungen:

1. Das Programm sollte den Benutzer mit der folgenden Aufforderung um Eingabe bitten: "Bitte geben Sie eine Zahl für die Multiplikationstabelle ein: ".
2. Nachdem der Benutzer eine Zahl eingegeben hat, sollte das Programm die Multiplikationstabelle für diese Zahl bis zu `n` ausgeben.
3. Die Ausgabe sollte im folgenden Format erfolgen:
   ```
   1 x n = n
   2 x n = 2n
   ...
   n x n = n^2
   ```
4. Wenn der Benutzer keine gültige Zahl eingibt, sollte das Programm eine Fehlermeldung ausgeben und beenden.

### Beispiel:

Für die Eingabe `3` sollte die Ausgabe wie folgt aussehen:

```
Bitte geben Sie eine Zahl für die Multiplikationstabelle ein: 1 x 3 = 3
2 x 3 = 6
3 x 3 = 9
```

### Tests:

Stellen Sie sicher, dass Ihr Programm die obige Ausgabe für die gegebene Eingabe korrekt ausgibt. Ein JUnit-Test wird bereitgestellt, um die Funktionalität Ihres Programms zu überprüfen.
