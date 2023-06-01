package su_practice;

import java.util.HashMap;
import java.util.Map;

public class Bank {
	private Map<String, Account> accounts = new HashMap<String, Account>();
	
	public void addAccount(String type, String accountnr) {
		Account account;
		if(type.equals("checking")) {
			account = new CheckingAccount();
		}else {
			account = new SavingsAccount();
		}
		account.setAccountnr(accountnr);
		accounts.put(accountnr, account);//hashmap use .put
	}
	
	public void deleteAccount(String accountnr) {
		accounts.remove(accountnr);
	}

}
