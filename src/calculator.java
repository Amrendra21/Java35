import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x,y,z;
        System.out.println("Enter any two numbers");
        x = sc.nextInt();
        y = sc.nextInt();

        try{
            z = x/y;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Hello Uncle");
        }
    }
}
