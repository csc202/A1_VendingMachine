
public class Node {
	private String value;
	private Node  link;
	
	public Node(String value) {
		this.value = value;
		this.link = null;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node link) {
		this.link = link;
	}
	
}
