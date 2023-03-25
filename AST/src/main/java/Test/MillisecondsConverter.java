package Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;


public class MillisecondsConverter {
   public static void main(String[] args) {
      long Milliseconds = 92345456789l;
      long result=0;
      String ConvertTo ="hours";
      if(ConvertTo.equalsIgnoreCase("Hours")) {
			 result=TimeUnit.HOURS.convert(Milliseconds, TimeUnit.MILLISECONDS);
			
		}
		else if(ConvertTo.equalsIgnoreCase("Minutes")) {
			 result=TimeUnit.MINUTES.convert(Milliseconds, TimeUnit.MILLISECONDS);
			
		}
		else if(ConvertTo.equalsIgnoreCase("Seconds")) {
			result=TimeUnit.SECONDS.convert(Milliseconds, TimeUnit.MILLISECONDS);
			
		}
      System.out.println(result);
   }
}

