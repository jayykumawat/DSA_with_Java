package oops_Levelup.payment_system;

public class CreditCardPayment extends Payment implements Notification,Receipt{
    CreditCardPayment(double amount,String paymentId){
        super(amount,paymentId);
    }
    @Override
    public void processPayment(){
        System.out.println("Processing credit card payment...");
    }
    @Override
    public void sendNotification(){
        System.out.println("Sending SMS for credit card payment.");
    }
    @Override
    public void generateReceipt(){
        System.out.println("Generating credit card receipt.");
    }
}
