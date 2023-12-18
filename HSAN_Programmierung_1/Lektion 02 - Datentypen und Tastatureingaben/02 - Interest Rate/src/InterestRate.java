public class InterestRate {
    public static void main(String[] args) {
        System.out.print("Wie viel Kapital in Euro wurde investiert? ");
        double capital = new java.util.Scanner(System.in).nextDouble();

        System.out.print("Wie hoch ist der Zinssatz in %? ");
        int interestRate = new java.util.Scanner(System.in).nextInt();

        System.out.print("Bei welcher Laufzeit? ");
        int duration = new java.util.Scanner(System.in).nextInt();

        double savings_gain = (capital * Math.pow(1 + interestRate / 100.0,  duration)) - capital;
        double savings_total = capital + savings_gain;

        System.out.print("Der Gewinn durch Zinsen betraegt: ");
        System.out.print(savings_gain);
        System.out.println("EUR");

        System.out.print("Nach ");
        System.out.print(duration);
        System.out.print(" Jahren betraegt das angesparte Kapital ");
        System.out.print(savings_total);
        System.out.println("EUR");
    }
}