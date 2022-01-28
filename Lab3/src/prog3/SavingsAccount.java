package prog3;

import prog3.employeeinfo.Employee;

public class SavingsAccount extends Account {
	
	private final static double rate = 0.25;

	public SavingsAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}
	
	public AccountType getAcctType() {
		return AccountType.SAVINGS;
	}

	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = (rate/100)*baseBalance;
		return baseBalance + interest;
	}
	
	

}
