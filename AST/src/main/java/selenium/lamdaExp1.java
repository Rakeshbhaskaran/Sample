package selenium;

import java.util.ArrayList;

public class lamdaExp1 {
	public static void main(String[] args) {
		  ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(5);
		    numbers.add(9);
		    numbers.add(8);
		    numbers.add(1);
//		    numbers.forEach( (n) -> { System.out.println(n); } );
		    
		    for(int i=1;i<=5;i++) {
		    	for(int j=1;j<=5;j++) {
		    		
		    		System.out.print("*"+" ");
		    		
		    	}
		    	System.out.println();
		    }
	}

}
