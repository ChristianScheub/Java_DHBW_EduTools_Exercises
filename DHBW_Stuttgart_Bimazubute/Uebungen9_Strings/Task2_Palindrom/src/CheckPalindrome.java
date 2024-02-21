public class CheckPalindrome {

    public static boolean isPalindrome(String input) {
        String rev = reverse(input.toLowerCase());

        boolean result = false;

        if(rev.equals(input.toLowerCase())) {
            result=true;
        }

        return result;
    }

    public static String reverse( String stringToReverse ) {
        int length = stringToReverse.length();
        StringBuilder result = new StringBuilder();
        for ( int i = length - 1; i >= 0; i-- )
        {
            result.append( stringToReverse.charAt( i ) );
        }
        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("Radar"));
        System.out.println(isPalindrome("Hallo"));

    }

}
