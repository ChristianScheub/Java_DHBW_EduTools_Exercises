public class Main {
    public static void main(String[] args) {
        Datum heute = new Datum(23, 4, 2024);
        System.out.println("Heute ist: " + heute.wochentag());
        System.out.println("Morgen ist: " + heute.morgen());
        System.out.println("Gestern war: " + heute.gestern());
        System.out.println("In 5 Tagen ist: " + heute.plusMinusTage(5));
        System.out.println("In 10 Tagen war: " + heute.plusMinusTage(-10));
        System.out.println("Tage seit Christi Geburt " + heute.tageSeitChristiGeburt());
        Datum geburtstag = new Datum(1, 1, 2000);
        System.out.println("Tage seit Geburtstag: " + heute.tageAbstand(geburtstag));
    }
}
