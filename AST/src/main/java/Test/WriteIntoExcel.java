package Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

public class WriteIntoExcel{

   public static void main(String[] args) throws Exception {
	   Object obj[][] = new Object[2][2];
       obj[0][0]="age";
       obj[0][1]="rage";
       obj[1][0]="crage";
       obj[1][1]="scrage";
       
       writeIntoExcel(obj);
       
   }
	   
     public static void writeIntoExcel(Object[][] data) throws IOException {
    	  Workbook workbook = new XSSFWorkbook(); // Create a new Workbook object

          // Create a new Sheet in the Workbook
          Sheet sheet = workbook.createSheet("Sheet1");

       Object[][] obj=data;
         String string="";
         for(int i=0;i<obj.length;i++) {
        	 Row row=sheet.createRow(i);
        	 for(int j=0;j<obj[i].length;j++) {
        		 string= (String) obj[i][j];
        		 System.out.println(string);
        		row.createCell(j).setCellValue(string);
        	 }
         }
         
          // Write the data to the Excel file
          File file = new File("C:\\\\Rakesh\\\\FireFlink\\\\KT\\\\Knowledge\\DummyTest2.xlsx");
          FileOutputStream fileOut = new FileOutputStream(file);
          workbook.write(fileOut);
          fileOut.close();
          System.out.println("done");

          // Close the Workbook object
          workbook.close();
    	 
     }
    
   
}

