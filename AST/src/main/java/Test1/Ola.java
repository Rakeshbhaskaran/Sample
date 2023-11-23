package Test1;

import java.util.Scanner;

public class Ola {
	String name;
	String AcType;
	
	public Ola(String name,String Ac) {
		this.name=name;
		this.AcType=Ac;
	}
	public String toString(){
		return "Name:"+this.name+" AC:"+this.AcType;
	}
	public static void main(String[] args) {
		Ola honda = new Ola("honda", "AC");
		Ola maruthi = new Ola("maruthi", "NonAC");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter required car");
		String name =sc.next();
		
		switch (name) {
		case "honda":
			System.out.println(honda);
			break;
		case "maruthi":
			System.out.println(maruthi);
			break;
		default:
			System.out.println("Car not present");
			break;
		}
	}

}
