package oop_concepts;

/*
Problem:
Demonstrate interface in Java.

Approach:
- Create an interface Payment
- Implement it in UpiPayment class
- Use interface reference to call methods

Time Complexity: O(1)
Space Complexity: O(1)
*/
interface Payment {
    void pay(int amount);
}

class UpiPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paid via UPI: ₹" + amount);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Payment payment = new UpiPayment();
        payment.pay(500);
    }
}

