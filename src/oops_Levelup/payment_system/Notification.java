package oops_Levelup.payment_system;

public interface Notification {

  void sendNotification();
  default void logNotification() {
        System.out.println("Notification logged.");
    }  
} 
