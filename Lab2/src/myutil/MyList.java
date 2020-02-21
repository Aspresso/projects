package myutil;

public class MyList<E> {

	Node<E> first;
	//Node<E> last;
	private int size = 0;

	

	public void add(E element) {
		Node<E> temp = new Node<E>(element);
		Node<E> current = first;
		
		if (first == null) {
			this.first = temp;
			current = first;
			size++;
			return;
		}
		while (current.next != null) {
			current = current.next;
		}
		current.next = temp;
		size++;
	
	}
		
		
/*		if (isEmpty()) {
			Node<E> temp = new Node<E>(element, null);
			first = temp;
			last = temp;
			size++;
		System.out.println("test1");
		} else if (size == 1) {
			Node<E> temp = new Node<E>(element, last);
			temp = first;
			size++;
			System.out.println("test2");
		} else {
			Node<E> temp = new Node<E>(element, first);
			temp = first;
			size++;
			System.out.println("test 3");
		}
*/
	 /*
		 * 
		 * Node<E> temp = first; first = null;
		 * 
		 * 
		 * 
		 * while (last.getNext != null) last.getNext(); { node = first;:/ }
		 * 
		 */

	/*
	 * 
	 * lSka returnera ett element på index i (första elementet ligger på index 0)
	 * 
	 * utan att ta bort det ur listan. Kastar exception om i är större än eller lika
	 * 
	 * med listans storlek.
	 * 
	 */
	
	public void printList(MyList list) {
		Node<E >temp = list.first;
		
		for (int x = 0; x < size(); ++x) {
			System.out.println(temp.data);
			temp = temp.next;		}
	}

	public E getElementAt(int key) throws ListBoundaryException {

		if (!isEmpty() && key <= this.size()) {
			Node<E> temp = first;

			for (int x = 0; x < key; ++x) {
			//System.out.println(temp.data);
				temp = temp.next;
			
			}
			return temp.data;
			
		} else {
			throw new ListBoundaryException();
		}
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		return this.size;
	}
	/*
	 * if (temp.getNext() != null) { counter++; if (counter == i) { return
	 * temp.data; } temp = temp.next; } return null; }
	 */
}