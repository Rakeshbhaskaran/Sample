package selenium;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
 
public class VerifyIfDateIsWithinRange {
	public static void main(String[] args) throws IOException {
		try {
			boolean dateWithinRange=false;
			DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			String StringfromDate="01-05-2023";
			LocalDate fromdate = LocalDate.parse(StringfromDate, formater);
			String StringToDate="20-05-2023";
			LocalDate Todate = LocalDate.parse(StringToDate, formater);
			String filePath="C:\\Users\\User\\Downloads\\Picking_Register (1).csv";
			Reader reader = new FileReader(filePath);
			CSVParser parser = new CSVParser(reader, CSVFormat.EXCEL);
			boolean skipFistRow=false;
			for(CSVRecord e :parser) {
				if(!skipFistRow) {
					skipFistRow=true;
					continue;
				}
				String stringdate= e.get(20);
				LocalDate date = LocalDate.parse(stringdate, formater);
				if (date.isEqual(fromdate)||date.isEqual(Todate)||(date.isAfter(fromdate)&&date.isBefore(Todate))) {
					dateWithinRange=true;
				}
				else {
					throw new RuntimeException(stringdate+ " not within range @ row number "+e.getRecordNumber());
				}
				
			}
			System.out.println(dateWithinRange);
		} catch (Exception e) {
			System.err.println(e);
		}
		
		
		
	}
	
	
	
}
