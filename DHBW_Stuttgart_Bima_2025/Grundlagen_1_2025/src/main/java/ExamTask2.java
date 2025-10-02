/// # Exam Aufgabe
///
/// - Die Struktur (Name, Parameter, Modifier) der gegebenen Methoden darf nicht verändert werden.
/// - Eigene (Hilfs-)Methoden dürfen erstellt und verwendet werden.
/// - Die vorgegebenen Exam-Methoden werden zur finalen Prüfung verwendet.
/// - Die `main`-Methode kann zum Test der Implementierung verwendet werden.
public class ExamTask2
{
	/// Implementieren Sie eine Funktion DestroyAliens(),
    /// welche einen String entgegennimmt und jede Erwähnung des Wortes 'Alien' entfernt.
    /// Groß- oder Kleinschreibung soll nicht beachtet werden.
    ///
    /// Beispiel:
    /// DestroyAliens('')                   -> ''
    /// DestroyAliens(null)                 -> ''
    /// DestroyAliens('Apfel')              -> 'Apfel'
    /// DestroyAliens('Alien')              -> ''
    /// DestroyAliens('Da ist ein Alien!')  -> 'Da ist ein !'
    /// DestroyAliens('AlIeN')              -> ''
    /// DestroyAliens('AAALiennn')          -> 'AAnn'
	public static String DestroyAliens(String p_string)
	{
        if (p_string == null || p_string.isEmpty()) return "";
        return p_string.replaceAll("(?i)Alien", "");

        /*
            Studenten-freundlichere Lösung ohne doofe REGEX :D

            // Wir wandeln den Text in Kleinbuchstaben um, um "Alien" in jeder Schreibweise zu finden
            String lower = input.toLowerCase();

            // Suchen nach "alien"
            int index = lower.indexOf("alien");
            while (index != -1) {
            // Entfernen: links + rechts zusammensetzen
            input = input.substring(0, index) + input.substring(index + 5);
            lower = input.toLowerCase(); // nach jeder Änderung neu prüfen
            index = lower.indexOf("alien");
            }

            return input;
         */

	}

    /// Zum testen!
	public static void main(final String[] args)
	{
		// Hier koennen sie ihren eigenen Code zum Testen der Methode hinterlegen

	}
}
