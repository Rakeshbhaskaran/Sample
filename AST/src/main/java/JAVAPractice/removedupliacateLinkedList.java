package JAVAPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class removedupliacateLinkedList {
	public static void main(String[] args) {
		List a= new LinkedList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println(a);
		
		HashSet b = new LinkedHashSet(a);
		b.add(5);
		
		System.out.println(b);
		
		
		
	}

}
