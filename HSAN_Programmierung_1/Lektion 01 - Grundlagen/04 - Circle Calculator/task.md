Diese Aufgabe besteht aus mehreren Schritten.
Führen Sie diese in der angegebenen Reihenfolge aus.

1. Erstellen Sie eine neue Klasse mit dem Namen `CircleCalculator`
2. Fügen Sie dieser Klasse eine `main()`-Methode hinzu
3. Fügen Sie den nachfolgenden Code in die `main()`-Methode ein

    ```java
    double r = 3;
    double pi = 3.14159265359;
    
    double u = 2 * pi * r;
    double f = pi * r * r;
    
    System.out.printf("Der Wert von u lautet: %3.2f, unformatiert: ", u);
    System.out.println(u);
    
    System.out.printf("Der Wert von f lautet: %4.5f, unformatiert: ", f);
    System.out.println(f);
    ```
   Prüfen Sie danach ihre Implementierung.
   
4. Machen Sie sich den Unterschied der Methoden `println()` und `printf()` bewusst, indem Sie diese im Internet recherchieren.

5. Versuchen Sie herauszufinden, was die Angaben `%3.2f` sowie `%4.5f` im Rahmen der `printf()`-Aufrufe bewirken.