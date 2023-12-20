# Auswertung von Ausdrücken mit dem ternären Operator in Java

Der ternäre Operator in Java ist eine verkürzte Form der `if-else`-Anweisung und kann verwendet werden, um kurze Entscheidungen zu treffen. In dieser Aufgabe werden Sie untersuchen, wie der ternäre Operator funktioniert, indem Sie die Ausgabe eines Codeausschnitts bei verschiedenen Eingaben vorhersagen.

Betrachten Sie den folgenden Programmteil:

```java
java.util.Scanner scan = new java.util.Scanner(System.in);
int i = scan.nextInt(); 
System.out.println(i < 0 ? (i + 1) : ((i == 0 ? (i + 2) : (i + 3)) + 1));
