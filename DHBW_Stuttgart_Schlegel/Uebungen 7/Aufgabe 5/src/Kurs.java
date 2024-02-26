import java.util.Arrays;

public class Kurs {
    private final String titel;
    private boolean kostenlos;
    private String teilnehmer[] = new String[10];
    private int angemeldeteTeilnehmer;
    Kurs(String titel, boolean kostenlos){
        this.titel = titel;
        this.kostenlos = kostenlos;
    }

    public String getTitel() {
        return titel;
    }

    public boolean isKostenlos() {
        return kostenlos;
    }

    public void setKostenlos(boolean kostenlos) {
        this.kostenlos = kostenlos;
    }

    public String[] getTeilnehmer() {
        return teilnehmer;
    }

    public void setTeilnehmer(String[] teilnehmer) {
        this.teilnehmer = teilnehmer;
    }

    public int getAngemeldeteTeilnehmer() {
        return angemeldeteTeilnehmer;
    }

    public void setAngemeldeteTeilnehmer(int angemeldeteTeilnehmer) {
        this.angemeldeteTeilnehmer = angemeldeteTeilnehmer;
    }

    public void addTeilnehmer(String name){
        if(teilnehmer.length>angemeldeteTeilnehmer) {
            teilnehmer[angemeldeteTeilnehmer] = name;
            angemeldeteTeilnehmer++;
        }else{
            teilnehmer = Arrays.copyOf(teilnehmer,teilnehmer.length+1);
            teilnehmer[angemeldeteTeilnehmer] = name;
            angemeldeteTeilnehmer++;
        }
    }
}