public class ItemLinkedList<T> {
	Node head, tail, previous, current;
	int numElement;

	public ItemLinkedList() {
		head = null;
		tail = null;
		numElement = 0;
	}

	public void insert(T element) {
		Node newNode = new Node(element);
		if (head == null) {
			head = newNode;
		} else {
			tail.setLink(newNode);
		}
		tail = newNode;
		numElement++;
	}

	// remove
	public T remove(T element) {
		T item = null;
		if (find(element)) {
			if (current == head) {
				// remove head
				head = current.getLink();
			} else {
				// remove in between and tail
				previous.setLink(current.getLink());
			}
		}
		return item;
	}

	// isEmpty
	// find
	public boolean find(T element) {
		boolean status = false;
		current = head;
		previous = head;
		while (current != null) {
			if (current.getValue().equals(element)) {
				status = true;
				return status;
			}
			previous = current;
			current = current.getLink();
		}
		return status;
	}

	// toT
	public String toString() {
		String list = "";
		current = head;
		while (current != null) {
			list += current.getValue() + " ";
			current = current.getLink();
		}
		return list;
	}
}
