package mar2017;

public class CheckingAccount extends Account{	

	private double monthlyFee;
	private String acctId;
	
	public CheckingAccount(String acctId,  double monthlyFee, double balance) {
		super(balance);
		this.monthlyFee = monthlyFee;
		this.acctId = acctId;
	}

	@Override
	public String getAccountID() {
		return acctId;
	}

	@Override
	public double getBalance() {
		return super.balance;
	}

	@Override
	public double computeUpdatedBalance() {
		double totalBal = super.balance - monthlyFee;	
		//System.out.println("checking bal: " + totalBal);
		return totalBal;
	}

}
