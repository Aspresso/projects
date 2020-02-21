package myutil;

public class MyStack<E> {

	Node<E> top;

	private int size = 0;

	public void peek() throws StackEmptyException {

		if (isEmpty()) {

			throw new StackEmptyException();

		} else {

			E content = top.data;

			System.out.println("Högst upp i stacken finns nu " + content);

		}

	}

	public void push(E element) {

		size++;

		Node<E> n = new Node<E>(element, top);

		top = n;

	}

	public E pop() throws StackEmptyException {

		if (isEmpty()) {

			throw new StackEmptyException();

		} else {

			size--;

			E temp = top.data;

			top = top.next;

			return temp;

		}

	}

	public boolean isEmpty() {

		return top == null;

	}

	public int getSize() {

		return this.size;

	}

	public void emptyOutStack() {

		top = null;

		size = 0;

	}

}
