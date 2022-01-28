package single;

public class CustomLinkedList {
	private Node head;
	private int size;
	
	public void addBack(String value) {
		Node n = new Node(value);
		if (size == 0) {
			head = n;
			size++;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = n;
		size++;
		
	}
	
	public void addFront(String value) {
		Node n = new Node(value);
		if (head == null) {
			head = n;
		}
		else {
			n.next = head;
			head = n;
		}
		size++;
		return;
	}
	
	public void insert(String value, int index) {
		if (index >= size) {
			return;
		}

		if (index == 0) {
			addFront(value);
			return;
		}
		Node n = new Node(value);
		int i = 0;
		
		Node temp = head;
		
		while (temp.next != null) {
			if (i == index - 1) {
				n.next = temp.next;
				temp.next = n;
				size++;
				return;
			}
			temp = temp.next;
			i++;
		}
		
	}
	
	public void remove(String data) {
		
		Node temp = new Node("");
		temp.next = head;
		while (temp.next != null) {
			if (temp.next.data.equals(data)) {
				temp.next = temp.next.next;
				size--;
				return;
			}
			temp = temp.next;
		}
	}
	
	public void remove(int index) {
		if (index > size) {
			return;
		}
		if (index == 0) {
			head = head.next;
			size--;
			return;
		}
		Node temp = new Node("");
		temp.next = head;
		int i = 0;
		while (temp.next != null) {
			if (i == index) {
				temp.next = temp.next.next;
				size--;
				return;
			}
			temp = temp.next;
			i++;
		}
	}
	
	public String get(int index) {
		if (index > size) {
			return null;
		}
		Node temp = head;
		int i =0;
		
		while (temp != null) {
			if (i == index) {
				return temp.data;
			}
			i++;
			temp = temp.next;
		}
		return null;
	}
	
	public int get(String value) {
		Node temp = head;	
		int i = 0;
		while (temp != null) {
			if (temp.data.equals(value)) {
				return i;
			}
			temp = temp.next;
		}
		return -1;
	}
	
	public int size() {
		return size;
	}

	@Override
	public String toString() {
		String s  = "";
		Node temp = head;
		while (temp  != null) {
			s += temp.data + ", ";
			temp = temp.next;
		}
		return s;
	}
	
	

}
