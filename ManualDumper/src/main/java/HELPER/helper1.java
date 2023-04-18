package HELPER;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class helper1 {
	

	
	public static Object[][] readExcel(String filePath,String sheetName) throws EncryptedDocumentException, IOException {
		
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet= book.getSheet(sheetName);
		
		int r=sheet.getPhysicalNumberOfRows()-1;
		int c=sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object data[][]=new Object[r][c];
		for(int i=1;i<=r;i++) {
			for(int j=0;j<c;j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).toString() ;
			}
		}
		
		return data;
		
	}
	


}
