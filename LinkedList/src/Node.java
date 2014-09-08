
public class Node <T>{
	private T value;
	private Node  link;
	
	public Node(T value) {
		this.value = value;
		this.link = null;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node link) {
		this.link = link;
	}
	
}
