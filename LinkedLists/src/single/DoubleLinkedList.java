package single;

import java.util.Iterator;

public class DoubleLinkedList implements Iterable<String> {
	private Node head;
	private Node tail;
	public int size;
	
	public DoubleLinkedList() {
		head = new Node(null);
		tail = new Node(null);
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
	
	public String get(int index) throws ListException {
		if(size == 0 || index >= size) throw new ListException("index cannot be zero or greater than size");
		
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
	
	public void remove(String data) {
		Node temp = head.next;
		
		while(temp.next != null) {
			if (temp.data.equals(data)) {
				temp.previous.next = temp.next;
				temp.next.previous = temp.previous;
				size--;
				return;
			}
			temp = temp.next;
		}
		return;
	}
	
	public void removeIndex(int index) {
		Node temp = head.next;
		int i = 0;
		
		while(temp.next != null) {
			if (i == index) {
				temp.previous.next = temp.next;
				temp.next.previous = temp.previous;
				size--;
				return;
			}
			temp = temp.next;
		}
		return;
	}
	
	public void insert(String data, int index) {
		if (data == null || index >= size) {
			return;
		}
		Node n = new Node(data);
		
		int i = 0;
		Node temp = head.next;
		
		while(temp.next != null) {
			if (index == i) {
				n.next = temp;
				n.previous = temp.previous;
				
				temp.previous.next = n;
				temp.next.previous = n;
				size++;
				return;
			}
			i++;
			temp = temp.next;
		}
		return;
	}
	
	public int size() {
		return size;
	}

	@Override
	public Iterator<String> iterator() {
		return new iterate();
	}
	
	class iterate implements Iterator<String>{
		int position = 0;
		@Override
		public boolean hasNext() {
			return position < size;
		}

		@Override
		public String next() {
			try {
				return get(position++);
			} catch (ListException e) {
				e.getMessage();
				return  null;
			}
		}
	}
	
}
