package account;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
  @Test
  public void AccountCanBeCreatedTest() {
      Account dorcasAccount = new Account("dorcas");
      Account elonAccount = new Account("elon");

      String dorcasAccountName = dorcasAccount.getName();
      String elonAccountName = elonAccount.getName();

      assertEquals("dorcas", dorcasAccountName);
      assertEquals("elon", elonAccountName);
  }

  @Test
  public void AccountHasBalanceTest() {
    Account ucj = new Account("UCJ");

    assertEquals(BigDecimal.valueOf(0), ucj.getBalance());
  }

  @Test
  public void AccountCanDepositTest() {
    Account asakeAccount = new Account("Asake");

    asakeAccount.deposit(20);

    assertEquals(BigDecimal.valueOf(20), asakeAccount.getBalance());

    asakeAccount.deposit(400);

    assertEquals(BigDecimal.valueOf(420), asakeAccount.getBalance());
  }

  @Test
  public void AccountCanWithdrawTest() {
    Account boyoAccount = new Account("Michael");

    boyoAccount.deposit(50_000_000);

    boyoAccount.withdraw(50_000_000, "0000");

    assertEquals(BigDecimal.valueOf(0), boyoAccount.getBalance());
  }

  @Test
  public void CreateAccountWithPositiveBalanceTest(){
      Account shafAccount = new Account("Abdur-Rahman", 99_999_999);

      assertEquals(BigDecimal.valueOf(99_999_999), shafAccount.getBalance());
  }

  @Test
  public void AccountWithdrawWithPINTest() {
    Account graceAccount = new Account("Grace", 17_000, "0021");

    graceAccount.withdraw(10_000, "0036");

    assertEquals(BigDecimal.valueOf(17_000), graceAccount.getBalance());
  }

  @Test
    public void ChangePINTest() {
      Account yourAccount = new Account("Anonymous", 100);

      yourAccount.changePIN("1234");

      yourAccount.withdraw(60, "1234");

      assertEquals(BigDecimal.valueOf(40), yourAccount.getBalance());
  }
}




















