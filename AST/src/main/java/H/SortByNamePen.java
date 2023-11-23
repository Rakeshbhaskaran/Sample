package H;

import java.util.Comparator;

public class SortByNamePen implements Comparator<LinkedList1>{
	
	@Override
	public int compare(LinkedList1 o1, LinkedList1 o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
