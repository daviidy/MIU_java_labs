package prog_1;

public class Main {

	public static void main(String[] args) {
		MyStringStack stack = new MyStringStack();
		stack.push("Bob");
		stack.push("Harry");
		stack.push("Alice");
		System.out.println("Popping…"+stack.pop()); //Alice
		System.out.println("Peeking…."+stack.peek()); //Harry
		System.out.println("Popping…"+stack.pop());// Harry
	}

}
