package unit3;

import java.util.*;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            products.add(sc.next());
        }
        System.out.println(products);
    }
}
