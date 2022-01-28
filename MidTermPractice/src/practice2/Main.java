package practice2;

public class Main {

	public static void main(String[] args) {
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.sqrt(16));
		String x = "x";
		String y = "x";
		System.out.println(x.equals(y));
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		int a = 2;
		
		System.out.println(emp1.equals(emp2));
		
		System.out.println(3 * 5 / 9 % 2);
		System.out.println(4 ^ 3 & 5);
		
		System.out.println(a++ + a++ + ++a);
	}

}
