import java.util.*;

public class Student extends Person {
	private double GPA;
	
	private List<Course> courses;

	public Student(String name, String phone, int age, double GPA) {
		super(name, phone, age);
		this.GPA = GPA;
		courses = new ArrayList();
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

	@Override
	double getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
}
