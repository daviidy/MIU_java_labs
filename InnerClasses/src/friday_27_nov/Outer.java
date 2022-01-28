package friday_27_nov;

public class Outer {
	
	class Inner{
		String name = "inner class";
		
		public void printSomething() {
			System.out.println(s);
		}
	}
	
	static class Inner2{
		String name = "inner class";
		
		public void printSomething() {
			System.out.println();
		}
	}
	

	private String s = "New String";
	
	public int number() {
		Outer.Inner2 i2 = new Outer.Inner2();
		String n = i2.name;
		return 15;
	}
	
	
}
