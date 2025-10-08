package day2;

public class MyArrayStack implements IStackQueue{
	
	private int[] array;
	private int SIZE;
	private int topIndex = -1;
	
	public MyArrayStack(int size) {
		this.SIZE = size;
		array = new int[size];
	}
	@Override
	public boolean push(int value) {
		// TODO Auto-generated method stub
		if(this.isFull() == false) {
			this.topIndex++;
			array[topIndex] = value;
			return true;
		}
		return false;
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(this.isEmpty() == false) {
			int value = array[topIndex];
			topIndex--;
			return value;
		}
		return -1;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return this.topIndex == this.SIZE - 1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.topIndex < 0;
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		if(this.isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		for(int i = 0; i <= topIndex; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
	}
	
}
