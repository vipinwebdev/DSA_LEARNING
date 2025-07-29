package datastructures;

import java.util.HashSet;
import java.util.Set;

class Node1 {
	int value;
	Node1 next;

	Node1(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", next=" + next + "]";
	}

}

public class LinkedList {
	private Node1 head;
	private Node1 tail;
	private int length;

	public LinkedList(int value) {
		Node1 newNode = new Node1(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	public Node1 getHead() {
		return head;
	}

	public void setHead(Node1 head) {
		this.head = head;
	}

	public Node1 getTail() {
		return tail;
	}

	public void setTail(Node1 tail) {
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
		Node1 newNode = new Node1(value);
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
	public Node1 removeLast() {
		if (length == 0)
			return null;
		Node1 temp = head;
		Node1 pre = head;
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
	public Node1 prependNode(int value) {
		Node1 newNode = new Node1(value);
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
	public Node1 removeFirst() {
		Node1 first = head;
		if (length == 0)
			return null;
		head = head.next;
		first.next = null;
		length--;
		if (length == 0)
			tail = null;

		return first;

	}

	public Node1 getNode(int index) {
		if (index < 0 || index >= length)
			return null;
		Node1 temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public boolean setNode(int index, int value) {
		Node1 node1 = getNode(index);
		if (node1 != null) {
			node1.value = value;
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
		Node1 node1 = new Node1(value);
		Node1 temp = getNode(index - 1);
		node1.next = temp.next;
		temp.next = node1;
		length++;
		return true;
	}

	public Node1 removeItem(int index) {
		if (index < 0 || index >= length)
			return null;
		if (index == 0)
			return removeFirst();
		if (index == length - 1)
			return removeLast();
		Node1 node1 = getNode(index - 1);
		Node1 temp = node1.next;
		node1.next = temp.next;
		temp.next = null;
		length--;
		return temp;
	}

	public void reverse() {
		Node1 temp = head;
		head = tail;
		tail = temp;
		Node1 after = null;
		Node1 before = null;
		for (int i = 0; i < length; i++) {
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
	}

	public Node1 findMiddleNode() {
		if (head == null)
			return null;

		Node1 slow = head;
		Node1 fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	public boolean hasLoop() {
		if (head == null)
			return false;

		Node1 slow = head;
		Node1 fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;
		}
		return false;
	}

	public Node1 findKthFromEnd(int k) {

		Node1 first = head;
		Node1 second = head;
		for (int i = 0; i < k; i++) {
			if (first == null)
				return null;
			first = first.next;
		}
		while (first != null) {
			first = first.next;
			second = second.next;
		}
		return second;
	}

	public void partitionList(int x) {
		Node1 beforeHead = new Node1(0); // Dummy node for values < x
		Node1 afterHead = new Node1(0); // Dummy node for values >= x

		Node1 before = beforeHead;
		Node1 after = afterHead;
		Node1 current = head;

		while (current != null) {
			if (current.value < x) {
				before.next = current;
				before = before.next;
			} else {
				after.next = current;
				after = after.next;
			}
			current = current.next;
		}

		after.next = null;
		before.next = afterHead.next;

		head = beforeHead.next;
	}

	public void removeDuplicates() {
		Set<Integer> seen = new HashSet<>();
		Node1 current = head;
		Node1 prev = null;

		while (current != null) {
			if (seen.contains(current.value)) {
				if(prev !=null) {
					prev.next = current.next; // remove duplicate
					length--;
				}
				
			} else {
				seen.add(current.value);
				prev = current;
			}
			current = current.next;
		}
	}
	
	// WRITE THE REVERSEBETWEEN METHOD HERE //
    public void reverseBetween(int startIndex, int endIndex){
        if (head == null || startIndex >= endIndex) return;
        Node1 dummy = new Node1(0);
        dummy.next = head;
        Node1 prev = dummy;
        for (int i = 0; i < startIndex; i++) {
            if (prev == null) return;
            prev = prev.next;
        }
        Node1 current = prev.next;
        Node1 toMove;
        for(int i = 0; i<endIndex-startIndex && current.next != null;i++){
            toMove = current.next;
            current.next = toMove.next;
            toMove.next = prev.next;
            prev.next = toMove;
        }
        head=dummy.next;
        
    }
    //////////////////////////////////////////

    public void swapPairs(){
    	if (head == null) return;
    	Node1 dummy = new Node1(0);
        dummy.next = head;
        Node1 prev = dummy;
        
        while (prev.next != null && prev.next.next != null) {
            Node1 first = prev.next;
            Node1 second = first.next;
            
            first.next = second.next;
            second.next = first;
            prev.next = second;
            
            prev = first;
        }
        head=dummy.next;
    }
}
