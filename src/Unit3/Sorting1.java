package Unit3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(23);
        al.add(1);
        al.add(2);
        al.add(-12);
        al.add(1);
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al, Comparator.reverseOrder());
        System.out.println(al);
    }
}
