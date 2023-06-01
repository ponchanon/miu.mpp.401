package mar2017;

public abstract class Account {
	
	protected double balance;
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	public abstract String getAccountID();
	public abstract double getBalance();
	public abstract double computeUpdatedBalance();
	
}

