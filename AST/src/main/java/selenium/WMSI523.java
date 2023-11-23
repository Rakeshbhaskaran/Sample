package selenium;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class WMSI523 {
	public static void main(String[] args) throws IOException {
		String filepath="C:\\Users\\User\\Downloads\\Picking_Register.csv";
	Reader reader = new FileReader(filepath);
	CSVParser parser = new CSVParser(reader, CSVFormat.EXCEL);
	List<CSVRecord> rows= parser.getRecords();
	System.out.println(rows.size());
	
		
		
	}

}
