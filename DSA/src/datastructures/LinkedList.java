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
		if(length == 0) return null;
		Node temp = head;
		Node pre = head;
		while(temp.next != null) {
			pre = temp;
			temp = temp.next;
		}
		tail = pre;
		tail.next = null;
		length--;
		if(length == 0) {
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
		if(length == 0) {
			head = newNode;
			tail = newNode;
		}else {
			newNode.next=head;
			head=newNode;
		}
		length++;
		
		return head;
	}

}
