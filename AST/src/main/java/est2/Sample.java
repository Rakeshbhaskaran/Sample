package est2;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Sample {
	
	public static void main(String[] args) {
		LinkedHashSet<Integer > l = new LinkedHashSet<>();
		l.add(120);
		l.add(40);
		l.add(63);
		l.add(75);
		
		Iterator<Integer> i = l.iterator();
		int k=0;
		while(i.hasNext()) {
			if(k==3) {
			System.out.println(i.next());
			k++;
			}
			else {
				i.next();
				k++;
			}
		}
	}

}
