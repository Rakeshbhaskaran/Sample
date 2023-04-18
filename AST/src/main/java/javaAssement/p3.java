package javaAssement;
//Write a program to reverse the elements of an array.
public class p3 {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,6,7,8};
		int b[]= new int[a.length];
		int key=a.length-1;
		for(int i=0;i<b.length;i++) {
			b[i]=a[key];
			key--;
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
	}

}
