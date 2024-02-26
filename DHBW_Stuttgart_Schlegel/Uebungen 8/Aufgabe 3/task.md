<h1>Autoreparaturwerkstatt Programm</h1>
<p>Eine Autoreparaturwerkstatt benötigt ein Programm zur Verwaltung ihrer 5 Reparaturplätze. Das Programm besteht aus der Klasse Werkstatt und aus der Klasse Fahrzeug.</p>
<h2>Klasse Fahrzeug</h2>
<p>Die Klasse Fahrzeug soll folgende private Datenfelder besitzen:</p>
<ul>
  <li>fahrzeugTyp vom Typ String</li>
  <li>eigentuemer vom Typ String</li>
</ul>
<p>sowie die jeweiligen Getter Methoden:</p>
<h2>Klasse Werkstatt</h2>
<p>Die Klasse Werkstatt soll als Datenfeld ein Array zur Verfügung stellen, in dem Objekte der Klasse Fahrzeug abgelegt werden können. Die Erzeugung des Arrays soll im Konstruktor der Klasse Werkstatt vorgenommen werden. Die Arraylänge, die dem Konstruktor durch einen Parameter übergeben wird, ergibt sich aus der Anzahl der Reparaturplätze des neu erzeugten Werkstatt-Objekts.</p>
<p>Die Klasse Werkstatt soll folgende Methoden beinhalten:</p>
<ul>
  <li>addFahrzeug (Meldet ein Fahrzeug an einem Reparaturplatz an)</li>
  <li>removeFahrzeug (Meldet ein Fahrzeug von einem Reparaturplatz ab, d.h. Reparatur beendet)</li>
  <li>druckeListe (gibt eine Liste aller Arbeitsplätze und deren Belegung (Fahrzeugtyp und Eigentümer) aus)</li>
</ul>
<p>Beachten Sie, dass immer nur ein Fahrzeug an einem Arbeitsplatz angemeldet werden kann!</p>
<p>
drucke Liste bitte in dem Format: <br>
Platz : 123 Fahrzeug{"Fahrzeug{ typ = typ , eigentuemer = eigentuemer }
oder
123 Fahrzeug{(info wie oben)};
</p>
