
public class CheckingAccount extends Account {
	
	private double monthlyFee;
	
	public CheckingAccount(Employee emp, double balance, String acctId, double monthlyFee) {
		super(emp, balance, acctId);
		this.monthlyFee = monthlyFee;
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
