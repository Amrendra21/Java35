package UNIT2;

public class MyMain {
    public static void main(String[] args) {
        Thread1 th = new Thread1();
        th.start();
        Thread2 th2 = new Thread2();
        th2.start();
    }
}