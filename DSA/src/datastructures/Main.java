package datastructures;

public class Main {

	public static void main(String[] args) {
		
		
		LinkedList linkedList = new LinkedList(1);
		linkedList.append(2);
		linkedList.append(3);
		linkedList.append(4);
		linkedList.append(5);
//		linkedList.append(8);
		System.out.print("\n================ Initials =======================\n");
		System.out.println("Head: "+linkedList.getHead().value);
		System.out.println("Tail: "+linkedList.getTail().value);
		System.out.println("Length: "+linkedList.getLength());
		Node temp=linkedList.getHead();
		System.out.print("Original Linked List ");
		while(temp!=null) {
			System.out.print(temp.value+" ");
			temp=temp.next;
		}

		System.out.print("\n================ Operation =======================");
//		System.out.print("\nremoved " + linkedList.removeLast().value);
//		System.out.print("\nPrepended " + linkedList.prependNode(3).value);
//		System.out.print("\nRemoved First: " + linkedList.removeFirst().value);
//		System.out.print("\nGet Node: " + linkedList.getNode(3).value);
//		System.out.print("\nSet Node: " + linkedList.setNode(3,8));
//		System.out.print("\nInsert : " + linkedList.insert(1,8));
//		System.out.print("\nRemove from index : " + linkedList.removeItem(3));
//		System.out.print("\nReverse : ");linkedList.reverse();
//		System.out.print("\nMiddle Node : "+linkedList.findMiddleNode().value);
		System.out.print("\nHas loop : "+linkedList.hasLoop());
		
		
		System.out.println("\n=================================================\nUpdated Head: "+linkedList.getHead().value);
		System.out.println("Updated Tail: "+linkedList.getTail().value);
		System.out.println("Updated Length: "+linkedList.getLength());
		System.out.print("\nUpdated Linked List: ");
		Node temp1=linkedList.getHead();
		while(temp1!=null) {
			System.out.print(temp1.value+" ");
			temp1=temp1.next;
		}
	}

}
