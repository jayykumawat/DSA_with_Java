package oops_Levelup.encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {
        
        BankAccount acc1=new BankAccount("Jay", 10000);
        BankAccount acc2=new BankAccount("Vidhan", 5000);
  
    BankService service = new BankService();
    
    //Before transfering thhe amount we check the balance in both account 
    //all we do is print on a screen 
    System.out.println(acc1.getAccountHolder()+" balance is "+acc1.getBalance());
    System.out.println(acc2.getAccountHolder()+" balance is "+acc2.getBalance());
    
    service.Transfer(acc1,acc2,2000);
    //after transfer the amount we check the balance 
    System.out.println(acc1.getAccountHolder()+" balance is "+acc1.getBalance());
    System.out.println(acc2.getAccountHolder()+" balance is "+acc2.getBalance());

    }
    
}
