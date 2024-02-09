package exception;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void amountWithdraw(double amount) throws InsufficientFundsException, InvalidWithdrawalException {
        if(amount > balance) {
            throw new InsufficientFundsException("Insufficient balance");
        }
        if(amount < 0)
            throw new InvalidWithdrawalException("Invalid Withdrawal");
        else {
            balance = balance - amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
