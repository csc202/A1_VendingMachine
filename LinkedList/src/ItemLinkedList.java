public class ItemLinkedList<T> {
	Node head, tail;
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

	// isEmpty
	// find
	public boolean find(T element) {
		boolean status = false;
		Node current = head;
		while (current != null) {
			if (current.getValue().equals(element)) {
				status = true;
				return status;
			}
			current = current.getLink();
		}
		return status;
	}

	// toT
	public String toString() {
		String list = "";
		Node current;
		current = head;
		while (current != null) {
			list += current.getValue() + " ";
			current = current.getLink();
		}
		return list;
	}
}
