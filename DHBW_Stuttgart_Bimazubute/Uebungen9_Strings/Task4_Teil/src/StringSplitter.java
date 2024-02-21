import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringSplitter {
    public void printSubstrings(String input) {
            StringTokenizer st = new StringTokenizer( input );
            ArrayList result = new ArrayList();

            while ( st.hasMoreTokens() ) {
                String t = st.nextToken();
                result.add(t);
            }

            for(int i=0; i < result.size(); i++) {
                System.out.println(result.get(i));
            }
    }
}
