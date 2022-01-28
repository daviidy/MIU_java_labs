package prog3;

import prog3.employeeinfo.Employee;

public class CheckingAccount extends Account {

	public CheckingAccount(Employee emp, double balance) {
		super(emp, balance);
	}
	
	
	
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return super.getBalance() - 5;
	}



	@Override
	public AccountType getAcctType() {
		return AccountType.CHECKING;
	}



	
	
	

}
