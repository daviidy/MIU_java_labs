
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary = 300;
		
		Employee employee1 = new Employee("david", "dave", 150000, 1994, 10, 14);
		
		Account checkings = new Account(employee1, AccountType.CHECKING, salary);
		
		Account savings = new Account(employee1, AccountType.SAVINGS, salary);
		
		Account retirements = new Account(employee1, AccountType.RETIREMENT, salary);
		
		System.out.println(checkings.toString());
		
		System.out.println(savings.toString());
		
		System.out.println(retirements.toString());

	}

}
