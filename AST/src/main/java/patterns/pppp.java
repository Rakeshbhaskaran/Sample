package patterns;

import java.util.ArrayList;

public class pppp {
	public static void main(String[] args) {
	  System.out.println("DND");
	  for(int i=1;i<=5;i++) {
		  for(int j=1;j<=5;j++) {
			  if(i==1||j==5||j==1||i==5) {
				  System.out.print("*"+" ");
			  }
			  else {
				  System.out.print(" "+" ");
			  }
		  }
		  System.out.println();
	  }

	}

}
