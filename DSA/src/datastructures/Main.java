package datastructures;

public class Main {

	public static void main(String[] args) {
		
		
		LinkedList linkedList = new LinkedList(4);
		linkedList.append(5);
		linkedList.append(6);
		linkedList.append(7);
		System.out.println("Head: "+linkedList.getHead().value);
		System.out.println("Tail: "+linkedList.getTail().value);
		System.out.println("Length: "+linkedList.getLength());
		Node temp=linkedList.getHead();
		System.out.print("Linked List ");
		while(temp!=null) {
			System.out.print(temp.value+" ");
			temp=temp.next;
		}
		System.out.print("\nremoved " + linkedList.removeLast().value);
		
		System.out.print("\nUpdated Linked List ");
		Node temp1=linkedList.getHead();
		while(temp1!=null) {
			System.out.print(temp1.value+" ");
			temp1=temp1.next;
		}
	}

}
