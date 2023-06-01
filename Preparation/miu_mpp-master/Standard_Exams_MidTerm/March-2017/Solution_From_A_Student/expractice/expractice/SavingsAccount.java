package practice.expractice;

public class SavingsAccount extends Account {
    private double balance;
    private double interestRate;
    private String acctID;

    public SavingsAccount(String acctID, double interestRate,double balance ) {
        this.balance = balance;
        this.interestRate = interestRate;
        this.acctID = acctID;
    }


    @Override
    String getAccountID() {
        return acctID;
    }

    @Override
    double getBalance() {
        return balance;
    }

    @Override
    double computeUpdatedBalance() {
        return balance + (balance * interestRate);
    }
}
