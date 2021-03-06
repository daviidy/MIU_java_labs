import java.util.Objects;

public class Employee implements Cloneable {
	private String employeeId;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private String birthDate;
	private String SSN;
	private double salary;
	private Position position;
	
	public Employee(String employeeId, String firstName, String middleInitial, String lastName, String birthDate, String sSN,
			double salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.birthDate = birthDate;
		SSN = sSN;
		this.salary = salary;
	}
	
	void print() {
		System.out.printf("\t\t\tEmployee: %s%n", firstName);
	}
	
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	double getSalary() {
		return salary;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee) || obj == null) {
			return false;
		}
		Employee emp = (Employee) obj;
		return this.getFirstName().equals(emp.getFirstName()) 
				&& this.getLastName().equals(emp.getLastName()) 
				&& this.getMiddleInitial().equals(emp.getMiddleInitial())
				&& this.getBirthDate().equals(this.getBirthDate())
				&& this.getEmployeeId().equals(emp.getEmployeeId())
				&& this.getSSN().equals(emp.getSSN())
				&& this.getSalary() == emp.getSalary()
				&& this.getPosition().equals(emp.getPosition());
	}

	@Override
	public String toString() {
		return "Employee Id: " + employeeId + "\n"
				+ "First name: " + firstName + "\n"
				+ "Initial: " + middleInitial + "\n"
				+ "LastName" + lastName + "\n"
				+ "birthDate: " + birthDate + "\n"
				+ "SSN: " + SSN + "\n"
				+ "Salary: " + salary + "\n"
				+ "Position: " + this.getPosition().toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(
				employeeId, 
				firstName, 
				middleInitial, 
				lastName, 
				birthDate,
				SSN,
				salary,
				this.getPosition()
			);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee copy = (Employee)super.clone();
		copy.setPosition((Position)copy.getPosition().clone());
		return copy;
	}

	
}
