package multithreading;
/**
 * Demonstrates creating a thread using Runnable interface.
 */

public class RunnableDemo {
    public static void main(String[] args) {
        
        Thread t2=new Thread(()->{
        
        for(int i=0;i<=5;i++){
        System.out.println("Runnable Thread running: "+i);
    }
       try {
        Thread.sleep(500);
       } catch (InterruptedException e) {
        System.out.println("Thread Interrupted");
       }
 });
        t2.start();

        for (int i = 0; i <=5; i++) {
            System.out.println("Main Thread running: "+i);
        }
    }
}
