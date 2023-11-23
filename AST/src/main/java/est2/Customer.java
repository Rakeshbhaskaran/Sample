package est2;

import java.util.TreeMap;

public class Customer {
	int id;
	String name;
	
	public Customer(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return this.name;
	}
	
	public static void main(String[] args) {
		TreeMap<Customer, String> tm = new TreeMap<>(new SortByNameC());
		tm.put(new Customer(3, "ram"), "ram");
		tm.put(new Customer(2, "siva"), "siva");
		tm.put(new Customer(7, "ganesh"), "ganesh");
		tm.put(new Customer(10, "apple"), "apple");
		
		for(Customer e:tm.keySet()) {
			System.out.println(tm.get(e));
		}
		
	}
}
