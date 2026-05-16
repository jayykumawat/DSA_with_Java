package multithreading;

import java.util.concurrent.locks.ReentrantLock;

class Document{
private String content="Imp content there";
ReentrantLock lock =new ReentrantLock();

public void processDocument(){
   lock.lock();
   
   try {
    System.out.println(Thread.currentThread().getName()+"Aquires lock--lock Count "+lock.getHoldCount());
    printdocument();
    saveDocument();

   } finally{
    lock.unlock();
    System.out.println("Lock released. Remaining count: "+ lock.getHoldCount());
   }
}
public void printdocument(){
lock.lock();

try {
    System.out.println("Print content "+content);
    System.out.println("lock holding"+lock.getHoldCount());
} finally{
    lock.unlock();
}
}

public void saveDocument(){
lock.lock();

try {
    System.out.println("Save Document");
    System.out.println("Lock holding"+lock.getHoldCount());
} finally{
    lock.unlock();
}
}

}


class ReentrantLockDemo {
    public static void main(String[] args) throws InterruptedException {
        Document doc=new Document();
        Runnable task=new Runnable() {
            @Override
            public void run(){
               doc.processDocument();
            }
        };

        Thread t1= new Thread(task,"Thread-1");
        t1.start();
        t1.join();
        Thread t3 = new Thread(task, "Thread-3");
        Thread t4 = new Thread(task, "Thread-4");
        
        t3.start();
        t4.start();
        t3.join();
        t4.join();
    }
}