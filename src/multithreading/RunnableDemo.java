package multithreading;
/**
 * Demonstrates creating a thread using Runnable interface.
 */
class MyTask implements Runnable{
    
    @Override
    public void run() {
        
        for(int i=0;i<=5;i++){
        System.out.println("Runnable Thread running: "+i);
    }
       try {
        Thread.sleep(500);
       } catch (InterruptedException e) {
        System.out.println("Thread Interrupted");
       }
 }
}
public class RunnableDemo {
    public static void main(String[] args) {
        MyTask t1= new MyTask();
        Thread t2=new Thread(t1);
        t2.start();

        for (int i = 0; i <=5; i++) {
            System.out.println("Main Thread running: "+i);
        }
    }
}
