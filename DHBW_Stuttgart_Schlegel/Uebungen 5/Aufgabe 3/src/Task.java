public class Task {
    public static double potenz(double zahl, int pot) {
        double result = 0;

        if (pot == 0)
        {
            result = 1;
        }
        else if( pot < 0 )
        {
            result = 1 / potenz(zahl, pot * -1);
        }
        else
        {
            result = zahl * potenz(zahl, pot - 1);
        }

        return result;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("potenz(2.0, 3) == "+ potenz(2.0, 3));
        System.out.println("potenz(2.0, -3) == "+potenz(2.0,-3));
    }
}
