package P27102023;

import java.util.Iterator;
import java.util.ListIterator;

public class Stack {
	public static void main(String[] args) {
		java.util.Stack<Integer> a = new java.util.Stack<>();
		a.push(20);
		a.push(34);
		a.push(67);
		a.push(24);
		ListIterator<Integer> i =a.listIterator(a.size());
		while(i.hasPrevious()) {
		System.out.println(i.previous());
		}
		System.out.println("done");
		
		ListIterator<Integer> j= a.listIterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}
		
		Iterator<Integer> k = a.iterator();
		while(k.hasNext()) {
			System.out.println(k.next());
		}
		
	}

}
