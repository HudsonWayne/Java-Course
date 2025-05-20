package Projects.BankSystem;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;

        while (true) {
            System.out.println("\n--- Bank System Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            if (option == 1) {
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                account = new BankAccount(name);
                System.out.println("Account created for " + account.getOwnerName());

            } else if (account == null) {
                System.out.println("Please create an account first.");

            } else if (option == 2) {
                System.out.print("Enter amount to deposit: ");
                double amount = scanner.nextDouble();
                account.deposit(amount);

            } else if (option == 3) {
                System.out.print("Enter amount to withdraw: ");
                double amount = scanner.nextDouble();
                account.withdraw(amount);

            } else if (option == 4) {
                account.checkBalance();

            } else if (option == 5) {
                System.out.println("Thank you for using the bank system. Goodbye!");
                break;

            } else {
                System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
