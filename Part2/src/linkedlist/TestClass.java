
public class TestClass {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		
		list.add("FPP");
		list.add("MPP");
		list.add("WAA");
		
		
		System.out.println(list);
		list.insert("EA", 1);
		list.insert("WAP", list.size());
		System.out.println(list);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(2));
		list.update("Algorithms", 0);
		System.out.println(list);
	}
}
