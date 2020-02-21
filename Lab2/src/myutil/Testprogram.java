package myutil;

public class Testprogram {

	public static void stackTest(/*MyStack stack*/) {
		
		MyStack<Integer> stack = new MyStack<Integer>();
		
		try {
			System.out.println(stack.pop());
		} catch (StackEmptyException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(stack.getSize() + " i stack");

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		System.out.println(stack.getSize() + " i stack");
		try {
			System.out.println(stack.pop());
		} catch (StackEmptyException e) {
			System.out.println(e.getMessage());
		}

		try {
			stack.peek();
		} catch (StackEmptyException e) {
			System.out.println(e.getMessage());
		}

		if (stack.isEmpty()) {
			System.out.println("Stacken är tom");
		} else {
			System.out.println("Stacken är inte tom");
		}
		System.out.println("Det finns " + stack.getSize() + " element i stacken");

		try {
			System.out.println(stack.pop());
		} catch (StackEmptyException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println(stack.pop());
		} catch (StackEmptyException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println(stack.pop());
		} catch (StackEmptyException e) {
			System.out.println(e.getMessage());
		}

		if (stack.isEmpty()) {
			System.out.println("Stacken är tom");
		} else {
			System.out.println("Stacken är inte tom");
		}

		stack.push(1);
		stack.push(2);

		try {
			System.out.println(stack.pop());
		} catch (StackEmptyException e) {
			System.out.println(e.getMessage());
		}

		stack.emptyOutStack();

		if (stack.isEmpty()) {
			System.out.println("Stacken är tom");
		} else {
			System.out.println("Stacken är inte tom");
		}

		try {
			System.out.println(stack.pop());
		} catch (StackEmptyException e) {
			System.out.println(e.getMessage());
		}

		try {
			stack.peek();
		} catch (StackEmptyException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Stacktest avslutat\n\n\n");
	}

	public static void queueTest() {

		MyQueue<Integer> queue = new MyQueue<Integer>();
		
		try {
			queue.dequeue();
		} catch (QueueEmptyException e) {
			System.out.println(e.getMessage());
		}

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);

		if (queue.isEmpty()) {
			System.out.println("Kön är tom");
		} else {
			System.out.println("Kön är inte tom");
		}
		
		System.out.println(queue.getSize() + " i kö");

		try {
			System.out.println(queue.dequeue());
		} catch (QueueEmptyException f) {
			System.out.println(f.getMessage());
		}

		try {
			System.out.println(queue.dequeue());
		} catch (QueueEmptyException f) {
			System.out.println(f.getMessage());
		}

		System.out.println(queue.getSize() + " i kö");

		try {
			System.out.println(queue.dequeue());
		} catch (QueueEmptyException f) {
			System.out.println(f.getMessage());
		}

		try {
			System.out.println(queue.dequeue());
		} catch (QueueEmptyException f) {
			System.out.println(f.getMessage());
		}

		try {
			System.out.println(queue.dequeue());
		} catch (QueueEmptyException f) {
			System.out.println(f.getMessage());
		}

		try {
			System.out.println(queue.dequeue());
		} catch (QueueEmptyException f) {
			System.out.println(f.getMessage());
		}

		if (queue.isEmpty()) {
			System.out.println("Kön är tom");
		} else {
			System.out.println("Kön är inte tom");
		}

		System.out.println("Kötest avslutat \n\n\n");

	}

	public static void listTest() {
		
		MyList<Integer> list = new MyList<Integer>();
		
		if (list.isEmpty()) {
			System.out.println("Kön är tom");
		} else {
			System.out.println("Kön är inte tom");
		}
		
		try {
			System.out.println(list.getElementAt(1));
		} catch (ListBoundaryException f) {
			System.out.println(f.getMessage());
		}
		
		list.add(10);
		System.out.println("1 added");
		list.add(20);
		System.out.println("2 added");
		list.add(30);
		System.out.println("3 added");
		list.add(40);
		System.out.println("4 added");
		list.add(50);
		list.add(60);
		list.add(70);
		
		list.printList(list);
		
		try {
			System.out.println(list.getElementAt(0));
		} catch (ListBoundaryException f) {
			System.out.println(f.getMessage());
		}
		
		try {
			System.out.println(list.getElementAt(2));
		} catch (ListBoundaryException f) {
			System.out.println(f.getMessage());
		}
		
		try {
			System.out.println(list.getElementAt(5));
		} catch (ListBoundaryException f) {
			System.out.println(f.getMessage());
		}
		
		try {
			System.out.println(list.getElementAt(100));
		} catch (ListBoundaryException f) {
			System.out.println(f.getMessage());
		}
		
		System.out.println("Listan är "+list.size()+ " element stor");
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		stackTest();
		queueTest();
		listTest();
	}

}