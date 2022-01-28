package single;

public class MyStack {
	private DoubleLinkedList list;
	
	public MyStack() {
		list = new DoubleLinkedList();
	}
	
	public void push(String data) {
		list.addFirst(data);
	}
	
	public String peek() {
		try {
			list.get(0);
		} catch (ListException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}
