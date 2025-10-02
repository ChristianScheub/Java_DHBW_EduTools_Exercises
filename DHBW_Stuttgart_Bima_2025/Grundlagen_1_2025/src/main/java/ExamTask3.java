/// # Exam Aufgabe
///
/// - Die Struktur (Name, Parameter, Modifier) der gegebenen Methoden darf nicht verändert werden.
/// - Eigene (Hilfs-)Methoden dürfen erstellt und verwendet werden.
/// - Die vorgegebenen Exam-Methoden werden zur finalen Prüfung verwendet.
/// - Die `main`-Methode kann zum Test der Implementierung verwendet werden.
public class ExamTask3
{
	/// Implementieren Sie eine Funktion GetSmallestDivisor(),
    /// welche eine natürliche Zahl entgegennimmt und deren kleinsten natürlichen Divisor findet, der nicht 1 ist.
    /// Sollte die Zahl eine Primzahl sein, so gibt die Funktion 1 zurück.
    /// Falls die Zahl keine natürliche Zahl ist, gibt die Funktion 0 zurück.
    ///
    /// Tipp: Ist die 0 eine natürliche Zahl?
    ///
    /// Beispiel:
    /// GetSmallestDivisor(25)  -> 5
    /// GetSmallestDivisor(7)   -> 1
    /// GetSmallestDivisor(-17) -> 0
	public static int GetSmallestDivisor(int p_number)
	{
		if (p_number <= 0) return 0; // If-Statements can include code in the same or next line without brackets.
        if (p_number <= 3) return 1;

        for (int i = 2; i <= Math.sqrt(p_number); i++) {
            // Da Wurzel p_number zum Quadrat p_number ergibt, kann der kleinste Teiler nicht größer
            // als Wurzel p_number sein, da ansonsten beide Faktoren multipliziert größer als Wurzel p_number zum Quadrat
            // wären, aber auch gleichzeitig p_number sind. Dies ist ein Widerspruch.
            if (p_number % i == 0) {
                return i;
            }
        }
        return 1; // Sofern es keinen Teiler gibt ist es eine Primzahl.
	}

    /// Zum testen!
	public static void main(final String[] args)
	{
		// Hier koennen sie ihren eigenen Code zum Testen der Methode hinterlegen
	}
}