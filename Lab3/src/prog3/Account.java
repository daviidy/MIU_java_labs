package prog3;
import prog3.employeeinfo.*;

public class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	public Account(Employee emp, double balance) {
		employee = emp;
		this.balance = balance;
	}

	public Account(Employee emp) {
		this(emp, DEFAULT_BALANCE);
	}

	public String toString(AccountType acctType) {
		return "Account type : " + acctType + "\n Current bal : " + balance + "\n";
	}

	public void makeDeposit(double deposit) {
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if (amount < balance) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public double getBalance() {
		return balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}
	
	
	
}
