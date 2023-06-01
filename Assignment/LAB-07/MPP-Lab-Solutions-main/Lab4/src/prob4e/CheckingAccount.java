package prob4e;

public class CheckingAccount extends Account {
	double balance;
	double monthlyFee;
	String acctId;

	public CheckingAccount(String acctId,double monthlyFee, double balance) {
		this.balance = balance;
		this.monthlyFee = monthlyFee;
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
		return balance - monthlyFee;
	}
}
