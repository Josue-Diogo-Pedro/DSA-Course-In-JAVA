package SinglyLinkedListPackage;

public class SinglyLinkedList {
	private ListNode head;
	
	private static class ListNode{
		private int data; // Generic Type
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	// my implementation ----------------------------------
	public void printSLL() {
		System.out.println();
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}
	
	public void printSLL(ListNode headNode) {
		if(headNode == null) return;
		
		System.out.println();
		
		ListNode current = headNode;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}
	
	// my implementation with Dinesh -----------------------------
	public int sllLength() {
		int length = 0;
		
		if(head == null) return length;
		
		ListNode current = head;
		while(current != null) {
			length++;
			current = current.next;
		}
		
		return length;
	}
	
	public int sllLength(ListNode headNode) {
		int length = 0;
		
		if(headNode == null) return length;
		
		ListNode current = headNode;
		while(current != null) {
			length++;
			current = current.next;
		}
		
		return length;
	}
	
	
	// my implementation and Dinesh
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	// my implementation
	public void insertEnd(int value) {
		ListNode newNode = new ListNode(value);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		ListNode current = head;
		while(current.next != null)
			current = current.next;
		
		current.next = newNode;
	}
	
	//my implementation
	public void insertGivenPosition(int value, int position) {
		ListNode newNode = new ListNode(value);
		if(position == 1) {
			newNode.next = head;
			head = newNode;
			return;
		}
		
		int count = 1;
		ListNode previous = head;
		while(count < position - 1) {
			previous = previous.next;
			count++;
		}
		
		ListNode current = previous.next;
		newNode.next = current;
		previous.next = newNode;
		
	}
	
	//Dinesh implementation
	public ListNode deleteFirst() {
		
		if(head == null) {
			return null;
		}
		
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		
		return temp;
	}
	
	//Dinesh implementation
	public ListNode deleteLast() {
		if(head == null || head.next == null) {
			return null;
		}
		
		ListNode current = head;
		ListNode previous = null;
		
		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		
		previous.next = null;
		return current;
	}
	
	//Dinesh implementation
	public void delete(int position) {
		if(position == 1) {
			head = head.next;
		} else {
			ListNode previous = head;
			int count = 1;
			while(count < position - 1) {
				previous = previous.next;
				count++;
			}
			
			ListNode current = previous.next;
			previous.next = current.next;
		}
	}
	
	
	//Dinesh implementation
	public boolean searchElement(int searchKey) {
		ListNode current = head;
		while(current.next != null) {
			if(current.data == searchKey) {
				return true;
			}
			current = current.next;
		}
		
		return false;
	}
	
	public ListNode reverseSLL() {
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	//Dinesh implementation
	public ListNode findMiddleSLL() {
		if(head == null) return null;
		
		ListNode slowPart = head;
		ListNode fastPart = head;
		
		while(fastPart != null && fastPart.next != null) {
			slowPart = slowPart.next;
			fastPart = fastPart.next.next;
		}
		return slowPart;
	}
	
	//Dinesh implementation
	public ListNode findNfNodeFromTheEnd(int n) {
		if(head == null) 
			return null;
		
		if(n <= 0) {
			throw new IllegalArgumentException("Invalid value: n = " + n);
		} 
		
		ListNode mainPrt = head;
		ListNode refPrt = head;
		int count = 0;
		
		while(count < n) {
			refPrt = refPrt.next;
			count++;
		}
		
		while(refPrt != null) {
			refPrt = refPrt.next;
			mainPrt = mainPrt.next;
		}
		
		return mainPrt;
	}
	
	//Dinesh Implementation
	public void removeDuplicatesFromSorted() {
		if(head == null) return;
		
		ListNode current = head;
		while(current != null && current.next != null) {
			if(current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
	}
	
	//Dinesh implementation
	public ListNode insertNodeSortedSLL(int value) {
		if(head == null) return null;
		
		ListNode newNode = new ListNode(value);
		ListNode current = head;
		ListNode temp = null;
		while(current != null && current.data < newNode.data) {
			temp = current;
			current = current.next;
		}
		
		newNode.next = current;
		temp.next = newNode;
		return head;
	}
	
	//Dinesh Implementation
	public void removeGivenKeySortedSLL(int key) {
		if(head == null) return;
		
		ListNode current = head;
		ListNode temp = null;
		while(current != null && current.data != key) {
			temp = current;
			current = current.next;
		}
		if(current == null) return;
		temp.next = current.next;
	}
	
	//Dinesh implementation
	public boolean detectLoopInSLL() {
		
		if(head == null) return false;
		
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if(slowPtr == fastPtr) {
				return true;
			} 
		}
		
		return false;
	}
	
	public void createLoopInSLL() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		ListNode sixth = new ListNode(6);
	
		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = third;
	}
	
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		//sll.head = new ListNode(10);
		//ListNode second = new ListNode(1);
		//ListNode third = new ListNode(8);
		//ListNode fourth = new ListNode(11);
		
		//Now we will connect them together to form a chain
		//sll.head.next = second; // 10 --> 1
		//second.next = third; // 10 --> 1 --> 8
		//third.next = fourth; // 10 --> 1 --> 8 --> 11 --> null
		
		//sll.insertFirst(2);
		//sll.insertFirst(4);
		//sll.insertEnd(6);
		//sll.insertEnd(8);
		//sll.insertEnd(10);
		
		//sll.insertGivenPosition(1, 1);
		//sll.insertGivenPosition(1, 2);
		//sll.insertGivenPosition(4, 3);
		//sll.insertGivenPosition(7, 4);
		//3 --> 4 --> 9 --> 8 --> NULL
		
		//sll.deleteFirst();
		//sll.deleteLast();
		
		//sll.delete(1);
		
		//ListNode newHead = sll.reverseSLL();
		
		sll.createLoopInSLL();
		
		//sll.printSLL();
		
		//sll.removeDuplicatesFromSorted();
		
		//ListNode newHead = sll.insertNodeSortedSLL(5);
		
		//sll.printSLL(newHead);
		
		//sll.removeGivenKeySortedSLL(4);
		//sll.printSLL();
		//int nth = 1, element = sll.findNfNodeFromTheEnd(nth).data;
		System.out.println("");
		//System.out.println("The length of sll is " + sll.sllLength() + "\n");
		//System.out.println("Middle: " + sll.findMiddleSLL().data);
		//System.out.println("Ntf element for("+nth+") : " + element);
		//System.out.println("Result for search " + sll.searchElement(4));
		System.out.println("Is loop SLL: " + sll.detectLoopInSLL());
	}
}
