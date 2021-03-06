import java.time.*;
import java.util.*;

public abstract class Employee {
	private int empId;
	List<Paycheck> paychecks;
	
	public Employee(int empId) {
		this.empId = empId;
		this.paychecks = new ArrayList();
	}
	
	public int getEmpId() {
		return empId;
	}

	public List<Paycheck> getPaychecks() {
		return paychecks;
	}

	void print(){
		
		System.out.printf("Employee with ID %d \n", empId);
		if (this instanceof Hourly) {
			System.out.printf("Type: Hourly\n");
		}
		
		if (this instanceof Salary) {
			System.out.printf("Type: Salary\n");
		}
		
		if (this instanceof Commissioned) {
			System.out.printf("Type: Commissioned\n");
		}
		
		System.out.printf("******************************************************\n");
		
		for(Paycheck pay: paychecks) {
			pay.print();
		}
		
	}
	
	Paycheck calcCompensation(int month, int year) {
		
		LocalDate start = LocalDate.of(year, month, 1);
		YearMonth yearMonth = YearMonth.of(year, month);
		LocalDate end = yearMonth.atEndOfMonth();
		
		DateRange date = new DateRange(start, end);
		
		double grossPay = this.calcGrossPay(date);
		
		double fica = grossPay * 0.23;
		double state = grossPay * 0.05;
		double local = grossPay * 0.01;
		double medicare = grossPay * 0.03;
		double socialSecurity = grossPay * 0.075;
		
		Paycheck pay = new Paycheck(grossPay, fica, state, local, medicare, socialSecurity, date, this);
		
		addPaycheck(pay);
		
		return pay;
	}
	
	abstract double calcGrossPay(DateRange date);
	
	void addPaycheck(Paycheck paycheck) {
		paychecks.add(paycheck);
	}

}
