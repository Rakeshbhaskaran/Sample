package parekh;


import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.checkerframework.checker.units.qual.min;

public class orderPunchingChat {
	
	public static void main(String[] args) throws IOException {
		String dataFilePath="C:\\Rakesh\\FireFlink\\Other Projects\\Parekh\\Data\\Generic\\PurchaseOrder\\POData.xlsx";
		String elementFilePath="C:\\Rakesh\\FireFlink\\Other Projects\\Parekh\\Data\\Generic\\PurchaseOrder\\POElements.xlsx";
		
		FileInputStream fisE = new FileInputStream(elementFilePath);	//reading element file
		Workbook workbookE = new XSSFWorkbook(fisE);
		Sheet sheetE = workbookE.getSheetAt(0);
		Row elementRow = sheetE.getRow(1);
		
		FileInputStream fisD = new FileInputStream(dataFilePath);		//reading data file
		Workbook workbookD = new XSSFWorkbook(fisD);
		Sheet sheetD = workbookD.getSheetAt(0);
		
		int colNo=sheetD.getRow(0).getPhysicalNumberOfCells();
		int rowNo=sheetD.getPhysicalNumberOfRows();
		int orderNOcolNo=0;
		for(int i=1;i<colNo;i++) {
			if(sheetD.getRow(0).getCell(i).toString().equalsIgnoreCase("orderNo")) {
				 orderNOcolNo=i;
			}
		}
		System.out.println(rowNo+" "+colNo);
		System.out.println(orderNOcolNo);
		List<List<Map<String, String>>> list = new ArrayList();
        List<Map<String, String>> subList = new ArrayList();
        Map<String, String> miniMap= new LinkedHashMap();
        boolean firstRow=true;
        for(int i =1;i<rowNo;i++) {
        	Row row =sheetD.getRow(i);
        	for(int j=1;j<colNo;j++) {
        		Cell cell = row.getCell(j);
        		if(cell.toString().isBlank()) {
        			continue;
        		}
        		else if(cell.getColumnIndex()==orderNOcolNo) {
        			subList.add(miniMap);
        			miniMap=new LinkedHashMap();
        		}
        		else if (cell.getColumnIndex()==1 && !cell.toString().isBlank()) {
					if(firstRow) {
						miniMap.put(elementRow.getCell(j).toString(),cell.toString());
						firstRow=false;
					}
					else if(!miniMap.isEmpty()) {
						subList.add(miniMap);
						miniMap=new LinkedHashMap();
						miniMap.put(elementRow.getCell(j).toString(),cell.toString());
					}
					list.add(subList);
					subList = new ArrayList();
				}
        		else if(i==(rowNo-1)&& j==(colNo-1)) {
        			miniMap.put(elementRow.getCell(j).toString(),cell.toString());
        			subList.add(miniMap);
        			list.add(subList);
        		}
        		else {
        			miniMap.put(elementRow.getCell(j).toString(),cell.toString());
        		}
        	}
        	
        }
        
        for(List<Map<String, String>> a:list) {
        	for(Map<String, String> b:a) {
        		System.out.print(b+" ");
        	}
        	System.out.println();
        }
		
		
		
	}

	
}
