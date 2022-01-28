package stacks;

import java.util.Iterator;

public class Stack implements Iterable<String> {
	private Node head;
	private int size;
	
	public void push(String data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
			size++;
			return;
		}
		n.next = head;
		head = n;
		return;
	}
	
	public String peak() {
		if (head == null) {
			return null;
		}
		return head.data;
	}
	
	public String pop() {
		if (head == null) {
			return null;
		}
		String s = peak();
		head = head.next;
		size--;
		return s;
	}
	
	public int size() {
		return size;
	}

	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			int position = 0;
			@Override
			public boolean hasNext() {
				return position < size;
			}

			@Override
			public String next() {
				return null;
			}
			
		};
	}
}
