import java.util.Iterator;

public class MyDoublyList implements Iterable<String>{
	private Node head;
	private Node tail;
	
	private int size;
	
	public MyDoublyList() {
		head = new Node(null);
		tail = new Node(null);
		head.next = tail;
		tail.previous = head;
		
		size = 0;
	}
	
	public void addFirst(String input) {
		Node n = new Node(input);
		
		n.next = head.next;
		n.previous = head;
		
		head.next = n;
		n.next.previous = n;
		
		size++;
	}
	
	public void addLast(String input) {
		Node n = new Node(input);
		
		n.next = tail;
		n.previous = tail.previous;
		
		tail.previous = n;
		n.previous.next = n;
		
		size++;
	}
	
	public String get(int index) {
		if(size == 0 || index >= size) return null;
		
		int i = 0;
		Node temp = head.next;
		
		while(temp.next != null) {
			if(i == index) {
				return temp.data;
			}
			
			temp = temp.next;
			i++;
		}
		return null;
	}
	
	public int getIndex(String value) {
		if(value == null) return -1;
		
		int i = 0;
		Node temp = head.next;
		
		while(temp.next != null) {
			if(temp.data.equals(value)) {
				return i;
			}
			
			temp = temp.next;
			i++;
		}
		return -1;
	}
	
	public void remove(String value) {
		Node temp = head.next;
		while(temp.next != null) {
			if(temp.data.equals(value)) {
				
				temp.previous.next = temp.next;
				temp.next.previous = temp.previous;
				
				size--;
				return;
			}
			temp = temp.next;
		}
	}
	
	public void insert(String data, int index) {
		if(data == null || index >= size) return;
		
		Node n = new Node(data);
		
		int i = 0;
		Node temp = head.next;
		
		while(temp.next != null) {
			
			if(i == index) {
				n.next = temp;
				n.previous = temp.previous;
				n.previous.next = n;
				n.next.previous = n;
				
				size++;
				return;
			}
			
			i++;
			temp = temp.next;
		}
	}
	
	
	public int size() {return size;}

	@Override
	public Iterator iterator() {
		return new Iterator<String>() {
			int position = 0;
			@Override
			public boolean hasNext() {
				return position < size;
			}

			@Override
			public String next() {
				return get(position++);
			}	
		};
	}
	
}
