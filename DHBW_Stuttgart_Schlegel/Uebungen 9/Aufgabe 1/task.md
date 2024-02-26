<h1>Aufgabe 1: Fehlerbehandlung in Java</h1>
    <p>Die folgende Java-Klasse verursacht beim Übersetzen zwei Fehlermeldungen.</p>
    <p>a. Erläutern Sie diese Meldungen, insbesondere die darin vorgeschlagenen Korrekturmöglichkeiten.</p>
    <p>b. Korrigieren Sie beide Fehler durch Einfügen von "catch"-Klauseln.</p>
    <p>c. Demonstrieren Sie die Wirksamkeit ihrer Ausnahmebehandlung anhand einer "java.io.FileNotFoundException" zur Laufzeit eines Java-Programmes, das die Klasse "InputFile" verwendet.</p>
    <p>d. Wie würde sich die Reaktion auf die Ausnahme verändern, wenn statt der "catch"-Klausel eine "throws"-Klausel verwendet und das Hauptprogramm entsprechend angepasst worden wäre?</p>
<div class="hint"><p>
  Die Fehlermeldungen beim Übersetzen dieser Java-Klasse lauten:
    Unhandled exception type FileNotFoundException
    Unhandled exception type IOException
    Die erste Fehlermeldung besagt, dass die Methode FileInputStream eine Checked Exception vom Typ FileNotFoundException auslöst, die nicht behandelt wird. Dies bedeutet, dass der Compiler verlangt, dass der Code, der die FileInputStream-Instanz erstellt, die Ausnahmebehandlung für FileNotFoundException implementiert.
    Die zweite Fehlermeldung tritt auf, weil die read()-Methode von FileInputStream eine Checked Exception vom Typ IOException auslöst, die ebenfalls nicht behandelt wird. Auch hier verlangt der Compiler eine Ausnahmebehandlung für IOException.
</p></div>
<div class="hint">
    Verwendung von "throws"-Klauseln:
    Wenn anstelle von try-catch-Klauseln throws-Klauseln verwendet würden und das Hauptprogramm entsprechend angepasst würde, müsste das Hauptprogramm die Ausnahmebehandlung durchführen. Das würde bedeuten, dass das Hauptprogramm, das die InputFile-Klasse verwendet, die FileNotFoundException behandeln müsste, indem es entweder selbst eine try-catch-Klausel verwendet oder die Ausnahme an die übergeordnete Methode weitergibt.
</div>

