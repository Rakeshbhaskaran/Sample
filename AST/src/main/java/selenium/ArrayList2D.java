package selenium;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class ArrayList2D {
	public static void main(String[] args) {
		try {
			List<List<String>> arrayList2d= new ArrayList<List<String>>();
			String CSVFilepath ="C:\\Users\\User\\Downloads\\Applicable_Status_Report.csv";
			String ExcelFilepath ="";
			Reader reader = new FileReader(CSVFilepath);
			CSVParser parser = new CSVParser(reader, CSVFormat.EXCEL);
			for(CSVRecord record:parser) {
				arrayList2d.add(record.toList());
			}
			System.out.println(arrayList2d.get(1).get(1));
			
		} catch (Exception e) {
		System.out.println(e);
		}
	}

}
