package job;

public class Node{
	int value;
	Node left;
	Node right;
	public Node(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
		
	}
	public String toString(){
		return String.format("%d", value);
	}
	public static void main(String args[]) {
		Node node = new Node(5);
		
	}
}