package UNIT2;

public class Thread2 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " : " + i);
                Thread.sleep(2000); // sleeps for 2 seconds
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Thread2 t = new Thread2();
        t.start(); // start the thread
    }
}
