package Q7;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void deposit(double amount) {

        super.setBalance(super.getBalance() + amount + interest);
    }

    @Override
    public void withdraw(double amount) {
        if (super.getBalance() - amount >= 0) {
            super.setBalance(super.getBalance() - amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}