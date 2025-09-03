package Unit3;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int a[][] = new int[2][3];
        int b[][] = new int[2][3];
        int c[][] = new int[2][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of array 1 : ");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of array 2 : ");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is : ");
        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[i].length; j++){
                System.out.print(a[i][j]+b[i][j]+ "  ");
            }
            System.out.println("");
        }

    }
}
