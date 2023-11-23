package JavaFinalAssement2810;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ValidateDateRange {
	public static void main(String[] args)  {
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String startdat="01/01/2021";
		String endtdat="31/12/2023";
		
		System.out.println("Enter date");
		Scanner sc = new Scanner(System.in);
		String dat=sc.next();
		Date startDate = null;
		Date endDate = null;
		Date date = null;
		try {
			startDate =format.parse(startdat);
			endDate =format.parse(endtdat);
			date =format.parse(dat);
		} catch (Exception e) {
			System.out.println("Invalid date format");
			System.out.println(e);
		}
		if(date.after(startDate)&&date.before(endDate)) {
			System.out.println("Date within range");
		}
		else {
			System.out.println("Date out of range");
		}
		
		
	}

}
