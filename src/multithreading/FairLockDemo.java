package multithreading;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Fairness: Ensuring All Threads Get Equal Lock Chances
/*Real-World Industry Usage

Web servers: Ensure all users get fair response times
Games: Fair matchmaking and resource allocation
Banking: FIFO transaction processing
*/

public class FairLockDemo {
    private final Lock fairlock = new ReentrantLock(true);

    public void AccessResource(){
        fairlock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" Acquired the lock");
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        finally{
            System.out.println(Thread.currentThread().getName()+" release the lock ");
            fairlock.unlock();
         }
    }
    public static void main(String[] args)throws InterruptedException {
        FairLockDemo example = new FairLockDemo();

        Runnable task = new Runnable() {
            @Override
            public void run(){
example.AccessResource();
            }
        };

        Thread t1=new Thread(task,"Thread-1");
        Thread t2=new Thread(task,"Thread-2");
        Thread t3=new Thread(task,"Thread-3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
         

    }
}
