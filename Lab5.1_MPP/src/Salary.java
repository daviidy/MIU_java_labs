import java.util.*;

public class Salary extends Employee {
	
	private double salary;

	public Salary(double salary, int empId) {
		super(empId);
		this.salary = salary;
	}
	

	public double getSalary() {
		return salary;
	}


	@Override
	double calcGrossPay(DateRange date) {
		return salary;
	}
	
	

}
