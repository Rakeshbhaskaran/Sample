package H;

import java.util.TreeSet;

public class TreeSetcCompany implements Comparable<TreeSetcCompany>{
	int id;
	String name;
	@Override
	public int compareTo(TreeSetcCompany o) {
		
		return this.id-o.id;
	}
	public TreeSetcCompany(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return "(Company:"+this.id+" / "+this.name+")";
	}
	public static void main(String[] args) {
		TreeSet t = new TreeSet<>();
		t.add(new TreeSetcCompany(1, "Apple"));
		t.add(new TreeSetcCompany(2, "Google"));
		t.add(new TreeSetcCompany(3, "Microsoft"));
		
		System.out.println(t);
	
		
		
	}
	

}
