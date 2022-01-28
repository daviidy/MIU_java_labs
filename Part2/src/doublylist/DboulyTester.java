
public class DboulyTester {

	public static void main(String[] args) {
		MyDoublyList list = new MyDoublyList();
		
		list.addFirst("FPP");
		list.addFirst("MPP");
		list.addLast("WAP");
		list.remove("WAP");
		list.insert("WAP", 1);
		
		for(String s : list) {
			System.out.println(s);
		}
	}

}
