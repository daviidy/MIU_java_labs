package single;

public class Main {
	public static void main(String[] args) {
		CustomLinkedList list = new CustomLinkedList();
//		list.addFront("DAVE");
//		System.out.println(list);
//		list.addFront("MARIE");
//		System.out.println(list);
//		list.addBack("GEMI");
//		System.out.println(list);
//		list.get("GEMI");
//		System.out.println(list);
//		list.insert("YOANN", 1);
		
		MyStack stack = new MyStack();
		try {
			stack.peek();
		} catch (ListException e) {
			System.out.println(e.getMessage());
		}
//		System.out.println(list);
	}

}
