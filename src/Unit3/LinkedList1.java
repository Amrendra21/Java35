package Unit3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :  ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            ll1.add(sc.nextInt());
        }

        Iterator itr = ll1.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        Collections.sort(ll1);
        System.out.println(ll1);
        System.out.println("Min is : "+ll1.getFirst());
        System.out.println("Max is : "+ll1.getLast());

    }
}