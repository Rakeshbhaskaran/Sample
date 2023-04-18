package javaAssement;

public class prime2 {
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=3;i<=10;i++) {
			boolean flag=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
