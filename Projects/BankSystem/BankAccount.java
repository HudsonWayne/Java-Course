package Projects.BankSystem;

public class BankAccount {
    private String ownerName;
    private double balance;

public BankAccount(String owenerName){
    this.ownerName = ownerName;
        this.balance = 0.0;  // Start with zero balance
}    
 //Deposit method

public void Deposit(double amount){
    if (amount > 0) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into your account.");
    }else{
        System.out.println("Invalid deposit amount. Please enter a positive number.");
    }
}
//Withdrawal method
public void Withdraw(double amount){}


}
