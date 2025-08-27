import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        System.out.println("Hello World");

        String x = "Amrendra Singh";
        int age = 20;

        System.out.println("My name is "+ x + ". I am "+age+" years old.");

//     creating arrays :
        int[] marks = new int[3];

        marks[0]=97;
        marks[1]=98;
        marks[2] = 95;

//        taking input :
        Scanner sc = new Scanner(System.in);
        System.out.println("input your age: ");
//        int c = sc.nextInt();
//        float d = sc.nextFloat();


        String name = sc.next();

    }
}
