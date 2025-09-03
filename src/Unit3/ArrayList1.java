package Unit3;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(13);
        al.add(24);

        for(int alist:al){
            System.out.println(alist);
        }
    }
}
