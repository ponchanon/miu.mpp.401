package mar2017;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private List<Account> accountList = new ArrayList<Account>();
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}
	
	public void addAccount(Account acct) {
		accountList.add(acct);
	}
	
	public double computeUpdatedBalanceSum() {
		double totalBalSum = 0.0;		
		for(Account acc : accountList) {
			totalBalSum += acc.computeUpdatedBalance();
		}
		return totalBalSum;
	}
}
