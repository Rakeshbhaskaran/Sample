package patterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class p1 {
	public static void main(String[] args) {
		int n=3;
		for(int t=1;t<=n;t++) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=(4-i);j++) {
				System.out.print("  ");
			}
			for(int p=1;p<=(2*i-1);p++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=4;j++) {
				if(j<3) {
					System.out.print("  ");
				}
				else {
					System.out.print(" "+'*');
				}
			}
			
			System.out.println();
			
			
		}
		
		
	}

}
