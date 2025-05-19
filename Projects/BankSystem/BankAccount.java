package Projects.BankSystem;

public class BankAccount {
    private String ownerName;
    private double balance;

    // Constructor
    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
        this.balance = 0.0;  // Start with zero balance
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Check balance
    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    // Get account owner
    public String getOwnerName() {
        return ownerName;
    }
}