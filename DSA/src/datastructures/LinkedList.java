package datastructures;

class Node {
	int value;
	Node next;

	Node(int value) {
		this.value = value;
	}
}

public class LinkedList {
	private Node head;
	private Node tail;
	private int length;

	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	/*
	 * Append last
	 */
	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}

	/**
	 * Remove last item from linked list
	 */
	public Node removeLast() {
		if (length == 0)
			return null;
		Node temp = head;
		Node pre = head;
		while (temp.next != null) {
			pre = temp;
			temp = temp.next;
		}
		tail = pre;
		tail.next = null;
		length--;
		if (length == 0) {
			head = null;
			tail = null;
		}

		return temp;
	}

	/**
	 * Appends the item at the start of linked list
	 */
	public Node prependNode(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		length++;

		return head;
	}

	/**
	 * Remove item from the start of linked list
	 */
	public Node removeFirst() {
		Node first = head;
		if (length == 0)
			return null;
		head = head.next;
		first.next = null;
		length--;
		if (length == 0)
			tail = null;

		return first;

	}

	public Node getNode(int index) {
		if (index < 0 || index >= length)
			return null;
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public boolean setNode(int index, int value) {
		Node node = getNode(index);
		if (node != null) {
			node.value = value;
			return true;
		}

		return false;
	}

	public boolean insert(int index, int value) {
		if (index < 0 || index > length)
			return false;
		if (index == 0) {
			prependNode(value);
			length++;
			return true;
		}
		if (index == length) {
			append(value);
			length++;
			return true;
		}
		Node node = new Node(value);
		Node temp = getNode(index - 1);
		node.next = temp.next;
		temp.next = node;
		length++;
		return true;
	}

	public Node removeItem(int index) {
		if (index < 0 || index >= length)
			return null;
		if (index == 0)
			return removeFirst();
		if (index == length - 1)
			return removeLast();
		Node node = getNode(index - 1);
		Node temp = node.next;
		node.next = temp.next;
		temp.next = null;
		length--;
		return temp;
	}

	public void reverse() {
		Node temp = head;
		head = tail;
		tail = temp;
		Node after = null;
		Node before = null;
		for (int i = 0; i < length; i++) {
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
	}

	public Node findMiddleNode() {
		if (head == null)
			return null;

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	public boolean hasLoop() {
		if (head == null)
			return false;

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;
		}
		return false;
	}

}
