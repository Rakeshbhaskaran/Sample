package javaAssement;

import java.util.Scanner;

public class prime {
	public static boolean isPrime(int i) {
		boolean flag=true;
		if (i==1) {
			return false;
		}
		else if(i==2) {
			return true;
		}
		else {
			for(int n=2;n<i;n++) {
				if(i%n==0) {
					flag=false;
					break;
				}
			}
			return flag;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		int r=sc.nextInt();
		int sum=0;
		for(int i=1;i<=r;i++) {
			if(isPrime(i)) {
				sum=sum+i;
			}
		}
		System.out.println("Sum prime numbers within range "+r+" = "+sum);
		
	}

}
