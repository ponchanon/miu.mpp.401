package su_practice;

public class CheckingAccount extends Account {
	public CheckingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}


	private double interest_rate = 0.01;

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


	@Override
	public void addInterest() {
		deposit(getAmount() * interest_rate /2);
		
	}
}
