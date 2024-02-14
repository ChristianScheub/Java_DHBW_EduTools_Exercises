public class Person {
    private String name;
    private String vorname;
    private int plz;
    private String strasse;
    private int hausnr;

    public Person(String name, String vorname, int plz, String strasse, int hausnr) {
        this.name = name;
        this.vorname = vorname;
        this.plz = plz;
        this.strasse = strasse;
        this.hausnr = hausnr;
    }

    public String getName() {
        return this.name;
    }

    public String getVorname() {
        return this.vorname;
    }

    public int getPLZ() {
        return this.plz;
    }

    public String getStrasse() {
        return this.strasse;
    }

    public int getHausNummer() {
        return this.hausnr;
    }

}