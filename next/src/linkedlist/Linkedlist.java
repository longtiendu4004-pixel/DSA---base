package linkedlist;

public class Linkedlist {
	Node head;
	public Linkedlist() {
		
	}
	public void printLinkedList() {
		if(head == null) {
			System.out.print("List is empty");
		}else {
			Node temp =  head;
			while(temp != null) {
				System.out.print(temp.data);
				temp = temp.next;
				if(temp != null) {
					System.out.print(" --> ");
				}
			}
		}
		
	}
	public boolean search(int data) {
		Node curr = head;
		while(curr != null) {
			if(curr.data == data)return true;
			curr = curr.next;
		}
		return false;
	}
	public void addToHead(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	public void addToTail(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
	}
	public void addAtPosition(int index, int data) {
		if(index == 0) {
			this.addToHead(data);
			return;
		}
		Node newNode = new Node(data);
		Node curr = head;
		for(int i = 0; i < index - 1 && curr != null; i++) {
			curr = curr.next;
		}
		if(curr == null) {
			return;
		}
		newNode.next = curr.next;
		curr.next = newNode;
	}
	public void deleteAtPosition(int index) {
		if(head == null || index < 0) {
			return;
		}
		if(index == 0) {
			head = head.next;
			return;
		}
		Node curr = head;
		for(int i = 0; i < index - 1 && curr != null; i++) {
			curr = curr.next;
		}
		if(curr == null || curr.next == null) {
			return;
		}
		curr.next = curr.next.next;
		
	}
}
