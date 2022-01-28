package prog3;



public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int size = 0;
	private int front = -1;
	private int rear = 0;
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public void enqueue(int num) {
		if (rear == arr.length) {
			resize();
		}
		arr[rear] = num;
		front ++;
		rear ++;
		size++;
	}
	
	public int dequeue() {
		if(isEmpty()) throw new IllegalStateException("Cannot peek becausevQueue is empty!");
		int res = arr[0];
		System.arraycopy(arr, 1, arr, 0, arr.length - 1);
		size --;
		front--;
		rear--;
		return res;
	}
	
	void resize() {
		int[] newArray = new int[arr.length * 2];
		System.arraycopy(arr, 0, newArray, 0, arr.length);
		arr = newArray;
	}
	
	public int peek() {
		if(isEmpty()) throw new IllegalStateException("Cannot peek becausevQueue is empty!");
		return arr[0];
	}
	
	
	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
		
		//uncomment when ready
		for(int i = 0; i < 15; i ++)
			q.enqueue(i);
		for(int i = 0; i < 14; i ++)
			q.dequeue();
		System.out.println(q.size());
		System.out.println(q.peek());
	}
}

