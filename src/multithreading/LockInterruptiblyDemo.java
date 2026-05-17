package multithreading;
import java.util.concurrent.locks.ReentrantLock;

class PrinterQueue {
    private ReentrantLock lock = new ReentrantLock();
    private String document = "Resume";
    
     public void printWithInterruptibleLock(String threadName) {
        System.out.println(threadName + " trying to print (can be interrupted)...");
        
        try {
            // This respects interrupts!
            lock.lockInterruptibly();  // ← Throws InterruptedException if interrupted
            
            try {
                System.out.println(threadName + " got the printer!");
                Thread.sleep(2000);
                System.out.println(threadName + " finished printing");
            } finally {
                lock.unlock();
            }
            
        } catch (InterruptedException e) {
            // Thread was interrupted while waiting for lock
            System.out.println(threadName + " was INTERRUPTED! Gave up on printing.");
            System.out.println(threadName + " cleaned up and exited gracefully!");
            Thread.currentThread().interrupt();  // Restore interrupt flag
        }
    }
}
public class LockInterruptiblyDemo {
    public static void main(String[] args) throws InterruptedException {

        PrinterQueue queue = new PrinterQueue();
        Thread printer1 = new Thread(() -> {
            queue.printWithInterruptibleLock("Printer-3");
        }, "P3");
        
        // Waiting thread
        Thread printer2 = new Thread(() -> {
            queue.printWithInterruptibleLock("Printer-4");
        }, "P4");
        
        printer1.start();
        Thread.sleep(100);
        printer2.start();
        
        Thread.sleep(500);
        printer2.interrupt();  // Interrupt printer4
        System.out.println(">>> Sent interrupt to Printer-4, it WILL exit gracefully!");
        
        printer1.join();
        printer2.join();

    }
}
