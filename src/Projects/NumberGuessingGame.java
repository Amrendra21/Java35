package Projects;

import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        int x = (int)(Math.random() * 100);

        int guess;

        Scanner sc = new Scanner(System.in);
        int z = -1;
        while(z!=x){
            System.out.println("Guess the number between 0 to 100 : ");
            z = sc.nextInt();

            if(z==x){
                System.out.println("You won!"+ " The number was : "+ x);
            }
            else if(z<x){
                System.out.println("Too low!");
            }
            else{
                System.out.println("Too High!");
            }
        }
    }
}
