package prob4e;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	String name;
	List<Account> accounts = new ArrayList<>();

	public Employee(String name) {
		super();
		this.name = name;
	}

	public void addAccount(Account acct) {
		accounts.add(acct);
	}

	public double computeUpdatedBalanceSum() {
		double sum = 0.0;
		for (Account acc : accounts) {
			sum += acc.computeUpdatedBalance();
		}
		return sum;
	}
}
