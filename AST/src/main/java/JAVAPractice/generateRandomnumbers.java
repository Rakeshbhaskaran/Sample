package JAVAPractice;

import java.util.Random;
import java.util.Scanner;

public class generateRandomnumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter didgit of number req");
		int digi=sc.nextInt();
		System.out.println("Enter how many numbers required");
		int n=sc.nextInt();
		
		int min= (int) Math.pow(10, digi-1);
		int max=(int) (Math.pow(10, digi)-1);
		Random random = new Random();
		for(int i=1;i<=n;i++) {
			System.out.println(random.nextInt(max-min+1)+min);
		}
		
	}

}
