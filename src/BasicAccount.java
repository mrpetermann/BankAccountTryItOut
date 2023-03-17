public class BasicAccount extends BankAccount {
    public BasicAccount() {
        super();
    }

    public BasicAccount(double initialAmount) {
        super(initialAmount);
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= this.balance)
            super.withdraw(amount);
    }
}
