public class InvertString {

    public static String invert(String input) {
        int length = input.length();
        StringBuilder result = new StringBuilder();
        for ( int i = length - 1; i >= 0; i-- )
        {
            result.append( input.charAt( i ) );
        }
        return result.toString();
    }

    public static void main( String[] args )
    {
        String input = "hallo";
        String result = invert(input);
        System.out.println("Invertiert: "+ result);
    }

}
