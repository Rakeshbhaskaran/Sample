package JAVAPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listinterator {
	public static void main(String[] args) {
		List a = new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);

		ListIterator l= a.listIterator();
		ListIterator d= a.listIterator(2);
		while(d.hasPrevious()) {
			System.out.println(d.previous());
		}
		
	}

}
