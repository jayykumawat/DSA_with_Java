package oops_Levelup.payment_system;

public abstract class Payment {
    protected double amount;
    protected String paymentId;

    Payment(double amount,String paymentId){
        this.amount=amount;
        this.paymentId=paymentId;
    }
    public abstract void processPayment();

    public void paymentDetails() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: " + amount);
    }
}
