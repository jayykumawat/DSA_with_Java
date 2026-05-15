package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class bankAccount {
  private int balance = 1000;
  private Lock lock = new ReentrantLock();

  public void withdrawwithtest(int amount) {
    lock.lock();
    try {
      System.out.println(Thread.currentThread().getName() + "Acquire lock");

      int temp = balance;
      Thread.sleep(100);
      balance = temp - amount;

      System.out.println("Withdraw: " + amount + "," + "balance " + balance);

    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
      System.out.println(Thread.currentThread().getName() + " release lock");
    }
  }

  // TryLock---
  public boolean withdrawWithTryLock(int amount) {
    boolean lockAcquired = lock.tryLock();

    if (!lockAcquired) {
      System.out.println(Thread.currentThread().getName() + " couldn't get lock, moving on...");
      return false;
    }
    try {
      int temp = balance;
      Thread.sleep(100);
      balance = temp - amount;
      System.out.println("Successfully withdrew: " + amount);
      return true;
    } catch (InterruptedException e) {
      e.printStackTrace();
      return false;
    }finally{
      lock.unlock();
    }
  }
}

public class LockDemo {
  public static void main(String[] args) throws InterruptedException {
    bankAccount account = new bankAccount();
    System.out.println("===== LOCK & UNLOCK DEMO =====");
    Thread t1 = new Thread(() -> account.withdrawwithtest(100), "ATM-1");
    Thread t2 = new Thread(() -> account.withdrawwithtest(200), "ATM-2");

    t1.start();
    t2.start();
    t1.join();
    t2.join();

    System.out.println("===== TRY LOCK DEMO  =====");
    Thread t3 = new Thread(() -> account.withdrawwithtest(50), "ATM-3");
    Thread t4 = new Thread(() -> account.withdrawwithtest(70), "ATM-4");

    t3.start();
    t4.start();
    t3.join();
    t4.join();
  }
}
