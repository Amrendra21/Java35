package Unit3;

import java.util.*;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            products.add(sc.next());
        }

        Iterator<String> itr = products.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        Collections.sort(products);
        products.add("lichi");          // same as addLast
        products.add(0, "apple");       // same as addFirst
        products.add(3, "papaya");
        System.out.println(products);
        System.out.println(products.get(0));                  // first element
        System.out.println(products.get(products.size()-1));  // last element
    }
}
