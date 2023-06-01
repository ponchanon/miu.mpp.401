package practice.expractice;

public class CheckingAccount extends Account {
    private double balance;
    private double monthlyFee;
    private String acctID;

    public CheckingAccount(String acctID, double monthlyFee, double balance) {
        this.balance = balance;
        this.monthlyFee = monthlyFee;
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
        return balance-monthlyFee;
    }
}
