package JavaFinalAssement2810;

import java.util.Scanner;

public class Fibonocci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		int n = sc.nextInt();
		int a =0;
		int b=1;
		
		System.out.print(1+" ");
		for(int i=0;i<=n;i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}

}
