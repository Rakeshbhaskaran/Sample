package selenium;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CSVFilter {
    public static void main(String[] args) {
    	 List<CSVRecord> fetchedData = new ArrayList();
    try {
			String filepath="C:\\Users\\User\\Downloads\\Stock_By_Warehouse.csv";
			Reader reader = new FileReader(filepath);
			CSVParser parser = new CSVParser(reader, CSVFormat.EXCEL);
			LocalDate currentMonthStart = LocalDate.now().withDayOfMonth(1);
	        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        boolean firstRowSkipped = false;
	         fetchedData = new ArrayList();
	         int n=1;
			for (CSVRecord record : parser) {
				if (!firstRowSkipped) {
                    firstRowSkipped = true;
                    continue; // Skip the first row
                }
                String warehouse = record.get(6);
                String expiryDate= record.get(11).trim();
                String expiryStatus= record.get(15);
                if(expiryDate.isEmpty()) {
                	expiryDate="2000-01-01";
                }
                System.out.println(n++);
                System.out.println(expiryDate);
                LocalDate date = LocalDate.parse(expiryDate, dateFormatter);
                // Apply filtering logic
                if (warehouse.equals("Saleable") && expiryStatus.equals("Fresh")&& date.isAfter(currentMonthStart)) {
                	fetchedData.add(record); 
                }
            }
			String skucode="";
			firstRowSkipped = false;
			int max=0;
			for(CSVRecord record:fetchedData) {
				if (!firstRowSkipped) {
                    firstRowSkipped = true;
                    continue; // Skip the first row
                }
				int currentVal=Integer.parseInt(record.get(5));
				if(currentVal>max) {
					skucode=record.get(1);
				 max=currentVal;
				System.out.println(skucode+" "+max);
				}
			}
			System.out.println("Maximum avialibe product is "+skucode+" , its quantity is "+max);
			parser.close();
			reader.close();
		
			
	} catch (Exception e) {
		System.out.println(e);
	}
    
    try {
    	String excelFile="C:\\Rakesh\\FireFlink\\Other Projects\\Parekh\\Data\\Dummy.xlsx";
    	Workbook workbook=new XSSFWorkbook();
    	FileOutputStream fos= new FileOutputStream(excelFile);
    	Sheet sheet = workbook.createSheet("Filtered Data");
        int rowNum = 0;

        for (CSVRecord record :fetchedData  ) {
            Row row = sheet.createRow(rowNum++);

            // Write each column value to the corresponding cell in the row
            for (int i = 0; i < record.size(); i++) {
                Cell cell = row.createCell(i);
                cell.setCellValue(record.get(i));
            }
        }

        workbook.write(fos);
        System.out.println("Filtered data has been written to the Excel file.");
        workbook.close();
        
    	
		
	} catch (Exception e) {
		// TODO: handle exception
	}
        

    }
}
