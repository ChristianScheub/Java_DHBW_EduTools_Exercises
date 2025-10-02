/// # Exam Aufgabe
///
/// - Die Struktur (Name, Parameter, Modifier) der gegebenen Methoden darf nicht verändert werden.
/// - Eigene (Hilfs-)Methoden dürfen erstellt und verwendet werden.
/// - Die vorgegebenen Exam-Methoden werden zur finalen Prüfung verwendet.
/// - Die `main`-Methode kann zum Test der Implementierung verwendet werden.
public class ExamTask1
{
    /// Erstellen Sie eine Funktion Add welche zwei ganze Zahlen als parameter überreicht bekommt und diese addiert.
    ///
    /// Beispiel:
    /// Add(1,2) -> 3
    /// Add(4,-5) -> -1
    ///
    /// Schaffen Sie es die Funktion zu erstellen ohne Variablen zu verwenden?
	public static int Add(int a, int b)
	{
        return a+b;
	}

	/// Zum Testen!
	public static void main(final String[] args)
	{
		// Hier koennen sie ihren eigenen Code zum Testen der Methode hinterlegen
        System.out.println("test");
	}
}
