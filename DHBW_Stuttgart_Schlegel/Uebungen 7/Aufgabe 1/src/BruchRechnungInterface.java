public interface BruchRechnungInterface {
    Bruch init(int zaehler, int nenner);

    Bruch kürzen(Bruch bruch);

    String toString(Bruch bruch);
    Bruch multTo(Bruch faktor1,Bruch faktor2);
    Bruch addTo(Bruch summant1, Bruch summant2);
}
