package prog1;

import java.time.LocalDate;

public class DeptEmployee {
	
	private String name;
	private LocalDate hireDate;
	private double salary;
	
	
	
	public DeptEmployee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);;
		salary = 300;
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
	
	double computeSalary() {
		return salary;
	}
	

}
