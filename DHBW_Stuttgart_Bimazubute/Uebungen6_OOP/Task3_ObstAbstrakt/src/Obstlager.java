import java.util.ArrayList;
import java.util.List;

class Obstlager {
    private List<Obst> lager;

    public Obstlager() {
        lager = new ArrayList<>();
    }

    public void addObst(Obst obst) {
        lager.add(obst);
    }

    public void print() {

        for (int i = 0; i < lager.size(); i++) {
            System.out.println(lager.get(i).getName() + " " + lager.get(i).getFarbe());
        }

    }

}