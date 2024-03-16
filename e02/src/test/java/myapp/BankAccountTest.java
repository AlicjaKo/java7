package myapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount("12345");
    }

    @Test
    void depositPositiveAmount() {
        account.deposit(200);
        assertEquals(200, account.getBalance(), "The balance should be 200 after depositing 200");
    }

    @Test
    void depositNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.deposit(-100));
        assertEquals("Deposit amount cannot be negative.", exception.getMessage());
    }

    @Test
    void withdrawSufficientBalance() throws InsufficientFundsException {
        account.deposit(500); // Ensure there is enough balance to withdraw
        account.withdraw(200);
        assertEquals(300, account.getBalance(), "The balance should be 300 after withdrawing 200");
    }

    @Test
    void withdrawInsufficientBalance() {
        account.deposit(100); // Not enough for the withdrawal that follows
        assertThrows(InsufficientFundsException.class, () -> account.withdraw(200));
    }

    @Test
    void withdrawNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-100), "Withdrawal amount cannot be negative.");
    }
}

