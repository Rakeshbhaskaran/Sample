package JavaFinalAssement2810;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ReportDuplicatesInSentance {
	public static void main(String[] args) {
		String s ="Our name is java Our name is java Gone Goa";
		
		String[] s1=s.split(" ");
		Map<String, Integer> hm = new HashMap<>();
		for(int i=0;i<s1.length ;i++) {
			if (hm.containsKey(s1[i])) {
				hm.put(s1[i], hm.get(s1[i])+1);
			}
			else {
				hm.put(s1[i], 1);
			}
		}	
		//print 
		for(Entry<String, Integer> e:hm.entrySet()) {
			System.out.println(e);
		}
	}

}
