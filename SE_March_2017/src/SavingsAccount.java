
public class SavingsAccount extends Account {
	
}
	private double interestRate;
	
	public SavingsAccount(Employee emp, double balance, String acctId, double interestRate) {
		super(emp, balance, acctId);
		this.interestRate = interestRate;
	}

	@Override
	String getAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double computeUpdatedBalanceSum() {
		// TODO Auto-generated method stub
		return 0;
	}
}
