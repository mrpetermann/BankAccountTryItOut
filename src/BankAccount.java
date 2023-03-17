public class BankAccount {
    protected double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }
}
