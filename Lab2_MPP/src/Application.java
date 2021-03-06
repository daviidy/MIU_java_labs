import java.util.*;

public class Application {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp1 = new Employee("1", "dave", "zer", "middle", "14-10-1994", "23344", 2500);
		Employee emp2 = new Employee("1", "dave", "zer", "middle", "14-10-1994", "23344", 2500);
		Employee emp3 = new Employee("3", "ted", "fg", "bgb", "14-10-1996", "23344", 4500);
		Employee emp4 = new Employee("4", "ggr", "ergr", "rg", "14-10-1997", "23344", 5500);
				
		Position pos1 = new Position("dev", "any description", emp1, new ArrayList(), null);
		Position pos2 = new Position("devops", "any description", emp1, new ArrayList(), pos1);
		Position pos3 = new Position("devops", "any description", emp1, new ArrayList(), pos1);
		Position pos4 = new Position("sysadmin", "any dfrgr", emp4, new ArrayList(), pos1);
		
//		pos1.addInferior(pos3);
//		pos1.addInferior(pos4);
				
		Department dep1 = new Department("marketing", "new york", new ArrayList());
		Department dep2 = new Department("tech", "iowa", new ArrayList());
//		
//		List<Department> departments = new ArrayList();
//		
		dep1.addPos(pos1);
		dep1.addPos(pos2);
//		
//		Company comp = new Company("apple", departments);
//		
//		comp.addDept(dep1);
//		comp.addDept(dep2);
//		
//		
//		comp.print();
//		System.out.printf("\tTotal Salary: %.2f", comp.getSalary());
		
//		System.out.printf("me%n");
//		System.out.printf("\tme%n");
//		System.out.printf("\t\tme%n\tyou");
		
		emp1.setPosition(pos1);
		emp2.setPosition(pos1);
				
		System.out.println(emp1.equals(emp2));
		System.out.println(pos2.equals(pos3));
		System.out.println(dep1.equals(dep2));
		System.out.println(emp1);
		System.out.println(pos1);
		System.out.println(dep1);
		
//		Hashtable<Employee, Position> table = new Hashtable<Employee, Position>();
//		
//		table.put(emp1, pos1);
//		table.put(emp2, pos2);
//		
//		System.out.println(table.get(emp1));
//		System.out.println(table.get(emp2));
//		
		
		//System.out.println(table.get(rose));
		
//		for(Student s : table.keySet()) {
//			System.out.println(s + ": " + table.get(s));
//		}
		
		System.out.println(emp1.hashCode() == emp2.hashCode());
		System.out.println(pos2.hashCode() == pos3.hashCode());
		
		Employee clone = (Employee) emp1.clone();
		System.out.println(clone != emp1 && clone.getClass() == emp1.getClass() && clone.equals(emp1));
		
		clone.getPosition().setDescription("new one");
		System.out.println(emp1.getPosition().getDescription());
		System.out.println(clone.getPosition().getDescription());
		
		
	}

}
