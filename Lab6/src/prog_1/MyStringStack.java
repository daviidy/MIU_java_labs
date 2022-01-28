package prog_1;

public class MyStringStack {
	private MyStringLinkedList list;
	
	public MyStringStack() {
		list = new MyStringLinkedList();
	}
	
	public void push(String data) {
		list.addFront(data);
	}
	
	public String peek() {
		return list.get(0);
	}
	
	public String pop() {
		String s = peek();
		list.remove(0);
		return s;
	}
}
