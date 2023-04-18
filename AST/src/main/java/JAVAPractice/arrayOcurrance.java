package JAVAPractice;

import java.util.Arrays;

public class arrayOcurrance {
	public static void main(String[] args) {
		int []s= {2,2,3,1,4,5,2,2,0,5,6,5,2};
		Arrays.sort(s);
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println();
		int count=1;
		for(int i=0;i<s.length-1;i++) {
			
			if(s[i]==s[i+1]) {
				count++;
			}
			else {
				System.out.println(s[i]+" occurance "+count);
				count=1;
			}
		}
		
	}

}
