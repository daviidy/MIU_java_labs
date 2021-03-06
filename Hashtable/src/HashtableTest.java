import java.util.Hashtable;

public class HashtableTest {
	public static void main(String[] args) {
		Student david = new Student("David Munch", 12345);
		Student david2_0 = new Student("David Munch", 12345);
		Student stewart = new Student("Stewart Little", 67890);
		Student hugh = new Student("Hugh Mungus", 44573);
		Student zenya = new Student("Zenya Onatop", 43099);
		Student eva = new Student("Eva blue", 39482);
		
		Details d = new Details("Compro", "Feb2022");
		Details d2 = new Details("MSD", "November2019");
		
		Hashtable<Student, Details> table = new Hashtable<Student, Details>();
		
		table.put(david, d);
		table.put(stewart, d);
		table.put(hugh, d2);
		table.put(zenya, d);
		table.put(eva, d2);
		
		//System.out.println(table.get(david));
		table.put(david2_0, d2);
		//System.out.println(table.get(david));
		
		Student rose = new Student("David Munch", 12345);
		
		//System.out.println(table.get(rose));
		
		for(Student s : table.keySet()) {
			System.out.println(s + ": " + table.get(s));
		}
		
		/*for(Details x : table.values()) {
			System.out.println(x);
		}*/
		
		
	}
	
}
