package est2;

import java.util.ArrayList;
import java.util.Collections;

public class Employee {
	int id;
	String name;
	int sal;
	String company;
	
	Employee(int id,String name, int sal,String company){
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.company=company;
	}
	
	public String toString() {
		return "Employee("+this.name+" "+this.id+")";
	}
	
	
	public static  void addEmployee(){
		ArrayList<Employee> l = new ArrayList<>();
		l.add(new Employee(2, "ram",200 , "TYSS"));
		l.add(new Employee(1, "sham",200 , "TYSS"));
		l.add(new Employee(2, "bam",200 , "TYSS"));
		l.add(new Employee(2, "sita",200 , "TYSS"));
		
		System.out.println(l);
		
		Collections.sort(l, new SortByName());
		System.out.println(l);
	}
	public static void main(String[] args) {
		addEmployee();
	}

}
