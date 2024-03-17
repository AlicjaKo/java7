package myapp;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accNumber) {
        this.balance = 0;
        this.accountNumber = accNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount<0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative.");
        }
        else {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount<0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        else {

            if (this.balance - amount >= 0) {
            this.balance -= amount;
            }
            else {
                throw new InsufficientFundsException();
            }
        }
    }
    
}
