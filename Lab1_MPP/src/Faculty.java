import java.util.*;

public class Faculty extends Person {
	private double salary;
	private List<Course> courses;

	public Faculty(String name, String phone, int age, double salary) {
		super(name, phone, age);
		this.salary = salary;
		courses = new ArrayList();
	}

	public double getSalary() {
		return salary;
	}

	public List<Course> getCourses() {
		return courses;
	}
	
	void addCourse(Course c) {
		courses.add(c);
	}
	
	public int getTotalUnits() {
		int units = 0;
		for(Course course: courses) {
			units += course.getUnits();
		}
		return units;
	}

	@Override
	public void myAbstract() {
		// TODO Auto-generated method stub
		
	}
}
