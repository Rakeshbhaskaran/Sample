package P27102023;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps1 {
	public static void main(String[] args) {
		Map<Integer, String> a = new HashMap<>();
		a.put(1, "black");
		a.put(2, "orange");
		a.put(3, "brown");
		a.put(4, "grey");
		
		for(Entry<Integer, String> e: a.entrySet()) {
			System.out.println(e);
		}
	}

}
