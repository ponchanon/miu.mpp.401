package prob6;

//Show the methods are not threadsafe.
//Then modify so that they are threadsafe.
public class QueueModified {
	static int addCounter = 0;

	class Node {
		Object value;
		Node next;

	}

	private Node head;
	private Node tail;

	public synchronized void add(Object newValue) {
		Node n = new Node();
		if (head == null)
			head = n;
		else
			tail.next = n;
		tail = n;
		tail.value = newValue;

		addCounter++;
	}

	public synchronized int getAddCounter() {
		return addCounter;
	}

	public synchronized Object remove() {
		if (head == null)
			return null;
		Node n = head;
		head = n.next;
		return n.value;
	}

	@Override
	public String toString() {
		if (head == null)
			return null;

		String out = "";

		Node current = head;
		while (current != null) {
			out += current.value + " ";
			current = current.next;
		}

		return out;
	}
}
