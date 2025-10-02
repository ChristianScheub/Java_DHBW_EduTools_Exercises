/// # Exam Aufgabe
///
/// - Die Struktur (Name, Parameter, Modifier) der gegebenen Methoden darf nicht verändert werden.
/// - Eigene (Hilfs-)Methoden dürfen erstellt und verwendet werden.
/// - Die vorgegebenen Exam-Methoden werden zur finalen Prüfung verwendet.
/// - Die `main`-Methode kann zum Test der Implementierung verwendet werden.
public class ExamTask4
{
    /// Implementieren Sie eine Funktion PostponeMeeting(time. difference),
    /// welche eine natürliche Zahl entgegennimmt,
    /// die eine Uhrzeit eines Meetings repräsentiert und eine zweite natürliche Zahl, welche die Verschiebung in Sekunden angibt. Die Methode soll nun die Uhrzeit des Meetings um die angegebene Zeit verschieben und die neue Uhrzeit zurückgeben.
    /// Sollte einer der Parameter ungültig sein, so gibt die Funktion -1 zurück.
    /// Beachten Sie, dass ein Tag nur 24 Stunden hat.
    /// Ermitteln Sie den Überlauf der Stunden und Minuten, sofern notwendig.
    ///
    /// Beispiel:
    /// PostponeMeeting(1030,240)   -> 1034
    /// Da 240 sekunden 4 Minuten entsprechen.
    /// PostponeMeeting(0,240)      -> 4
    /// PostponeMeeting(-15,32397)  -> -1
    /// PostponeMeeting(2359,60)    -> 0
    public static int PostponeMeeting(int time, int difference) {
        // Ungültige Eingaben abfangen
        if (time < 0 || difference < 0) return -1;

        // Zeit zerlegen: Stunden und Minuten
        int hours = time / 100;
        int minutes = time % 100;

        // Sekunden in Minuten umrechnen
        int extraMinutes = difference / 60;
        minutes += extraMinutes;

        // Überlauf der Minuten auf Stunden übertragen
        hours += minutes / 60;
        minutes = minutes % 60;

        if (hours >= 24) {
            hours = hours % 24; // Überlauf der Stunden auf den nächsten Tag übertragen
        }

        // Uhrzeit wieder zusammensetzen (z.B. 10:34 → 1034)
        return hours * 100 + minutes;
    }

    /// Zum testen!
	public static void main(final String[] args)
	{
		// Hier koennen sie ihren eigenen Code zum Testen der Methode hinterlegen
	}
}