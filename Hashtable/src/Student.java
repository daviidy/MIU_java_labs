import java.util.Objects;

public class Student {
	private String name;
	private int id;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		return name + ", " + id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, id);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) return false;
		Student s = (Student) obj;
		return s.name.equals(name) && s.id == id;
	}
	
	
	
	
}
