<h1>Modellierung eines Bankbetriebs</h1>
    <p><strong>Achtung:</strong> Bitte lesen Sie vor Beginn der Programmierung das Aufgabenblatt ganz durch!</p>
    <h2>Klassenstruktur</h2>
    <h3>Klasse Bank</h3>
    <p>Die Klasse <em>Bank</em> beschreibt eine konkrete Bank und verwaltet eine Sammlung aller Konten.</p>
    <h3>Klasse Konto</h3>
    <p>Die abstrakte Superklasse <em>Konto</em> definiert die Gemeinsamkeiten der Kontentypen.</p>
    <ul>
        <li><strong>Datenfelder:</strong></li>
        <ul>
            <li>Inhaber (String)</li>
            <li>KontoNR (int)</li>
            <li>Kontostand (double)</li>
        </ul>
        <li><strong>Methoden:</strong></li>
        <ul>
            <li>getInhaber(): String</li>
            <li>getKontoNR(): int</li>
            <li>getKontostand(): double</li>
            <li>setKontostand(double): void</li>
            <li>einAusZahlung(double): void</li>
        </ul>
    </ul>
    <h3>Klasse GiroKonto</h3>
    <p>Die Klasse <em>GiroKonto</em> erweitert die Klasse <em>Konto</em> für Girokonten.</p>
    <ul>
        <li><strong>Zusätzliche Datenfelder:</strong></li>
        <ul>
            <li>sZins (double)</li>
            <li>gbuehr (double)</li>
        </ul>
        <li><strong>Zusätzliche Methoden:</strong></li>
        <ul>
            <li>monatsAbrechnung(): void</li>
            <li>toString(): String</li>
        </ul>
    </ul>
    <h3>Klasse SparKonto</h3>
    <p>Die Klasse <em>SparKonto</em> erweitert die Klasse <em>Konto</em> für Sparkonten.</p>
    <ul>
        <li><strong>Zusätzliches Datenfeld:</strong></li>
        <ul>
            <li>hZins (double)</li>
        </ul>
        <li><strong>Zusätzliche Methode:</strong></li>
        <ul>
            <li>jahresZins(): void</li>
            <li>toString(): String</li>
        </ul>
    </ul>
    <h2>Klasse Bank</h2>
    <p>Die Klasse <em>Bank</em> verwaltet eine Liste von Konten.</p>
    <ul>
        <li><strong>Methoden:</strong></li>
        <ul>
            <li>genAccNr(): int</li>
            <li>addAccount(String, Kontotyp): void</li>
            <li>getKonten(): List&lt;Konto&gt;</li>
            <li>alleKontos(): String</li>
        </ul>
    </ul>