package prob4e;

public class SavingsAccount extends Account {
	double balance;
	double interestRate;
	String acctId;
	
	public SavingsAccount( String acctId, double interestRate,double balance) {
		this.balance = balance;
		this.interestRate = interestRate;
		this.acctId = acctId;
	}

	@Override
	public String getAccountID() {
		return acctId;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public double computeUpdatedBalance() {
		return balance + (interestRate * balance);
	}
	
	

}
