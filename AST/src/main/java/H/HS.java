package H;

import java.util.HashMap;
import java.util.HashSet;

public class HS {
public static void main(String[] args) {
	HashMap<Integer, String> hm = new HashMap<>();
	hm.put(1, "Apple");
	hm.put(null, null);
	hm.put(null, null);
	hm.put(null, "car");
	
	System.out.println(hm);
}
}
