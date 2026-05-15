package multithreading;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class bankAccount{
  private int balance=1000;
  private Lock lock= new ReentrantLock();

  public void withdrawwithtest(int amount){
      lock.lock();
      try {
        System.out.println(Thread.currentThread().getName()+"Acquire lock");

        int temp=balance;
        Thread.sleep(100);
        balance=temp-amount;

        System.out.println("Withdraw: "+amount+","+"balance "+balance);

      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      finally{
        lock.unlock();
        System.out.println(Thread.currentThread().getName()+" release lock");
      }
  }
}
public class LockDemo {
    public static void main(String[] args)throws InterruptedException {
        bankAccount account=new bankAccount();
        Thread t1 = new Thread(()->account.withdrawwithtest(100), "ATM-1");
        Thread t2 = new Thread(()->account.withdrawwithtest(200), "ATM-2");

        t1.start();
        t2.start();
        t1.join();
        t2.join(); 
    }
}
