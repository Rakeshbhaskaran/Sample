package Test2;

import java.util.ArrayList;
import java.util.Collections;

public class Employee {
	int id;
	String name;
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return "(Employee("+this.id+"/"+this.name+"))";
	}
	static void addEmployee() {
		ArrayList<Employee> l = new ArrayList<>();
		l.add(new Employee(2, "Ram"));
		l.add(new Employee(34, "Gita"));
		l.add(new Employee(4, "Sushman"));
		System.out.println(l);
		Collections.sort(l, new SortByName());
		System.out.println(l);
		
	}
	public static void main(String[] args) {
		addEmployee();
	}

}
