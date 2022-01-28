
public class Details {
	String program;
	String entry;
	
	public Details(String program, String entry) {
		this.program = program;
		this.entry = entry;
	}
	
	public String toString() {
		return program + ", " + entry;
	}
}
