package est2;

import java.util.TreeSet;

public class Laptop implements Comparable<Laptop>{
	int id;
	String brand;
	String name;
	
	public Laptop(int id,String name, String brand){
		this.id=id;
		this.brand=brand;
		this.name=name;
	}
	
	public int compareTo(Laptop o) {
		return this.id-o.id;
	}
	
	public String toString() {
		return "Laptop "+this.id+" "+this.name+" )";
	}
	
	public static void addLaptop() {
		TreeSet<Laptop> ts = new TreeSet<>();
		ts.add(new Laptop(4, "gaming", "hp"));
		ts.add(new Laptop(1, "office", "dell"));
		ts.add(new Laptop(3, "entertainmnet", "acer"));
		
		System.out.println(ts);
	}
	public static void main(String[] args) {
		addLaptop();
	}

}
