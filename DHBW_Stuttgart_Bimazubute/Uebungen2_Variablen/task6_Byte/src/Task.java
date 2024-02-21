public class Task {
    public static byte addOneToMaxByte(byte b) {

        b ++;

        return b;
    }

    public static void main(String[] args) {

        byte b = Byte.MAX_VALUE;

        System.out.println("Wert von b: "+b);
        System.out.println("Wert von b + 1: " + addOneToMaxByte(b));

        // Nach Überschreiten des Maximalwertes (127) springt der Inhalt der Variable
        // auf den Minimalwert (-128) von Byte zurück.

    }
}
