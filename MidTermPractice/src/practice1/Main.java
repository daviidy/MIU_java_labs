package practice1;

import java.util.*;

public class Main {
	// member inner class
	class sortSalary implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			return (int) (o1.getSalary() - o2.getSalary());
		}
		
	}
	
	static class sortSalaryDescending implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			return (int) ((o1.getSalary() - o2.getSalary())) * -1;
		}
		
	}
	
	static void printer(Employee[] employees) {
		
		for(Employee e: employees) {
			System.out.println(e);
		}
		
		System.out.println("=====================================================");
	}
	public static void main(String[] args) {
		
		class sortIdNumber implements Comparator<Employee>{

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getIdNumber() - o2.getIdNumber();
			}
			
		}
		
		
		Employee emp1 = new Employee();
		Secretary emp2 = new Secretary("alex", 1234, 300, "full-time");
		Secretary emp3 = new Secretary("aba", 123, 350, "freelance");
		Manager emp4 = new Manager();
		
		Employee[] employees = new Employee[4];
		employees[0] = emp1;
		employees[1] = emp2;
		employees[2] = emp3;
		employees[3] = emp4;
		
		Arrays.sort(employees);
		
		printer(employees);
		
		Main main = new Main();
		Main.sortSalary sortSal = main.new sortSalary();
		Main.sortSalaryDescending sortSalDes = new Main.sortSalaryDescending();
		sortIdNumber sortNum = new sortIdNumber();
		
		Arrays.sort(employees, sortSal);
		
		printer(employees);
		
		Arrays.sort(employees, sortSalDes);
		
		printer(employees);
		
		Arrays.sort(employees, sortNum);
		
		printer(employees);
		
		Arrays.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) ((o1.getIdNumber() - o2.getIdNumber())) * -1;
			}
			
		});
		
		printer(employees);
		
		Arrays.sort(employees, (Employee o1, Employee o2) -> (int) ((o1.getIdNumber() - o2.getIdNumber())) * -1);
		
		printer(employees);
		
		System.out.println(Math.pow(2, 3));
	}
}
