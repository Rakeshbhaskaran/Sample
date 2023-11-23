package H;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList1 implements Comparable<LinkedList1> {
	int id;
	String  name;
	
	public LinkedList1(int id, String name)  {
		this.id=id;
		this.name= name;
	}
	@Override
	public String toString() {
		
		return "Pen("+this.id+" "+this.name+")";
	}
	@Override
	public int compareTo(LinkedList1 o) {
		// TODO Auto-generated method stub
		return o.id-this.id;
	}
	
	public static void main(String[] args) {
		LinkedList l = new LinkedList<>();
		l .add(new LinkedList1(1, "Red"));
		l.add(new LinkedList1(2, "Blue"));
		l.add(new LinkedList1(3, "Black"));
		l.add(new LinkedList1(4, "Green"));
		
		System.out.println(l);
		System.out.println("============================");
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		Collections.sort(l);
		System.out.println("============================");
		while(l.size()>0){
			System.out.println(l.poll());
		}
		 
		
		
	}
	

}
