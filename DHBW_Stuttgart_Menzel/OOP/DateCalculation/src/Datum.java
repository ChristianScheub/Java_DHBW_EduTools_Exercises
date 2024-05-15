public class Datum {
    private int tag;
    private int monat;
    private int jahr;

    // Konstruktor
    public Datum(int tag, int monat, int jahr) {
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }

    // Getter und Setter
    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getMonat() {
        return monat;
    }

    public void setMonat(int monat) {
        this.monat = monat;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    // toString Methode
    @Override
    public String toString() {
        return tag + "." + monat + "." + jahr;
    }

    // Methode, um das Datum als String zu erhalten
    public String formatierteDatum() {
        return tag + "." + monat + "." + jahr;
    }

    // Methode, um das Datum von morgen zu erhalten
    public Datum morgen() {
        int neuerTag = tag + 1;
        int neuerMonat = monat;
        int neuesJahr = jahr;

        // Überprüfen, ob ein Monatswechsel stattfindet
        if (neuerTag > tageImMonat(monat, jahr)) {
            neuerTag = 1;
            neuerMonat++;
            if (neuerMonat > 12) {
                neuerMonat = 1;
                neuesJahr++;
            }
        }

        return new Datum(neuerTag, neuerMonat, neuesJahr);
    }

    // Methode, um das Datum von gestern zu erhalten
    public Datum gestern() {
        int neuerTag = tag - 1;
        int neuerMonat = monat;
        int neuesJahr = jahr;

        // Überprüfen, ob ein Monatswechsel stattfindet
        if (neuerTag < 1) {
            neuerMonat--;
            if (neuerMonat < 1) {
                neuerMonat = 12;
                neuesJahr--;
            }
            neuerTag = tageImMonat(neuerMonat, neuesJahr);
        }

        return new Datum(neuerTag, neuerMonat, neuesJahr);
    }

    // Methode, um das Datum um eine bestimmte Anzahl von Tagen zu erhöhen oder zu verringern
    public Datum plusMinusTage(int tage) {
        if (tage >= 0) {
            for (int i = 0; i < tage; i++) {
                this.tag++;
                if (this.tag > tageImMonat(this.monat, this.jahr)) {
                    this.tag = 1;
                    this.monat++;
                    if (this.monat > 12) {
                        this.monat = 1;
                        this.jahr++;
                    }
                }
            }
        } else {
            for (int i = 0; i > tage; i--) {
                this.tag--;
                if (this.tag < 1) {
                    this.monat--;
                    if (this.monat < 1) {
                        this.monat = 12;
                        this.jahr--;
                    }
                    this.tag = tageImMonat(this.monat, this.jahr);
                }
            }
        }
        return new Datum(this.tag, this.monat, this.jahr);
    }

    // Methode, um die Anzahl der Tage zwischen zwei Daten zu berechnen
    public int tageAbstand(Datum d) {
        int tage = 0;
        Datum tempDatum = new Datum(tag, monat, jahr);

        while (!tempDatum.equals(d)) {
            if (tempDatum.compareTo(d) < 0) {
                tempDatum = tempDatum.morgen();
            } else {
                tempDatum = tempDatum.gestern();
            }
            tage++;
        }
        return tage;
    }

    // Methode, um den Wochentag des Datums zu bestimmen
    public String wochentag() {
        String[] wochentage = {"Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};
        int tageSeitEpoch = tageSeitEpoch();
        int wochentagIndex = (tageSeitEpoch + 6) % 7; // Offset für den 1. Januar 1970 (Donnerstag)
        return wochentage[wochentagIndex];
    }

    // Methode, um die Anzahl der Tage seit einem festen Datum (hier: 1. Januar 1970) zu berechnen
    private int tageSeitEpoch() {
        Datum epoch = new Datum(1, 1, 1970);
        return tageAbstand(epoch);
    }

    // Methode, um die Anzahl der Tage in einem bestimmten Monat eines bestimmten Jahres zu bekommen
    private int tageImMonat(int monat, int jahr) {
        boolean schaltjahr = istSchaltjahr(jahr);
        int[] tageImMonat = {31, (schaltjahr ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return tageImMonat[monat - 1];
    }

    // Methode zur Überprüfung, ob ein Jahr ein Schaltjahr ist
    private boolean istSchaltjahr(int jahr) {
        return (jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0));
    }

    // equals-Methode, um zu prüfen, ob zwei Datum-Objekte gleich sind
    public boolean equals(Datum d) {
        return (this.tag == d.getTag() && this.monat == d.getMonat() && this.jahr == d.getJahr());
    }

    // compareTo-Methode, um die Reihenfolge von zwei Datum-Objekten zu vergleichen
    public int compareTo(Datum d) {
        if (this.jahr != d.getJahr()) {
            return this.jahr - d.getJahr();
        } else if (this.monat != d.getMonat()) {
            return this.monat - d.getMonat();
        } else {
            return this.tag - d.getTag();
        }
    }
    // Methode zur Berechnung der Anzahl der Tage bis zu einem festen Datum
    int tageSeitChristiGeburt() {
        Datum christiGeburt = new Datum(25, 12, 1); // Annahme des Datums von Christi Geburt
        return tageAbstand(christiGeburt);
    }
}
