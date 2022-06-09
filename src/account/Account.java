package account;

import java.math.BigDecimal;

public class Account {
    private String name;
    private BigDecimal balance;
    private String pin;

    public Account(String name, double initial_amount, String pin) {
        this.name = name;
        this.balance = new BigDecimal(initial_amount);
        this.pin = pin;
    }

    public Account (String name, double initial_amount) {
        this(name, initial_amount, "0000");
    }

    public Account(String name, String pin) {
        this(name, 0, pin);
    }

    public Account(String name) {
        this(name, 0, "0000");
    }

    public String getName() {
        return name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        BigDecimal amountDecimal = new BigDecimal(amount);
        balance = balance.add(amountDecimal);
    }

    public void withdraw(double amount, String pin) {
        if (this.pin == pin) {
            BigDecimal withdrawDecimal = new BigDecimal(amount);
            balance = balance.subtract(withdrawDecimal);
        }
    }

    public void changePIN(String pin) {
        this.pin = pin;
    }
}
