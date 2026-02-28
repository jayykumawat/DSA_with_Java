package oop_concepts.encapsulation;

/*
Problem:
Demonstrate Encapsulation in Java.

Concept:
Encapsulation means:
- Hiding internal data
- Providing controlled access using methods

Rules:
- Make variables private
- Provide public getter and setter methods

Benefits:
- Data security
- Controlled modification
- Better maintainability

Time Complexity: O(1)
Space Complexity: O(1)
*/

class BankAccount {

    // Private data (data hiding)
    private double balance;

    // Constructor
    BankAccount(double balance) {
        this.balance = balance;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        account.deposit(500);
        account.withdraw(300);

        System.out.println("Final Balance: " + account.getBalance());

        // ❌ This would cause error (because balance is private)
        // account.balance = 100000;
    }
}
