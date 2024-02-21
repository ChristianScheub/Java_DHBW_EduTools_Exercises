public class Paar<T, U> {
    protected T attribut1;
    protected U attribut2;

    public Paar(T a, U b) {
        this.attribut1 = a;
        this.attribut2 = b;
    }

    public T getAttribut1() {
        return attribut1;
    }

    public U getAttribut2() {
        return attribut2;
    }

    public static void main(String[] args) {
        Paar<String, Integer> p1 = new Paar<>("Hallo", 1);
        String a = p1.getAttribut1();
        int b = p1.getAttribut2();
        System.out.println(a);
        System.out.println(b);
        System.out.println(p1);

        Paar<String, Paar<String, Integer>> p2 = new Paar<>("Hi", p1);
        a = p2.getAttribut1();
        p1 = p2.getAttribut2();
        System.out.println(a);
        System.out.println(p1);
        System.out.println(p2);
    }

}