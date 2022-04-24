package tdd;

public class Account {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void deposit(int depositAmount) {
        if (depositAmount > 0) {
            this.balance += depositAmount;
        }
//            throw new IllegalArgumentException("Deposit amount must be greater than 0");
    }

    public void withdraw(int withdrawAmount) {
        if (withdrawAmount > 0 && balance > withdrawAmount) {
            this.balance -= withdrawAmount;
        }
    }
}