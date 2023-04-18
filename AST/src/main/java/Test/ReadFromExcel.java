package Test;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadFromExcel {
	public static void main(String[] args) {
	
		try {
			
			File file = new File("C:\\Rakesh\\FireFlink\\KT\\Knowledge\\DummyTest.xlsx");
			FileInputStream fis= new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			Sheet sheet =workbook.getSheet("Sheet2");
			String value= sheet.getRow(1).getCell(2).toString();
			System.out.println(value);
			
			int r=sheet.getPhysicalNumberOfRows()-1;
			int c=sheet.getRow(0).getPhysicalNumberOfCells();
			Object[][] obj = new Object[r][c];
			for(int i=1;i<=r;i++) {
				for(int j=0;j<c;j++) {
					obj[i-1][j]=sheet.getRow(i).getCell(j);
				}
			}
			
			//print
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					System.out.print(obj[i][j]+"   ");
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

