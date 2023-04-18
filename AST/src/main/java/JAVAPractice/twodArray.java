package JAVAPractice;

import java.util.Scanner;

public class twodArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] a=new int[2][2];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Enter values ");
				a[i][j]=sc.nextInt();
			}
		}
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				sum=sum+a[i][j];
			}
		}
		System.out.println("sum of array values "+sum);
	}

}
