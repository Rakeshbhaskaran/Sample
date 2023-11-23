package JavaFinalAssement2810;

public class Pattern {
	public static void main(String[] args) {
		
		int n=4;
		
		int or=1;
		int er=3;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0) {
				or++;
				System.out.print(er--+" ");
				}
				else {
					System.out.print(or+++" ");
				}
			}
			System.out.println();
			er=or+i;
		}
		
	}

}
