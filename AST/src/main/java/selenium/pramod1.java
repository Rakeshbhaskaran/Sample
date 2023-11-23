package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class pramod1 {
	public static void main(String[] args) throws IOException {
		String excelPath = "C:\\Users\\User\\Downloads\\Test.xlsx";
		String operator = "/";

		FileInputStream fis = new FileInputStream(excelPath);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		int n = sheet.getPhysicalNumberOfRows();
		System.out.println(n);
		List<Integer> values = new ArrayList();
		for (int i = 1; i < n; i++) {
			values.add((int) sheet.getRow(i).getCell(0).getNumericCellValue());
		}
		double output = 0.0;
//		switch (operator) {
//		case "+":
//			int result = 0;
//			for (Integer e : values) {
//				result += e;
//			}
//			output = result;
//			break;
//		case "-":
//			int result1 = values.get(0);
//			for (int i = 1; i < values.size(); i++) {
//				result1 -= values.get(i);
//			}
//			output = result1;
//			break;
//		case "*":
//			int result2 = 1;
//			for (Integer e : values) {
//				result2 *= e;
//			}
//			output = result2;
//			break;
//		case "/":
//			double result3 = values.get(0);
//			for (int i = 1; i < values.size(); i++) {
//				int cellValue = values.get(i);
//				if (cellValue != 0) {
//					result3 /= cellValue;
//				} else {
//					System.out.println("Error: Division by zero");
//				}
//			}
//			output = result3;
//			break;
//		default:
//			System.out.println("Invalid operator");
//			return;
//
//		}
//		System.out.println(output);

	}
}
