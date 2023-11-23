package Test2;

import java.util.TreeSet;

public class Laptop{
	int id;
	String name;
	String brand;
	public Laptop(int id,String name,String brand) {
		this.id=id;
		this.name=name;
		this.brand=brand;
		
	}
	public String toString() {
		return this.name;
	}
	
	public static void  addLaptop() {
		TreeSet<Laptop> ts = new TreeSet<>(new SortLaptopById());
		ts.add(new Laptop(2, "rakesh", "Hp"));
		ts.add(new Laptop(1, "punith", "dell"));
		ts.add(new Laptop(4, "shrinath", "lenovo"));
		for(Laptop e:ts) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		
		addLaptop();
	}
	

}
