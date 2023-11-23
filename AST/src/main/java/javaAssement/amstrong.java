package javaAssement;

public class amstrong {
	public static void main(String[] args) {
		int n=153;
		int nTemp=n;
		int nCheck=n;
		int digit=0;
		
		while(n>0) {
			n=n/10;
			digit++;
		}
		int sum=0;
		System.out.println(digit);
		while(nTemp>0) {
			int d=nTemp%10;
			nTemp=nTemp/10;
			sum=(int) (sum+Math.pow(d, digit));
		}
		if(sum==nCheck) {
			System.out.println("Amstrong number");
		}
		else {
			System.out.println("Not armstrong number");
		}
		
	}
	
	
}
