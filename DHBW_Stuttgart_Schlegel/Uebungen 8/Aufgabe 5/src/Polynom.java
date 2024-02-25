import java.util.Arrays;

public class Polynom extends APolynom{
    Polynom(double[] koeffizienten){
        if(koeffizienten == null){
            throw new IllegalArgumentException("Koeffizienten dürfen nicht null sein.");
        }
        if (koeffizienten.length == 0) {
            throw new IllegalArgumentException("Es muss mindestens ein Koeffizient angegeben werden.");
        }
        this.koeffizienten = koeffizienten;
    }
    public int grad(){
        return koeffizienten.length-1;
    }
    public Polynom addPolynom(Polynom polynom) {
        int maxLength = Math.max(this.getKoeffizientLength(), polynom.getKoeffizientLength());
        double[] coeffs1 = padWithZeros(this.koeffizienten, maxLength);
        double[] coeffs2 = padWithZeros(polynom.koeffizienten, maxLength);
        double[] result = new double[maxLength];
        for (int i = 0; i < maxLength; i++) {
            result[i] = coeffs1[i] + coeffs2[i];
        }
        return new Polynom(result);
    }

    private double[] padWithZeros(double[] array, int length) {
        double[] paddedArray = new double[length];
        for (int i = 0; i < array.length; i++) {
            paddedArray[length - array.length + i] = array[i];
        }
        return paddedArray;
    }

    public Polynom ableiten(){
        double[] result = new double[this.getKoeffizientLength()-1];
        if(result.length == 0) return new Polynom(new double[]{0});
        for (int i = koeffizienten.length-1; i > 0 ; i--) {
            result[i-1] = koeffizienten[i] * i;
        }
        return new Polynom(result);
    }
    public double wertAnStelle(double x){
        double y = 0;
        int degree = this.grad();
        for (int i = 0; i <= degree; i++) {
            y += koeffizienten[i] * Math.pow(x, i);
        }
        return y;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Polynom)) return false;
        Polynom other = (Polynom) o;
        return Arrays.equals(this.koeffizienten, other.koeffizienten);
    }
}