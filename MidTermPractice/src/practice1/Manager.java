package practice1;

public class Manager extends Employee {
	private String role;

	public Manager() {
		super("arsene", 1023, 2000);
		role = "lead developer";
	}
	
	public Manager(String name, int idNumber, double salary, String role) {
		super(name, idNumber, salary);
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return super.toString() + "Manager [role=" + role + "]";
	}
	
	
	
	
}
