package day7;

public class MyLinkedListQueue implements IStackQueue{
	private Node head;
	private Node tail;
	@Override
	public boolean push(int value) {
		// TODO Auto-generated method stub
		Node newNode = new Node(value);
		if(head == null) {
			head = tail = newNode;
		}else {
			tail.next = newNode;
			tail = tail.next;//tail phải gán = tail.next
							// chứ không phải là tail = newNode;
							// vì nếu gán vậy thì chưa dịch chuyển được đỉa chỉ tail
		}
		return true;
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) return -1;
		int value = head.value;
		if(head == tail) {
			head = tail = null;
		}
		head = head.next;
		return value;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return tail == null;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.print("Queue is empty");
			return;
		}
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.value + " ");
			curr = curr.next;
		}
		
		
	}

}
