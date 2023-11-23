package Test2;

import java.util.Comparator;

public class SortLaptopById implements Comparator<Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
		
		return o1.id-o2.id;
	}

}
