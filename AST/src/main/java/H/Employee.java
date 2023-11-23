package H;

import java.util.HashSet;
import java.util.Iterator;

import JAVAPractice.thow1;

public class Employee {
	int id;
	String name;
	int sal;
	public Employee(int id,String name,int sal) {
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
	public String toString() {
		return "Employee(id:"+this.id+" name:"+this.name+" sal:"+this.sal+")";
	}
	public boolean equals(Object o) {
		Employee e =(Employee) o;
		return this.id==e.id;
	}
	@Override
	public int hashCode() {
		return this.id+this.name.hashCode();
	}
	
	public static void main(String[] args) {
		HashSet<Employee> s = new HashSet<>();
		s.add(new Employee(1, "Apple", 40));
		s.add(new Employee(2,"ball", 40));
		s.add(new Employee(1, "Apple", 60));
		s.add(new Employee(2, "balls", 60));
		System.out.println(s);
		System.out.println("------------------------------------");
		Iterator<Employee> i=s.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		System.out.println("------------------------------------");
		System.out.println(s.size());
	}
	

}
