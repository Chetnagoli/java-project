package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testAccountCreation() {
        BankAccount account = new BankAccount(100.0);
        assertEquals(100.0, account.checkBalance(), "Initial balance should be 100.0");
    }

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(100.0);
        account.deposit(50.0);
        assertEquals(150.0, account.checkBalance(), "Balance should be 150.0 after depositing 50.0");
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount(100.0);
        account.withdraw(30.0);
        assertEquals(70.0, account.checkBalance(), "Balance should be 70.0 after withdrawing 30.0");
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(50.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(100.0);
        });
        assertEquals("Insufficient funds.", exception.getMessage());
    }

    @Test
    public void testDepositNegativeAmount() {
        BankAccount account = new BankAccount(100.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-50.0);
        });
        assertEquals("Deposit amount must be positive.", exception.getMessage());
    }

    @Test
    public void testWithdrawNegativeAmount() {
        BankAccount account = new BankAccount(100.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-30.0);
        });
        assertEquals("Withdrawal amount must be positive.", exception.getMessage());
    }
}
