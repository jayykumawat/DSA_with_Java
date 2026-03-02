package oops_Levelup.payment_system;

public class UPIPayment extends Payment 
        implements Notification {

    public UPIPayment(double amount, String paymentId) {
        super(amount, paymentId);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing UPI payment...");
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending UPI confirmation notification.");
    }
}