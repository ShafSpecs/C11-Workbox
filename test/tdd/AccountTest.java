package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void accountCanBeCreatedTest() {
        Account account = new Account();

        int balance = account.getBalance();

        assertEquals(0, balance);
    }

    @Test
    public void depositMoneyTest() {
        Account accountForDeposit = new Account();

        accountForDeposit.deposit(1_500);

        int balance = accountForDeposit.getBalance();

        assertEquals(1_500, balance);
    }

    @Test
    @DisplayName("If the user deposits an invalid amount of cash, the balance should not change")
    public void depositInvalidMoneyTest() {
        Account accountForDeposit = new Account();

        accountForDeposit.deposit(-1_500);

        int balance = accountForDeposit.getBalance();

        assertEquals(0, balance);
    }

    @Test
    public void withdrawMoneyTest() {
        Account accountForWithdraw = new Account();

        accountForWithdraw.deposit(1_500);
        accountForWithdraw.withdraw(1_000);

        int balance = accountForWithdraw.getBalance();

        assertEquals(500, balance);
    }

    @Test
    @DisplayName("If the user withdraws an invalid amount of cash, the balance should not change")
    public void withdrawInvalidMoneyTest() {
        Account invalidAccount = new Account();

        invalidAccount.deposit(30_000);
        invalidAccount.withdraw(-1_000);

        int balance = invalidAccount.getBalance();
        assertEquals(30_000, balance);
    }

    @Test
    public void withdrawMoreThanBalance() {
        Account nonsenseAccount = new Account();

        nonsenseAccount.deposit(2_000);
        nonsenseAccount.withdraw(1_600_000);

        int balance = nonsenseAccount.getBalance();
        assertEquals(2_000, balance);
    }
}