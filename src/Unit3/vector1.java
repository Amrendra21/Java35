package Unit3;

import java.util.Vector;
public class vector1 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("First");
        v.add("Second");
        v.add("Third");
        v.add("Fourth");

        v.add(1,"One point five");
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.capacity());

        v.remove(0);
        System.out.println(v);
    }
}
