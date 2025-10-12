package day6;

import java.util.Stack;

class Node {
	public int value;
	public Node next;
	public Node(int value) {
		this.value = value;
	}
}
public class MinStack {
	private Stack<Integer> minStack = new Stack();
    public Node head;
    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if(minStack.isEmpty() || minStack.peek() >= val) { // chỗ này phải lấy dấu = nhá 
        												// vì nếu nó push nhiều giá trị = nhau
		        										// nhưng trong minStack chỉ có 1 giá trị
        												// khi nó pop thì minStack cũng pop là dở luôn
        	minStack.push(val);
        }
    }
    
    public void pop() {
        if(head == null) return;
        else {
        	int top = head.value;
        	head = head.next;
        	if(top == minStack.peek()) {
        		minStack.pop();
        	}
        }
        
    }
    
    public int top() {
        return head.value;
    }
    
    public int getMin() {
    	return minStack.peek();
    }
    public void show() {
    	Node curr = head;
    	while(curr != null) {
    		System.out.println(curr.value);
    		curr = curr.next;
    	}
    }
    public static void main(String args[]) {
    	MinStack stack = new MinStack();
    	stack.push(10);
    	stack.push(10);
    	stack.pop();
    	System.out.print(stack.getMin());
    }
}
