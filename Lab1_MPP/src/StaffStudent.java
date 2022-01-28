
public class StaffStudent extends Student {
	private Staff staff;

	public StaffStudent(String name, String phone, int age, double GPA, Staff staff) {
		super(name, phone, age, GPA);
		this.staff = staff;
	}
	
	
}
