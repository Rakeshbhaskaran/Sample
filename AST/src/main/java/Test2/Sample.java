package Test2;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Sample {
public static void main(String[] args) {
	LinkedHashSet<Integer> lhs= new LinkedHashSet<>();
	lhs.add(1);
	lhs.add(3);
	lhs.add(5);
	lhs.add(18);
	lhs.add(34);
	lhs.add(57);
	lhs.add(98);
	lhs.add(134);
	Iterator<Integer> i = lhs.iterator();
	int c=0;
	for(Integer e:lhs) {
		if(c==4) {
			System.out.println(e);
			c++;
		}
		else {
			c++;
		}
		
	}
}
}
