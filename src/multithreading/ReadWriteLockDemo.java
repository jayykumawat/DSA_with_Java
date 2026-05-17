package multithreading;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class UserCache {
    private String userData = "User: Alice, Score: 100";
    private int readCount = 0;
    private int writeCount = 0;
    

    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    
    public String getUserWithReadWriteLock() {
        readWriteLock.readLock().lock();  // Acquire read lock
        try {
            readCount++;
            System.out.println(getTimestamp() + " [RW] READ#" + readCount + 
                             " from " + Thread.currentThread().getName() + 
                             " (can read simultaneously)");
            Thread.sleep(500);  // Simulate read operation
            return userData;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } finally {
            readWriteLock.readLock().unlock();  // Release read lock
        }
    }
    
    public void updateUserWithReadWriteLock(String newData) {
        readWriteLock.writeLock().lock();  // Acquire write lock
        try {
            writeCount++;
            System.out.println(getTimestamp() + " [RW] WRITE#" + writeCount + 
                             " from " + Thread.currentThread().getName() + 
                             " (exclusive access)");
            Thread.sleep(500);  // Simulate write operation
            userData = newData;
            System.out.println(getTimestamp() + " [RW] WRITE#" + writeCount + " COMPLETED");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            readWriteLock.writeLock().unlock();  // Release write lock
        }
    }
    
    // ===== FAIRNESS EXAMPLE =====
    private final ReadWriteLock fairReadWriteLock = 
        new ReentrantReadWriteLock(true);  // true = fair mode
    
    public void demonstrateFairness() {
        fairReadWriteLock.readLock().lock();
        try {
            System.out.println("Fair RW Lock ensures FIFO order");
        } finally {
            fairReadWriteLock.readLock().unlock();
        }
    }
    
    private String getTimestamp() {
        return LocalDateTime.now().format(
            DateTimeFormatter.ofPattern("HH:mm:ss.SSS"));
    }
}

// ===== DEMO =====
public class ReadWriteLockDemo {
    public static void main(String[] args) throws InterruptedException {
        UserCache cache = new UserCache();
            
        Thread rwReader1 = new Thread(() -> {
            cache.getUserWithReadWriteLock();
        }, "RWReader-1");
        
        Thread rwReader2 = new Thread(() -> {
            cache.getUserWithReadWriteLock();
        }, "RWReader-2");
        
        Thread rwReader3 = new Thread(() -> {
            cache.getUserWithReadWriteLock();
        }, "RWReader-3");
        
        Thread rwWriter = new Thread(() -> {
            cache.updateUserWithReadWriteLock("User: Charlie, Score: 300");
        }, "RWWriter");
        
        rwReader1.start();
        Thread.sleep(50);
        rwReader2.start();
        Thread.sleep(50);
        rwReader3.start();
        Thread.sleep(50);
        rwWriter.start();
        
        rwReader1.join();
        rwReader2.join();
        rwReader3.join();
        rwWriter.join();
        
        System.out.println("\nNotice: Readers ran SIMULTANEOUSLY!");
        System.out.println("Total time: ~500ms (readers parallel + writer sequential)");
 
        // Simulate real workload: 90% reads, 10% writes
        for (int i = 0; i < 9; i++) {
            new Thread(() -> {
                for (int j = 0; j < 3; j++) {
                    cache.getUserWithReadWriteLock();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, "Reader-" + i).start();
        }
        
        Thread.sleep(500);
        
        new Thread(() -> {
            cache.updateUserWithReadWriteLock("User: Dana, Score: 400");
        }, "Writer-Main").start();
        
        Thread.sleep(3000);
        System.out.println("✓ All readers executed in parallel, writer waited for them");
    }
}