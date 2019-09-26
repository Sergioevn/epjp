package linkedList;

public class MyList {
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

	public int get() {
		Node currentnode = head;
		return currentnode.getValue();
	}

	// Get
	public int get(int index) {
		Node currentnode = head;
		for (int i = 1; i <= index - 1; i++) {
			currentnode = currentnode.getNextnode();
		}
		return currentnode.getValue();
	}

	public void pop() {
		this.head = head.getNextnode();
	}

}
