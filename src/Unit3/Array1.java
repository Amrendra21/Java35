package Unit3;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        for(int i=0; i<a.length; i++){
            System.out.println("Element at "+i+ "  is : "+ a[i]);
        }
    }
}
