package multithreading;
/**
 * Demonstrates Thread Lifecycle.
 */
class LifecycleThread extends Thread{
    
    @Override
    public void run() {
        System.out.println("Thread is running...");
       try {
        Thread.sleep(1000);
       } catch (InterruptedException e) {
        System.out.println("Interrupted");
       }
       System.out.println("Thread finished execution.");
    }
}
public class ThreadLifecycleDemo {
    public static void main(String[] args) {
        LifecycleThread t1= new LifecycleThread();
        System.out.println("State after creation: " + t1.getState());

        t1.start();

        System.out.println("State after start(): " + t1.getState());

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }

        System.out.println("State while running: " + t1.getState());
    
    }
}
