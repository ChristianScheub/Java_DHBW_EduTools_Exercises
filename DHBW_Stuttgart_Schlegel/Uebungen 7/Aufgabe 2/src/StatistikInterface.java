public interface StatistikInterface {
    /**
     *
     * @return den kleinsten Wert der Menge
     */
    public double minValue();

    /**
     *
     * @return den größten Wert der Menge
     */
    public double maxValue();

    /**
     *
     * @return den durchschnitt der Menge
     */
    public double meanValue();

    /**
     *
     * @return die Standartabweichung der Menge berechnet durch die Wurzel des Durchschnitts aller
     * Varianzen von den Elementen der Menge
     * Varianz = (Wert x - durchschnitt der Menge)^2
     * Abweichung = Wurzel((Varianz[1]+Varianz[2]+...)/Mächtigkeit der Menge)
     * Die Erklärung auf Wikipedia ist ausführlicher
     */
    public double standardDeviation();
}
