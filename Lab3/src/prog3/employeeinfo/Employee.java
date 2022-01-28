package prog3.employeeinfo;
import java.time.LocalDate;
//import java.util.Date;
//import java.util.GregorianCalendar;

import prog3.*;

public class Employee {

	private AccountList accounts;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
/* update, using LocalDate
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
*/
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		accounts = new AccountList();
	}

	
	public void createNewChecking(double startAmount) {
		Account acct = new CheckingAccount(this, startAmount);
		accounts.add(acct);
		
	}

	public void createNewSavings(double startAmount) {
		Account acct = new SavingsAccount(this, startAmount);
		accounts.add(acct);
		
	}

	public void createNewRetirement(double startAmount) {
		Account acct = new RetirementAccount(this, startAmount);
		accounts.add(acct);
		
	}
	
	public String[] getNamesOfAccounts() {
		String[] result = new String[accounts.size()];
		for (int i = 0; i < accounts.size(); i++) {
			result[i] = accounts.get(i).getAcctType().toString();
		}
		return result;
	}

	public String getFormattedAcctInfo() {
		// implement
		String output = "";
		output += "ACCOUNT INFO FOR " + name + "\n";
		for (int i = 0; i < accounts.size(); i++) {
			output += accounts.get(i).toString(accounts.get(i).getAcctType());
		}
		output += "\n \n";
		
		return output;
	}
	public void deposit(int accountIndex, double amt){
		
		Account selected = accounts.get(accountIndex);
		selected.makeDeposit(amt);
		
	}
	
	public boolean withdraw(int accountIndex, double amt){
		Account account = accounts.get(accountIndex);
		boolean withdraw = account.makeWithdrawal(amt);
		if (withdraw == false) {
			System.out.println("Insufficient funds");
			return false;
		}
		return withdraw;
		
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
