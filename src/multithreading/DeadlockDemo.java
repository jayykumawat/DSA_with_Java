package multithreading;

/**
 * Demonstrates Deadlock situation.
 */

class ResourceA {}

class ResourceB {}

public class DeadlockDemo {

    public static void main(String[] args) {

        ResourceA resA = new ResourceA();
        ResourceB resB = new ResourceB();

        Thread t1 = new Thread(() -> {

            synchronized (resA) {

                System.out.println("Thread 1 locked Resource A");

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (resB) {
                    System.out.println("Thread 1 locked Resource B");
                }
            }
        });

        Thread t2 = new Thread(() -> {

            synchronized (resB) {

                System.out.println("Thread 2 locked Resource B");

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (resA) {
                    System.out.println("Thread 2 locked Resource A");
                }
            }
        //The simplest way to avoid deadlock is Lock Ordering    

        //     Thread t1=new Thread(()->{
        //     synchronized(resA) {
        //         synchronized (resB) {
        //             System.out.println("Thread 1 complete safely");
        //         }
        //     }
        // });

        // Thread t2=new Thread(()->{
        //     synchronized(resA){
        //         synchronized(resB){
        //             System.out.println("Thread 2 complete safely");
        //         }
        //     }
        });

        t1.start();
        t2.start();
    }
}