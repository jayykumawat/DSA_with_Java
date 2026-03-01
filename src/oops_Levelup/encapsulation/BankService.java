package oops_Levelup.encapsulation;

/**
 * Handles operations on BankAccount.
 */
public class BankService {
    public void Transfer(BankAccount from,BankAccount to,double amount){
        if(amount>0&&from.getBalance()>amount){
            from.Withdraw(amount);
            to.Deposite(amount);
            System.out.println("Transfer Successful");
        }
        else{
            System.out.println("Transfer Failed");
        }
    }
}
