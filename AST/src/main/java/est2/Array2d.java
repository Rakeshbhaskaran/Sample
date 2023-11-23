package est2;

import java.util.Scanner;

public class Array2d {
	public static void main(String[] args) {
		int a[][] = new int[2][3];
		
		Scanner sc = new Scanner(System.in);
		
		//storing values
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		//priting values
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		// find max and min 
		int max=a[1][1];
		int min =a[1][1];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]>=max) {
					max=a[i][j];
				}
				if(a[i][j]<=min) {
					min=a[i][j];
				}
			}
		}
		
		System.out.println("max :"+max);
		System.out.println("min :"+min);
	}

}
