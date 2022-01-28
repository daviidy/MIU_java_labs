import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer {
	String ODD_DELIMITER = ""+(char)0;
	String filename;
	String text;
	char[] left;
	char[] right;
	public SymbolBalancer(String filename) {
		this.filename = filename;
		readFile();
	}
	public void setText(String text) {
		this.text = text;
	}
	
	boolean symbolsBalanced(String delimiters){
		//implement
		MyStringStack stack = new MyStringStack();
		String arr[] = delimiters.split("");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == "(" || arr[i] == "[") {
				stack.push( arr[i]);
			}
			switch (arr[i]) {
			case "(":
			case "[":
			case "<":
			case "{":
			{
				
				stack.push( arr[i]);
				break;
			}
			case ")":
			case "]":
			case ">":
			case "}":
			{
				if (stack.size() == 0) {
					return false;
				}
				String close = stack.pop();
				if (close != arr[i]) {
					return false;
				}
			}
			default:
				return false;
			}
		}//end for
		
		return true;
		
	}
	
	public static void main(String[] args) {
		SymbolBalancer sb = new SymbolBalancer("prog_2\\Employee.java");
		System.out.println(sb.symbolsBalanced("[]{}<>()"));
	}
	
	void readFile() {
		String prefix = System.getProperty("user.dir") + "\\src\\";
		try {
			Scanner sc = new Scanner(new File(prefix + filename));
			sc.useDelimiter(ODD_DELIMITER);
			text = sc.next();
			System.out.println(text);
			sc.close();
		}
		catch(FileNotFoundException ex) {
			System.err.println("File Not Found Exception " + ex.getMessage());
		}
	}
	
}



