package Javatasksopp;
// 2. You are building a banking application that has a BankAccount class. 
// Implement the BankAccount class with encapsulation principles in mind. 
// Include private instance variables for the account number, account holder 
// name, and account balance. Provide public methods to allow clients to deposit 
// and withdraw funds, as well as access the account balance. Ensure that the 
// account balance cannot be accessed or modified directly.
public class BankAccount {
    // Private attributes
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.accountBalance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting to 0.");
            this.accountBalance = 0;
        }
    }

    // Getters (No setters for balance!)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrew $" + amount);
        } else {
            System.out.println("Invalid amount or insufficient funds.");
        }
    }

    // Display account info
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + accountBalance);
    }

    // Main method to test
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("BA12345", "Ishan", 1000);

        acc.displayAccountInfo();

        System.out.println("\n-- Deposit $500 --");
        acc.deposit(500);

        System.out.println("\n-- Withdraw $300 --");
        acc.withdraw(300);

        System.out.println("\n-- Final Account Info --");
        acc.displayAccountInfo();
    }
}
