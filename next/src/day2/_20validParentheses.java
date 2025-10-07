package day2;

import java.util.Stack;

public class _20validParentheses {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {
				if (stack.empty())
					return false;
				char head = stack.peek();
				if ((c == ')' && head == '(') 
					|| (c == ']' && head == '[')
					|| (c == '}' && head == '{')) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.empty() ? true : false;
	}

	public static void main(String[] args) {
		String s = "[";
		System.out.print(isValid(s));

	}
}
