package JAVAPractice;

import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Stack<Integer> a = new Stack<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		System.out.println(a.peek());
		System.out.println(a);
	}

}
