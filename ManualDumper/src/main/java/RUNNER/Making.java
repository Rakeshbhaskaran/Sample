package RUNNER;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Making {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Rakesh\\FireFlink\\PAPOC\\Aakash\\MTC.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		System.out.println(book.getSheet("AC020").getPhysicalNumberOfRows());
		System.out.println(book.getSheet("AC020").getRow(0).getPhysicalNumberOfCells());
	}

}
