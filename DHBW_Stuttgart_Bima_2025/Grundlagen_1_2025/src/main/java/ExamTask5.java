/// # Exam Aufgabe
///
/// - Die Struktur (Name, Parameter, Modifier) der gegebenen Methoden darf nicht verändert werden.
/// - Eigene (Hilfs-)Methoden dürfen erstellt und verwendet werden.
/// - Die vorgegebenen Exam-Methoden werden zur finalen Prüfung verwendet.
/// - Die `main`-Methode kann zum Test der Implementierung verwendet werden.
public class ExamTask5
{
	/// ## Übung 2 (Fortgeschritten)
    ///
    /// Implementieren Sie eine Funktion isGatekeeper(),
    /// welche eine ganze Natürliche Zahl entgegen nimmt und zurückgibt ob die Übergebene Zahl eine Gatekeeperzahl ist.
    /// Eine Gatekeeperzahl ist eine mindestens dreistellige Natürliche Zahl welche durch ihre erste und letzte Ziffer teilbar ist.
    /// Dementsprechend ist 192 eine Gatekeeperzahl, da es sowhol durch 1 als 2 teilbar ist.
    /// Nicht natürliche Zahlen oder Zahlen mit weniger als drei Ziffern sind keine Gatekeeperzahlen.
    ///
    /// Beispiel:
    /// isGatekeeper(192)   -> true
    /// isGatekeeper(-192)  -> false
    /// isGatekeeper(36)    -> false
    /// isGatekeeper(100)   -> false
    ///
    /// Tipp: Benutzen Sie '%' als Rechenoperator, so erhalten Sie den Rest einer Division 25 % 10 = 5
	public static boolean isGatekeeper(int p_number)
	{
        if (p_number < 100) return false;

        int digit1 = p_number % 10;
        if (digit1 == 0) return false;
        int digit2 = p_number;
        for (;digit2 > 10;) {
            digit2 /= 10;
        }
        return (p_number % digit1 == 0) && (p_number % digit2 == 0);
	}

    /// Zum testen!
	public static void main(final String[] args)
	{
		// Hier koennen sie ihren eigenen Code zum Testen der Methode hinterlegen
	}
}