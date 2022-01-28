
public class MyLinkedList {
	private Node head;
	private int size;
	
	public int size() {
		return size;
	}
	
	public void add(String input) {
		Node n = new Node(input);
		
		if(head == null) {
			head = n;
		}else {
			n.next = head;
			head = n;
		}
		size++;
	}
	
	public void update(String input, int index) {
		if(index >= size) return;
		
		Node temp = head;
		int i = 0;
		while(temp != null) {
			if(i == index) {temp.data = input; return;}
			temp = temp.next;
			i++;
		}
	}
	
	public void insert(String input, int index) {
		if(index > size) return;
		if(index == 0) {add(input); return;}
		
		Node temp = head;
		int i = 0;
		
		while(temp != null) {
			if(i == index-1) {
				Node n = new Node(input);
				n .next = temp.next;
				temp.next = n;
				size++;
				return;
			}
			temp = temp.next;
			i++;
		}
	}
	
	public void remove(String input) {
		Node temp = new Node("");
		temp.next = head;
		
		while(temp.next != null) {
			if(temp.next.data.equals(input)) {
				temp.next = temp.next.next;
				size--;
				return;
			}
			
			temp = temp.next;
		}
	}
	
	public void remove(int index) {
		if(index >= size) return;
		if(index == 0) {
			head = head.next;
			size--;
			return;
		}
		
		Node temp = new Node("");
		temp.next = head;
		int i = 0;
		while(temp.next != null) {
			
			if(i == index) {
				temp.next = temp.next.next;
				size--;
				return;
			}
			
			temp = temp.next;
			i++;
		}	
	}
	
	public String get(int index) {
		Node temp = head;
		int i = 0;
		while(temp != null) {
			if(i == index) {
				return temp.data;
			}
			temp = temp.next;
			i++;
		}
		return null;
	}
	
	@Override
	public String toString() {
		String s = "";
		Node temp = head;
		while(temp != null) {
			s += temp.data + ", ";
			temp = temp.next;
		}
		return s;
	}
}
