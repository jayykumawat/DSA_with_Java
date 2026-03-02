package oops_Levelup.payment_system;

public class PaymentTest {

    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment(5000, "CC123");
        Payment p2 = new UPIPayment(1500, "UPI456");

        p1.processPayment();
        p1.paymentDetails();

        System.out.println();

        p2.processPayment();
        p2.paymentDetails();

        System.out.println();

        Notification n = new CreditCardPayment(3000, "CC999");
        n.sendNotification();
        n.logNotification();
    }
}