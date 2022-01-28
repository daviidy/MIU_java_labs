package stacks;

public class Main {

	public static void main(String[] args) {
//		Stack myStack = new Stack();
//		myStack.push("MPP");
//		myStack.push("FPP");
//		myStack.push("WAP");
//		myStack.push("EA");
		
		Queue myQueue = new Queue();
		myQueue.enqueue("MPP");
		myQueue.enqueue("FPP");
		myQueue.enqueue("WAP");
		myQueue.enqueue("EA");
		
		System.out.println(myQueue.peak());
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.peak());
	}

}
