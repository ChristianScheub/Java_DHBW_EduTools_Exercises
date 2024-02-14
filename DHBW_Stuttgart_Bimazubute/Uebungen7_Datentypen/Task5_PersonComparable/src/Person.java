public class Person implements Comparable<Person> {
    private String name;
    private String vorname;
    private int postleitzahl;
    private String strasse;
    private int hausnummer;

    public Person(String name, String vorname, int postleitzahl, String strasse, int hausnummer) {
        this.name = name;
        this.vorname = vorname;
        this.postleitzahl = postleitzahl;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
    }

    // Getter- und Setter-Methoden hier einfügen

    @Override
    public int compareTo(Person other) {
        // Vergleiche die Attribute in der genannten Reihenfolge
        int result = this.name.compareTo(other.name);
        if (result == 0) {
            result = this.vorname.compareTo(other.vorname);
            if (result == 0) {
                result = Integer.compare(this.postleitzahl, other.postleitzahl);
                if (result == 0) {
                    result = this.strasse.compareTo(other.strasse);
                    if (result == 0) {
                        result = Integer.compare(this.hausnummer, other.hausnummer);
                    }
                }
            }
        }
        return result;
    }

}