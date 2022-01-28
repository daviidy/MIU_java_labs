import java.util.*;

public class Employee {
	private String name;
	private List<Account> accounts;

	public Employee(String name) {
		this.name = name;
		accounts = new ArrayList();
	}

	public String getName() {
		return name;
	}
	
	void addAccount(Account acct) {
		accounts.add(acct);
	}
	
	double computeUpdatedBalanceSum() {
		return 0;
	}
}
