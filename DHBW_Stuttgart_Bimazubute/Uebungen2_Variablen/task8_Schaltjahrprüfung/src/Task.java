public class Task {
    public static boolean findLeapYear(int year) {

        boolean isLeapYear;

        isLeapYear = (year % 4 == 0);
        isLeapYear = isLeapYear && (year % 100 !=0);
        isLeapYear = isLeapYear  || (year % 400 == 0);

        return isLeapYear;
    }


    public static void main(String[] args) {

        System.out.println("Ist 2000 ein Schaltjahr: " + findLeapYear(2000));
        System.out.println("Ist 2001 ein Schaltjahr: " + findLeapYear(2001));


    }

}
