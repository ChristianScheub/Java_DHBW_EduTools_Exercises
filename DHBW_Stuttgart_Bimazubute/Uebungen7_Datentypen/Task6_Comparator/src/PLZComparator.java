import java.util.Comparator;

public class PLZComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        int rc;

        if ( (rc=p1.getPLZ()-p2.getPLZ()) != 0) {
            return rc;
        }
        else if ( (p1.getStrasse().compareTo(p2.getStrasse())) != 0) {
            return rc;
        }
        else if ( (rc=p1.getHausNummer()-p2.getHausNummer()) != 0) {
            return rc;
        }
        else if ( (rc=p1.getName().compareTo(p2.getName())) != 0) {
            return rc;
        }
        else  {
            return p1.getVorname().compareTo(p2.getVorname());
        }
    }
}
