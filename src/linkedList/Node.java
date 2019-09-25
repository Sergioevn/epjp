package linkedList;

public class Node {
	private int value;
	private Node nextnode;

	public Node() {

	}

	public Node(int value) {
		this.value = value;

	}

	public Node(Node nextnode) {
		this.nextnode = nextnode;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNextnode() {
		return nextnode;
	}

	public void setNextnode(Node nextnode) {
		this.nextnode = nextnode;
	}

	@Override
	public String toString() {
		return "Node [" + value + "]";
	}

}
