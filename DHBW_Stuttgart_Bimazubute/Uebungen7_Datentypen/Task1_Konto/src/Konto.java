import java.util.ArrayList;
import java.util.Collections;

public class Konto implements Comparable<Konto> {

    private int kontonummer;

    public Konto(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    public Konto() {

    }

    public int getKontonummer() {
        return kontonummer;
    }

    public ArrayList<Konto> sortKonten(ArrayList<Konto> kontenToSort){

        Collections.sort(kontenToSort);
        return kontenToSort;

    }

    @Override
    public int compareTo(Konto other) {
        return Integer.compare(this.kontonummer, other.kontonummer);
    }

}