package prog2;
import prog2.employeeinfo.*;

public class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	public Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	public Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "Account type : " + acctType + "\n Current bal : " + balance + "\n";
	}

	public void makeDeposit(double deposit) {
		// implement
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		return false;
	}

	public double getBalance() {
		return balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}
	
	
	
}
