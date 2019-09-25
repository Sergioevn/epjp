package linkedList;

public class linkedList {
	/*
	 * / add to head get() -- from head, ritorna elemento finale to string()--
	 * stampa collezione pop() -- removes tail no tail /
	 */
	Node head;
	private int size = 0;
	int get = 0;

	public void add(int value) {
		Node cur = head;

		if (head == null) {
			head = new Node(value);
			size++;
		} else {
			while (cur.getNextnode() != null) {
				cur = cur.getNextnode();
				size++;
			}

			cur.setNextnode(new Node(value));
		}

	}

	@Override
	public String toString() {
		Node currentnode = head;
		StringBuilder sb = new StringBuilder();
		while (currentnode != null) {
			sb.append(" " + String.valueOf(currentnode.getValue()));
			currentnode = currentnode.getNextnode();
		}
		return "linkedList [" + sb + " " + "]";
	}

	// Size
	public int size() {
		return size;
	}

	// Get
	public int get() {
		return head.getValue();
	}

}
