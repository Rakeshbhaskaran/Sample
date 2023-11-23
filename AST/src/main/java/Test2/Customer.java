package Test2;

import java.util.Map;
import java.util.TreeMap;

public class Customer implements Comparable<Customer>{
	int id;
	String name;
	
	public Customer(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) {
		TreeMap<Customer, String> tm = new TreeMap<>();
		tm.put(new Customer(3, "Z"), "Z");
		tm.put(new Customer(2, "V"), "V");
		tm.put(new Customer(5, "D"), "D");
		
		for(Map.Entry<Customer, String> e: tm.entrySet()) {
			System.out.println(e.getValue());
		}
	}

	@Override
	public int compareTo(Customer o) {
		return this.name.compareTo(o.name);
	}
	

}
