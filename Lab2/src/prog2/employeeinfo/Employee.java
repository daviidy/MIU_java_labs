package prog2.employeeinfo;
import prog2.*;

import java.time.LocalDate;
//import java.util.Date;
//import java.util.GregorianCalendar;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
/* update, using LocalDate
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
*/
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	
	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
		
	}

	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
		
	}

	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
		
	}

	public String getFormattedAcctInfo() {
		// implement
		String output = "";
		output += "ACCOUNT INFO FOR " + name + "\n";
		output += checkingAcct != null ? checkingAcct.toString() : "";
		output += savingsAcct != null ? savingsAcct.toString() : "";
		output += retirementAcct != null ? retirementAcct.toString() : "";
		output += "\n \n";
		
		return output;
	}
	public void deposit(AccountType acctType, double amt){
		if (acctType == AccountType.CHECKING) {
			checkingAcct.makeDeposit(amt);
		}
		else if(acctType == AccountType.SAVINGS) {
			savingsAcct.makeDeposit(amt);
		}
		else {
			retirementAcct.makeDeposit(amt);
		}
	}
	public boolean withdraw(AccountType acctType, double amt){
		if (acctType == AccountType.CHECKING) {
			return checkingAcct.makeWithdrawal(amt);
		}
		else if(acctType == AccountType.SAVINGS) {
			return savingsAcct.makeWithdrawal(amt);
		}
		else {
			return retirementAcct.makeWithdrawal(amt);
		}
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getHireDate() {
		return hireDate;
	}


	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	

}
