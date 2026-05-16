package multithreading;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private int balance = 1000;
    private Lock lock = new ReentrantLock();
    
    // ===== LOCK & UNLOCK =====
    public void withdrawWithLock(int amount) {
        lock.lock();  // Acquire lock
        try {
            System.out.println(Thread.currentThread().getName() + 
                             " acquired lock");
            
            // Critical section (protected code)
            int temp = balance;
            Thread.sleep(100);  // Simulate processing
            balance = temp - amount;
            
            System.out.println("Withdrew: " + amount + 
                             ", Balance: " + balance);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();  // Always release lock
            System.out.println(Thread.currentThread().getName() + 
                             " released lock");
        }
    }
    
    // ===== TRYLOCK =====
   public boolean withdrawWithTryLock(int amount) {
        boolean lockAcquired = lock.tryLock();  // Try to get lock (non-blocking)
        
        if (!lockAcquired) {
            System.out.println(Thread.currentThread().getName() + 
                             " couldn't get lock, moving on...");
            return false;
        }
        
        try {
            int temp = balance;
            Thread.sleep(100);
            balance = temp - amount;
            System.out.println(Thread.currentThread().getName() +"Successfully withdrew: " + amount);
            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        } finally {
            lock.unlock();
        }
    }
    
    // ===== TRYLOCK WITH TIMEOUT =====
    public void withdrawWithTimeoutLock(int amount, long timeoutMs) {
        try {
            // Wait max 2 seconds for lock        
            if (lock.tryLock(timeoutMs,java.util.concurrent.TimeUnit.MILLISECONDS)) {
                System.out.println(Thread.currentThread().getName() + 
                                 " waited " + timeoutMs + "ms but couldn't get lock");
                
            }
            
            try {
                int temp = balance;
                Thread.sleep(100);
                balance = temp - amount;
                System.out.println(Thread.currentThread().getName() +"Successfully withdrew: " + amount);
            
            } finally {
                lock.unlock();
            }
        } catch (Exception e) {
            
        }
    }
    
    public int getBalance() {
        return balance;
    }
}

// ===== DEMO =====
public class LockDemo {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();
        
        System.out.println("===== LOCK & UNLOCK DEMO =====");
        Thread t1 = new Thread(() -> account.withdrawWithLock(100), "ATM-1");
        Thread t2 = new Thread(() -> account.withdrawWithLock(200), "ATM-2");
        
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        
        System.out.println("\n===== TRYLOCK DEMO =====");
        Thread t3 = new Thread(() -> account.withdrawWithTryLock(50), "ATM-3");
        Thread t4 = new Thread(() -> account.withdrawWithTryLock(75), "ATM-4");
        
        t3.start();
        t4.start();
        t3.join();
        t4.join();
        
        System.out.println("\n===== TIMEOUT LOCK DEMO =====");
        Thread t5 = new Thread(() -> account.withdrawWithTimeoutLock(25, 2000), "ATM-5");
        Thread t6 = new Thread(() -> account.withdrawWithTimeoutLock(30, 2000), "ATM-6");
        
        t5.start();
        t6.start();
        t5.join();
        t6.join();
        
        System.out.println("\nFinal Balance: " + account.getBalance());
    }
}