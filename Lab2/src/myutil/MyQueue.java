package myutil;

public class MyQueue<E> {

	Node<E> first;

	Node<E> last;

	private int size = 0;

	public void enqueue(E element) {

		Node<E> temp = new Node<E>(element, null);

		if (isEmpty()) {

			last = temp;

			first = temp;

		} else {

			last.next = temp;

			last = temp;

		}

		size++;

	}

	public E dequeue() throws QueueEmptyException {

		if (isEmpty()) {

			throw new QueueEmptyException();

		} else {

			size--;

			E temp = first.data;

			first = first.next;

			return temp;

		}

	}

	public boolean isEmpty() {

		return first == null;

	}

	public int getSize() {

		return this.size;

	}

}