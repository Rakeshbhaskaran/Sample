package Test;

import java.util.ArrayList;
import java.util.List;

public class VerifyAscendingOrder {
    public static boolean isListInAscendingOrder(List<String> list) {
        String previous = "";
        for (String current : list) {
            if (previous.compareToIgnoreCase(current)>0) {
                return false;
            }
            previous = current;
        }
        return true;
    }
    public static void main(String[] args) {
		List<String > friuts= new ArrayList<String>();
		friuts.add("apple");
		friuts.add("ganana");
		friuts.add("cake");
		System.out.println(isListInAscendingOrder(friuts));
		
	}
}

