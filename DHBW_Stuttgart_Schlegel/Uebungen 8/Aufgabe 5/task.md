<h1>Polynom Klasse</h1>
<h2>Aufgabe:</h2>
    <p>
        Entwerfen Sie eine Klasse <code>Polynom</code>, die ein reellwertiges (double) Polynom repräsentiert.
        Die Klasse soll die folgenden Funktionalitäten bereitstellen:
</p>
    <ul>
        <li>Die Koeffizienten des Polynoms sollen als Feld im Konstruktor übergeben werden.</li>
        <li>Die Klasse soll Methoden zur Addition zweier Polynome, zur Bestimmung des Grades eines Polynoms, zur Berechnung der ersten Ableitung eines Polynoms und zur Berechnung des Funktionswerts an einer gegebenen Stelle bereitstellen.</li>
        <li>Achten Sie darauf, Randbedingungen wie das Null-Polynom oder Polynome mit Koeffizienten von 0 beim höchsten Exponenten zu berücksichtigen.</li>
    </ul>
<h2>Polynom Klasse:</h2>
    <p>Die Klasse <code>Polynom</code> soll folgende Funktionalitäten bieten:</p>
    <ul>
        <li>Constructor: Akzeptiert ein Array von Koeffizienten und initialisiert das Polynom.</li>
        <li>grad(): Methode zur Berechnung des Grades des Polynoms.</li>
        <li>addPolynom(Polynom polynom): Methode zur Addition eines anderen Polynoms.</li>
        <li>ableiten(): Methode zur Berechnung der Ableitung des Polynoms.</li>
        <li>wertAnStelle(double x): Methode zur Berechnung des Funktionswerts an einer gegebenen Stelle.</li>
    </ul>
<p><b>Es wird eine Superklasse APolynom gestellt, die die folgenden Dinge beinhaltet</b></p>
<h2>APolynom Klasse:</h2>
<ul>
    <li><strong>Felder:</strong>
        <ul>
            <li><code>koeffizienten</code>: Repräsentiert die Koeffizienten des Polynoms.</li>
        </ul>
    </li>
    <li><strong>Abstrakte Methoden:</strong>
        <ul>
            <li><code>grad()</code>: Abstrakte Methode zur Berechnung des Grades des Polynoms.</li>
            <li><code>addPolynom(Polynom polynom)</code>: Abstrakte Methode zum Hinzufügen eines anderen Polynoms zum aktuellen Polynom.</li>
            <li><code>ableiten()</code>: Abstrakte Methode zur Berechnung der Ableitung des Polynoms.</li>
            <li><code>wertAnStelle(double x)</code>: Abstrakte Methode zur Berechnung des Werts des Polynoms an einem gegebenen Punkt <code>x</code>.</li>
        </ul>
    </li>
    <li><strong>Methoden:</strong>
        <ul>
            <li><code>getKoeffizienten()</code>: Gibt das Koeffizienten-Array zurück.</li>
            <li><code>getKoeffizientLength()</code>: Gibt die Länge des Koeffizienten-Arrays zurück.</li>
            <li><code>equals(Object o)</code></li>
            <li><code>hashCode()</code></li>
        </ul>
    </li>
</ul>
<h2>Gesamtstruktur:</h2>
<ul>
    <li>Die Polynom-Klasse bietet konkrete Implementierungen der abstrakten Methoden, die in APolynom definiert sind.</li>
    <li>Die APolynom-Klasse bietet eine gemeinsame Schnittstelle und gemeinsame Funktionalität für verschiedene Arten von Polynomen.</li>
    <li>Das Design ermöglicht eine einfache Erweiterung und Anpassung des Verhaltens von Polynomen.</li>
</ul>
<div class="hint">
  Die addPolynom Methode muss die grade der beiden Polynome berücksichtigen.
</div>
<p>Erklärung für die addPolynom Methode: </p>
<div class="hint">
    <ol>
        <li>Ermittle den höchsten Grad</li>
        <li>
            Befülle die Koeffizienten Liste des kleineren Grades mit führenden Nullen, damit aus <br>
            1,5x^2+3x+2 + 3x+4 => 1,5x^2+3x+2 + 0x^2+3x+2 <br>
            wird.
        </li>
        <li>Addiere alle Elemente der zwei Arrays.</li>
        <li>Erstelle ein neues Polynom, welches die Summe der zwei Polynome ist.</li>
    </ol>
</div>


