import java.util.*;
import java.util.stream.Collectors;

public class Department {
	private String name;
	private List<Person> persons;
	
	
	
	public Department(String name) {
		this.name = name;
		persons = new ArrayList();
	}

	double getTotalSalary() {
//		double res = 0;
//		for(Person person: persons) {
//			
//			if(person instanceof Faculty) {
//				res += ((Faculty) person).getSalary();
//			}
//			
//			if(person instanceof Staff) {
//				res += ((Staff	) person).getSalary();
//			}
//			res += ((Faculty) person).getSalary();
//			
//		}
		
		//using streams
		 return persons.stream()
		.filter(x -> x instanceof Faculty || x instanceof Staff)
		.mapToDouble(x -> x.getTotalSalary())
		.average()
		.getAsDouble();
		
//		return res;
	}
	
	void showAllMembers() {
		//String res = "";
		persons.stream()
		.forEach(person -> System.out.println(
				    	person.getName() + ", " + person.getPhone() + ", " + person.getClass() + "\n"
				));
//		for(Person person: persons) {
//			
//			res += person.getName() + ", " + person.getPhone() + ", " + person.getClass() + "\n"; 
//			
//		}
//		System.out.println(res);
	}
	
	void unitsPerFaculty() {
//		String res = "";
//		for(Person person: persons) {
//			if (person instanceof Faculty) {
//				res += person.name + ", " + ((Faculty) person).getTotalUnits() + "\n";
//			}
//		}
		
		persons.stream()
		.filter(x -> x instanceof Faculty)
		.forEach(person -> System.out.println(
					person.name + ", " + ((Faculty) person).getTotalUnits() + "\n"
				));
	}
	
	void printStudentsName(String name) {
//		for(Person p: persons) {
//			if((p instanceof Faculty) && p.name.equals(name)) {
//				List<Student> students = searchStudents((Faculty) p);
//				for(Student s: students) {
//					System.out.println(s.name + "\n");
//				}
//			}	
//		}
		
		persons.stream()
		.filter(p -> p instanceof Faculty && p.name.equals(name))
		.map(x -> searchStudents((Faculty) x))
		.map(x -> {
			for(Student s: x) {
				System.out.println(s.name + "\n");
			}
			return x;
		});
	}
	
	List<Student> searchStudents(Faculty fac){
		List<Student> stu = new ArrayList();
//		for(Person p: persons) {
//			if (p instanceof Student) {
//				for(Course c: fac.getCourses()) {
//					if (((Student) p).getCourses().contains(c)) {
//						stu.add((Student) p);
//					}
//				}
//			}
//		}
		
		
		fac.getCourses().stream()
		.map(x -> {
			List<Student> list = x.getStudents();
			for(Student s: list) {
				stu.add(s);
			}
			return x;
		});
		
		return stu;
	}

	public void addPerson(Person p) {
		persons.add(p);
		
	}

}
