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
     */
    public double standardDeviation();
}
