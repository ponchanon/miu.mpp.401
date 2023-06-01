package mar2017;

public class SavingsAccount extends Account {
	
	private double interestRate;
	private String acctId;
	
	public SavingsAccount(String acctId, double interestRate, double balance) {
		super(balance);
		this.interestRate = interestRate;
		this.acctId = acctId;
	}	

	@Override
	public double computeUpdatedBalance() {
		double totalBal = super.balance + (interestRate * super.balance);
		//System.out.println("saving bal: " + totalBal);
		return totalBal;
	}

	@Override
	public String getAccountID() {		
		return acctId;
	}

	@Override
	public double getBalance() {		
		return super.balance;
	}
	
}
