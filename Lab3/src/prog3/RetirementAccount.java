package prog3;

import prog3.employeeinfo.Employee;

public class RetirementAccount extends Account {

	public RetirementAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}
	
	public AccountType getAcctType() {
		return AccountType.RETIREMENT;
	}

	@Override
	public boolean makeWithdrawal(double amount) {
		double baseBalance = super.getBalance();
		if (amount < baseBalance) {
			double penalty = (2/100)*baseBalance;
			baseBalance -= amount - penalty;
			return true;
		}
		return false;
	}
	
	

}
