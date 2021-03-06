
public abstract class Account {
	private Employee emp;
	private double balance;
	private String acctId;
	
	
	
	public Account(Employee emp, double balance, String acctId) {
		this.emp = emp;
		this.balance = balance;
		this.acctId = acctId;
	}
	
	public Employee getEmp() {
		return emp;
	}

	public String getAcctId() {
		return acctId;
	}

	abstract String getAccount();
	abstract double getBalance();
	abstract double computeUpdatedBalanceSum();
}
