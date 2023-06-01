package su_practice;


public abstract class Account {
	private double current_amount;
	private String accountnr;

	public void deposit(double amount) {
    current_amount += amount;
  }
  public void withdraw(double amount) {
    current_amount -= amount;
  }

  public void setAccountnr(String anr) {
    accountnr = anr;
  }
  public String getAccountnr() {
    return accountnr;
  }

  public double getAmount() {
    return current_amount;
  }

  public abstract void addInterest();

    abstract String getAccountID();
    abstract double getBalance();
    abstract double computeUpdatedBalance();
}
