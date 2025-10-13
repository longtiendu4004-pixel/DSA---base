package day7;

public class MyArrayQueue implements IStackQueue{
	private int[] array;
	private int SIZE;
	private int head, tail;
	public MyArrayQueue(int size) {
		this.SIZE = size;
		array = new int[SIZE];
		head = tail = -1;
	}
	@Override
	public boolean push(int value) {
		// TODO Auto-generated method stub
		if(!isFull()) {
			if(isEmpty()) {
				head++;
			}
			tail++;
			array[tail] = value;
			return true;
		}
		return false;
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(!isEmpty()) {
			int value = array[head];
			head++;
			if(head > tail) {//chỗ này hay tư duy là cuối mảng thì mới reset
							// nhưng thực chất nếu đang giữa mảng head > tail rồi thì sao
							// tóm lại thằng tail nó chỉ tăng khi push và max tail = size - 1
							// nên head > tail đúng cho mọi trường hợp nhé!
				head = tail = -1;
			}// kiểm tra cuối vì head++ xong có thể lớn hơn tail
			return value;
			
		}
		return -1;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return tail == SIZE - 1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return head == -1 && tail == -1;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.print("Queue is empty");
			return;
		}
		for(int i = head; i <= tail; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
}
