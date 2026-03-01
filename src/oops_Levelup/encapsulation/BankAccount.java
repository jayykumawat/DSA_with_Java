package oops_Levelup.encapsulation;

/**
 * Represents a bank account.
 * Demonstrates Encapsulation.
 *
 * Fields are private.
 * Access only through public methods.
 */
public class BankAccount {
    private String accountHolder;
    private double Balance;

    BankAccount(String a,double b){
     this.accountHolder=a;
     this.Balance=b;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public double getBalance(){
        return Balance;
    }
    public void Deposite(double amount){
      if(amount>0){
        Balance+=amount;
      }
    }
    public void Withdraw(double amount){
        if(amount>0&&amount<Balance){
            Balance-=amount;
        }
        else{
            System.out.println("Invalid withdrawal attempt");
        }
    }
    }

