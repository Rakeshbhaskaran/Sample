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

public class CSVAddStock {
    public static void main(String[] args) {
    	List<String> StockData = new ArrayList();

		try {
			String CSVFilepath ="C:\\\\Users\\\\User\\\\Downloads\\\\Stock_By_Warehouse.csv";
			String ExcelFilepath ="C:\\\\Rakesh\\\\FireFlink\\\\Other Projects\\\\Parekh\\\\Data\\\\Dummy.xlsx";
			Reader reader = new FileReader(CSVFilepath);
			CSVParser parser = new CSVParser(reader, CSVFormat.EXCEL);
			LocalDate currentMonthStart = LocalDate.now().withDayOfMonth(1);
			DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			boolean firstRowSkipped = false;
			List<CSVRecord> fetchedData = new ArrayList();
			for (CSVRecord record : parser) {
				if (!firstRowSkipped) {
					firstRowSkipped = true;
					continue; // Skip the first row
				}
				String warehouse = record.get(6);
				String expiryDate = record.get(11).trim();
				String expiryStatus = record.get(15);
				if (expiryDate.isEmpty()) {
					expiryDate = "2000-01-01";
				}
				LocalDate date = LocalDate.parse(expiryDate, dateFormatter);
				// Apply filtering logic
				if (warehouse.equals("Saleable") && expiryStatus.equals("Fresh") && date.isAfter(currentMonthStart)) {
					fetchedData.add(record);
				}
			}
			int min = 100000;
			String skucode="";
			String lot="";
			String availableQty="";
			for (CSVRecord record : fetchedData) {
				int currentVal = Integer.parseInt(record.get(5));
				if (currentVal < min) {
					min = currentVal;
					skucode=record.get(1);
					lot=record.get(10);
					availableQty=record.get(5);
					
				}
			}
			StockData.add(skucode);
			StockData.add(lot);
			StockData.add(availableQty);
			System.out.println(StockData);
			String excelFile = ExcelFilepath;
			Workbook workbook = new XSSFWorkbook();
			FileOutputStream fos = new FileOutputStream(excelFile);
			Sheet sheet = workbook.createSheet("Filtered Data");
			int rowNum = 0;

			for (CSVRecord record : fetchedData) {
				Row row = sheet.createRow(rowNum++);

				// Write each column value to the corresponding cell in the row
				for (int i = 0; i < record.size(); i++) {
					Cell cell = row.createCell(i);
					cell.setCellValue(record.get(i));
				}
			}
			workbook.write(fos);
			workbook.close();
			parser.close();
			reader.close();
			System.out.println("Filtered data has been written to the Excel file.");
			
		} catch (Exception e) {
			System.err.println(e);
		}
        

    }
}

