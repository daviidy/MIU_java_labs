package prog3;

import java.util.Scanner;

import prog3.employeeinfo.Employee;

public class Main {
	Employee[] emps = null;
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);	
		
		Scanner menu = new Scanner(System.in);
		System.out.print("A. See a report of all accounts.\r\n"
				+ "B. Make a deposit.\r\n"
				+ "C. Make a withdrawal.\r\n"
				+ "Make a selection (A/B/C):");
		
		String operation = menu.next();
		
		if(operation.equalsIgnoreCase("a")){
			String info = getFormattedAccountInfo();
			System.out.println(info);
		}
		else if (operation.equalsIgnoreCase("b")) {
			String output = "";
			for (int i = 0; i < emps.length; i++) {
				output += i + ". " + emps[i].getName() + "\n";
			}
			output += "Select an employee: (type a number)";
			System.out.println(output);
			
			int employee = Integer.parseInt(menu.next());
			
			String[] accounts = emps[employee].getNamesOfAccounts();
			
			output = "";
			
			for (int i = 0; i < accounts.length; i++) {
				output += i + ". " + accounts[i] + "\n";
			}
			
			output += "Select an account: (type a number)";
			System.out.println(output);
			
			int acct = Integer.parseInt(menu.next());
			
			System.out.println("Deposit amount:");
			
			double amt = Double.parseDouble(menu.next());
			
			emps[employee].deposit(acct, amt);
			
			System.out.println("$"+ amt +" has been deposited in the\r\n"
					+ accounts[acct] +" account of " + emps[employee].getName());
			
		}
		else if (operation.equalsIgnoreCase("c")) {
			
			String output = "";
			for (int i = 0; i < emps.length; i++) {
				output += i + ". " + emps[i].getName() + "\n";
			}
			output += "Select an employee: (type a number)";
			System.out.println(output);
			
			int employee = Integer.parseInt(menu.next());
			
			String[] accounts = emps[employee].getNamesOfAccounts();
			
			output = "";
			
			for (int i = 0; i < accounts.length; i++) {
				output += i + ". " + accounts[i] + "\n";
			}
			
			output += "Select an account: (type a number)";
			System.out.println(output);
			
			int acct = Integer.parseInt(menu.next());
			
			System.out.println("Withdrawal amount:");
			
			double amt = Double.parseDouble(menu.next());
			
			if(emps[employee].withdraw(acct, amt)) {
				System.out.println("$"+ amt +" has been withdrew from the\r\n"
						+ accounts[acct] + " account of " + emps[employee].getName());
			}
			
		}
		
				
//		Scanner sc = new Scanner(System.in);
//		System.out.print("See a report of all account balances? (y/n) ");
//		if(answer.equalsIgnoreCase("y")){
//			String info = getFormattedAccountInfo();
//			System.out.println(info);
//		}
//		else {
//			//do nothing..the application ends here
//		}	
	}
	String getFormattedAccountInfo(){
		//loop through employees array and get formatted
		//account info for each employee, and assemble into a string
		
		String output = "";
		
		for (int i = 0; i < emps.length; i++) {
			output += emps[i].getFormattedAcctInfo();
		}
		return output;
	}
}
