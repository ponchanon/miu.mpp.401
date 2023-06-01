package su_practice;

public class SavingsAccount extends Account {
	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}


	private double interest_rate = 0.0425;

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


	@Override
	public void addInterest() {
		deposit(getAmount() * interest_rate);
		
	}
}
