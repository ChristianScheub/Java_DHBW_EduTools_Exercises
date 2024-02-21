public class Task {
    public static double calculateInterest() {

       double newInterest;

       double startBalance = 500.0;
       double interestRate = 0.09;
       newInterest = startBalance * Math.pow(1 + interestRate, 2);
       newInterest = Math.round(newInterest * 100.0) / 100.00;

        return newInterest;
    }

    public static void main(String[] args) {

        System.out.println("Kontostand nach 2 Jahren: " + calculateInterest());

    }


}