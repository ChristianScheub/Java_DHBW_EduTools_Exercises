import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Person {

    private String name;
    private String vorname;
    private int plz;
    private String strasse;
    private int hausnr;

    Comparator<Person> compName = new NameComparator();
    Comparator<Person> compPLZ  = new PLZComparator();

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

    public int getHausnr() {
        return hausnr;
    }

    public Person[] sortByName(Person[] listToSort){


    }

    public Person[] sortByPLZ(Person[] listToSort){



    }

    public String toString() {
        return this.name + ", " + this.vorname + ", " + this.plz + ", " +
                this.strasse + " " + this.hausnr;
    }


}