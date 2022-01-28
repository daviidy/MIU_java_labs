package prog1;

public class Secretary extends DeptEmployee {
	private double overtimeHours;
	
	

	public Secretary(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		super(name, yearOfHire, monthOfHire, dayOfHire);
		this.overtimeHours = 22;
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	@Override
	double computeSalary() {
		return super.computeSalary() + 12*overtimeHours;
	}
	
	
}
