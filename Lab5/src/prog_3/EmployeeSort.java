package prog_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		new EmployeeSort();

	}
	public EmployeeSort() {
		Employee[] empArray =
			{new Employee("George", 40000, 1996,11,5),
			 new Employee("Dave", 50000, 2000, 1, 3),
			 new Employee("Richard", 45000, 2001, 2, 7)};
		List<Employee> empList = Arrays.asList(empArray);
		NameComparator nameComp = 
			new NameComparator();
		Collections.sort(empList, nameComp);
		
		SalaryComparator salComp = new SalaryComparator();
		
		HireDateComparator dateComp = new HireDateComparator();
		
		//System.out.println(empList);
		
		Collections.sort(empList, salComp);
		
		System.out.println(empList);
		
		//Collections.sort(empList, dateComp);
		
		//System.out.println(empList);
		
	}

}
