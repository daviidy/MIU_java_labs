package practice1;

public class Employee implements Comparable<Employee> {
	private String name;
	private int idNumber;
	private double salary;
	
	public Employee() {
		name = "dave";
		idNumber = 12;
		salary = 300;
	}
	
	
	
	public Employee(String name, int idNumber, double salary) {
		this.name = name;
		this.idNumber = idNumber;
		this.salary = salary;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public int compareTo(Employee o) {
		if (!(o instanceof Employee) || o == null) {
			return -1;
		}
		return name.compareTo(o.getName()) * -1;
	}



	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee) || obj == null) {
			return false;
		}
		Employee emp = (Employee) obj;
		return this.name.equals(emp.name);
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", idNumber=" + idNumber + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
