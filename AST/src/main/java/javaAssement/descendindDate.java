package javaAssement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class descendindDate {
	public static void main(String[] args) {
		
		 boolean isDescending=false;
        
       	  
        	 List<String> dates= new ArrayList<String>();
        	 dates.add("2023-12-15");
        	 dates.add("2023-03-31");
        	 dates.add("2023-03-28");
        	 dates.add("2023-03-14");
        	 
       	  List<LocalDate> localDate= new ArrayList<LocalDate>();
       	 
       	  
       	  for (String e : dates) {
       		  String dateString = e;
       		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // specify the date format
       		  LocalDate date = LocalDate.parse(dateString, formatter);
       		  localDate.add(date);
       	       	}
       	  
       	  for (int i = 0; i < localDate.size()- 1; i++) {
                 if (localDate.get(i).isBefore(localDate.get(i+1))) {
                     isDescending=false;
                     break;
                 }
                 else {
                	 isDescending=true;
                 }
             }
       	  
		System.out.println(isDescending);
	}

}
