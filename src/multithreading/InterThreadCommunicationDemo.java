package multithreading;

/**
 * Demonstrates inter-thread communication using wait() and notify().
 */

class SharedResource {

    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) {

        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        data = value;
        hasData = true;

        System.out.println("Produced: " + data);

        notify();
    }

    public synchronized void consume() {

        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        System.out.println("Consumed: " + data);

        hasData = false;

        notify();
    }
}

public class InterThreadCommunicationDemo {

    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {
                resource.produce(i);
            }

        });

        Thread consumer = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {
                resource.consume();
            }

        });

        producer.start();
        consumer.start();
    }
}