import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Person {

    private String name;
    private String vorname;
    private int plz;
    private String strasse;
    private int hausnr;

    static Comparator<Person> compName = new NameComparator();
    static Comparator<Person> compPLZ  = new PLZComparator();

    public Person(String name, String vorname, int plz, String strasse, int hausnr) {
        this.name = name;
        this.vorname = vorname;
        this.plz = plz;
        this.strasse = strasse;
        this.hausnr = hausnr;
    }

    public Person() {}

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public int getPLZ() {
        return plz;
    }

    public String getStrasse() {
        return strasse;
    }

    public int getHausNummer() {
        return hausnr;
    }

    public static Person[] sortByName(Person[] listToSort){
        Arrays.sort(listToSort,compName);
        return listToSort;
    }

    public static Person[] sortByPLZ(Person[] listToSort){
        Arrays.sort(listToSort,compPLZ);
        return listToSort;
    }

    public String toString() {
        return this.name + ", " + this.vorname + ", " + this.plz + ", " +
                this.strasse + " " + this.hausnr;
    }
    private static void ausgeben(Object[] o) {
        for (int i=0 ; i<o.length ; i++) {
            System.out.println(o[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Person[] person = new Person[6];

        person[0] = new Person("Pfleiderer", "Johann", 71032, "Sindelfinger Strasse", 42);
        person[1] = new Person("Schmitz", "Jupp", 50996, "Domgasse", 4711);
        person[2] = new Person("Moser", "Franz", 80336, "Viktualienmarkt", 99);
        person[3] = new Person("Pfeffersack", "Olaf", 22587, "Wasebergstrasse", 42);
        person[4] = new Person("Schmitz", "Jupp", 50765, "Kalifengasse", 19);
        person[5] = new Person("Moser", "Anton", 80336, "Viktualienmarkt", 99);

        sortByName(person);
        ausgeben(person);

        sortByPLZ(person);
        ausgeben(person);
    }


}