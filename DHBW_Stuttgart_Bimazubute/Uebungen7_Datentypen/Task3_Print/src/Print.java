import java.util.List;
import java.util.Iterator;

public class Print {
    public static void printList(List<?> list) {
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}