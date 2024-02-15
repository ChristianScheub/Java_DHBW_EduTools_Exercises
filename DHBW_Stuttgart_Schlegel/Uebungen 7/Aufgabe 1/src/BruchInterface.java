public interface BruchInterface {
    /**
     *
     * @return gibt den Nenner des Bruchs zurück
     */
    int getNenner();

    /**
     *
     * @return gibt den Zähler des Bruchs zurück
     */
    int getZaehler();

    /**
     *
     * @return gibt den Bruch im Format 'Zaehler / Nenner = Zahl' aus
     */
    String toString();

}
