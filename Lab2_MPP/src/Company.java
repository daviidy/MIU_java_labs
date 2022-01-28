import java.util.*;

public class Company {
	private String name;
	private List<Department> departments;
	public Company(String name, List<Department> departments) {
		this.name = name;
//		this.departments = new ArrayList();
		this.departments = departments;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	
	void print() {
		System.out.println("Company: " + name);
		for(Department dept: departments) {
			dept.print();
		}
	}
	
	void addDept(Department dept) {
		departments.add(dept);
	}
	
	double getSalary() {
		int salary = 0;
		for(Department dept: departments) {
			salary += dept.getSalary();
		}
		return salary;
		
	}
}
