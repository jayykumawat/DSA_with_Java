package multithreading;
/**
 * Demonstrates sleep() and join() methods.
 */
class WorkerThread extends Thread{
   
    @Override
    public void run() {
       for(int i=0;i<=5;i++){
        System.out.println("Child Thread "+i);

        try {
            Thread.sleep(500);  //Pause Thread
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
    }
}
public class SleepJoinDemo {
    public static void main(String[] args) {
        WorkerThread t1=new WorkerThread();
        t1.start();

        try {
            t1.join();  //Main thread Wait 
        } catch (InterruptedException e) {
            System.out.println("Join interrupted");
        }
        for (int i = 0; i <=5; i++) {
            System.out.println("Main Thread "+i);
        }
    }
}
