package task6;

public class account_class {
    private String accountNumber;
    private double balance;

    // No-argument constructor
    public account_class() {
        this.accountNumber = "1234568";
        this.balance = 0.0; //
    }

    // Two-argument constructor
    public account_class(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to withdraw balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful.");
        } else {
            System.out.println("Withdrawal failed. Insufficient balance.");
        }
    }

    // Method to deposit balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " successful.");
        } else {
            System.out.println("Deposit failed. Invalid amount.");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Account Balance: " + balance);
    }

    public static void main(String[] args) {
        // Example usage:
        account_class account1 = new account_class(); // Using no-argument constructor
        account1.checkBalance();
        account1.deposit(1000);
        account1.checkBalance();
        account1.withdraw(500);
        account1.checkBalance();

        account_class account2 = new account_class("12345678", 500); // Using two-argument constructor
        account2.checkBalance();
        account2.deposit(200);
        account2.checkBalance();
        account2.withdraw(1000); // Should fail due to insufficient balance
        account2.checkBalance();
    }
}