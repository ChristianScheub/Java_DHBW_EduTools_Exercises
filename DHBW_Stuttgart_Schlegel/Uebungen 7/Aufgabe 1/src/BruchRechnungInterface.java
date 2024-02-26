public interface BruchRechnungInterface {
    /**
     *
     * @param zaehler zaehler des zu erstellenden Bruchs
     * @param nenner nenner des zu erstellenden Bruchs
     * @return Bruch-Objekt
     */
    Bruch init(int zaehler, int nenner);

    /**
     *
     * @param bruch bruch welcher gekuerzt werden soll
     * @return Bruch Objekt in gekürzter Fassung.
     * 9/81 → 1/9
     */
    Bruch kuerzen(Bruch bruch);

    /**
     *
     * @param faktor1
     * @param faktor2
     * @return das Produkt der zwei Brüche als gekuerzter Bruch
     */
    Bruch multTo(Bruch faktor1,Bruch faktor2);

    /**
     *
     * @param summant1
     * @param summant2
     * @return die Summe der zwei Brüche als geküerzter Bruch
     */
    Bruch addTo(Bruch summant1, Bruch summant2);
}
