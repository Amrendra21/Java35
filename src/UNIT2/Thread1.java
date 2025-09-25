package UNIT2;

public class Thread1 extends Thread {
    public void run(){
        try{
            for(int i=0;i<11;i++){
                System.out.println("Thread 1 "+i);
                Thread.sleep(10000);
            }}
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}