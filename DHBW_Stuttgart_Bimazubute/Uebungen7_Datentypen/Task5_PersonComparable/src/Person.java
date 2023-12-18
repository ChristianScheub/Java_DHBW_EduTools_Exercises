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

    @Override
    public int compareTo(Person otherPerson) {

        // Vergleiche die Attribute in der genannten Reihenfolge

    }

}