
public class Man extends Human {
	
	String name;

	public Man(String hairColor, HairSize hairSize, String name) {
		super(hairColor, hairSize);
		this.name = name;
	}
	
	String sayName() {
		return "My name is " + name;
	}
	
	
	
}
