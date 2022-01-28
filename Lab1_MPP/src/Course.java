import java.util.*;

public class Course {
	private String number;
	private String title;
	private int units;
	private List<Student> students;
	
	public Course(String number, String title, int units) {
		this.number = number;
		this.title = title;
		this.units = units;
		students = new ArrayList<Student>();
	}
	public String getNumber() {
		return number;
	}
	public String getTitle() {
		return title;
	}
	public int getUnits() {
		return units;
	}
	
	public void addStudent(Student stu) {
		students.add(stu);
	}
	public List<Student> getStudents() {
		return students;
	}
	
	
}
