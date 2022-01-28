import java.util.*;

public class Admin {

	public Admin() {
	}
	
	static void computeUpdatedBalanceSum(List<Employee> employees) {
		for(Employee emp: employees) {
			System.out.println(emp.computeUpdatedBalanceSum());
		}
	}
}
