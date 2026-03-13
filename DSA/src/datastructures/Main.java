package datastructures;

public class Main {

	public static void main(String[] args) {
		
//		LinkedList linkedList = new LinkedList(1);

		
//		linkedList.append(6);
//		linkedList.append(3);
//		linkedList.append(4);
//		linkedList.append(3);
//		linkedList.append(5);
////		linkedList.append(8);
//		System.out.print("\n================ Initials =======================\n");
//		System.out.println("Head: "+linkedList.getHead().value);
//		System.out.println("Tail: "+linkedList.getTail().value);
//		System.out.println("Length: "+linkedList.getLength());
//		Node1 temp=linkedList.getHead();
//		System.out.print("Original Linked List ");
//		while(temp!=null) {
//			System.out.print(temp.value+" ");
//			temp=temp.next;
//		}

//		System.out.print("\n================ Operation =======================");
//		System.out.print("\nremoved " + linkedList.removeLast().value);
//		System.out.print("\nPrepended " + linkedList.prependNode(3).value);
//		System.out.print("\nRemoved First: " + linkedList.removeFirst().value);
//		System.out.print("\nGet Node: " + linkedList.getNode(3).value);
//		System.out.print("\nSet Node: " + linkedList.setNode(3,8));
//		System.out.print("\nInsert : " + linkedList.insert(1,8));
//		System.out.print("\nRemove from index : " + linkedList.removeItem(3));
//		System.out.print("\nReverse : ");linkedList.reverse();
//		System.out.print("\nMiddle Node : "+linkedList.findMiddleNode().value);
//		System.out.print("\nHas loop : "+linkedList.hasLoop());
//		System.out.print("\nGet Kth node from the end : "+linkedList.findKthFromEnd(2).value);
//		linkedList.partitionList(3);
//		linkedList.removeDuplicates();
//		linkedList.reverseBetween(1,3);
		/*
		 * System.out.print("\nSwap pairs : "+linkedList.findKthFromEnd(2).value);
		 * linkedList.swapPairs();
		 * 
		 * 
		 * System.out.
		 * println("\n=================================================\nUpdated Head: "
		 * +linkedList.getHead().value);
		 * System.out.println("Updated Tail: "+linkedList.getTail().value);
		 * System.out.println("Updated Length: "+linkedList.getLength());
		 * System.out.print("\nUpdated Linked List: "); Node1
		 * temp1=linkedList.getHead(); while(temp1!=null) {
		 * System.out.print(temp1.value+" "); temp1=temp1.next; }
		 */
		
		//===================================================================================
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
		System.out.print("\n================ Initials =======================\n");
		doublyLinkedList.getHead();
		doublyLinkedList.getTail();
		doublyLinkedList.getLength();
		System.out.print("\nDoubly Linked List: ");
		doublyLinkedList.printList();
		
		System.out.print("\n================ Operation =======================");
		System.out.print("\nAppend: ");
		doublyLinkedList.append(2);
		doublyLinkedList.append(3);
		doublyLinkedList.append(4);
		doublyLinkedList.append(5);
		doublyLinkedList.printList();
		System.out.print("\n");
		doublyLinkedList.getLength();
		
//		System.out.print("\nRemove Last: ");
//		System.out.print(doublyLinkedList.removeLast().value);
//		System.out.print("\nPrepend: ");
//		doublyLinkedList.prepend(8);
		
//		System.out.print("\nRemove First: ");
//		System.out.print(doublyLinkedList.removeFirst().value);
//		System.out.print(doublyLinkedList.removeFirst().value);
//		System.out.print(doublyLinkedList.removeFirst().value);
//		System.out.print(doublyLinkedList.removeFirst().value);
//		System.out.print(doublyLinkedList.removeFirst().value);
//		System.out.print(doublyLinkedList.removeFirst());
		
//		System.out.print("\nGet node by index: ");
//		System.out.print(doublyLinkedList.get(3).value);
		
//		System.out.print("\nSet node by index: ");
//		System.out.print(doublyLinkedList.set(3,9));
		
//		System.out.print("\nInsert: ");
//		System.out.print(doublyLinkedList.insert(3,9));
//		System.out.print("\nRemove: ");
//		System.out.print(doublyLinkedList.remove(3).value);
//		System.out.print("\nPalindrome: ");
//		System.out.print(doublyLinkedList.isPalindrome());
		System.out.print("\nReverse: ");
		doublyLinkedList.reverse();
		
		System.out.println("\n=================================================\nUpdated: ");
		doublyLinkedList.getHead();
		doublyLinkedList.getTail();
		doublyLinkedList.getLength();
		System.out.print("\nUpdated Doubly Linked List: ");
		doublyLinkedList.printList();
		
	}

}
