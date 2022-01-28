import java.util.*;

public class Hourly extends Employee {
	
	private double hourlyWage;
	private int hoursPerWeek;
	
	public Hourly(int empId, double hourlyWage, int hoursPerWeek) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	
	public double getHourlyWage() {
		return hourlyWage;
	}


	public int getHoursPerWeek() {
		return hoursPerWeek;
	}


	@Override
	double calcGrossPay(DateRange date) {
		return 4 * hoursPerWeek * hourlyWage;
	}
	
	

}
