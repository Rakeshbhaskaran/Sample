package selenium;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class FilteringRowPickAValue {
	public static void main(String[] args) {
		try {
			String csvFilePath="C:\\Users\\User\\Downloads\\Cardinal_-_Order_Detail_Register (1).csv";
			String docuNo="4770\\29\\06930";
			String Actualfreshness="";
			int freshness=0;
			Reader reader = new FileReader(csvFilePath);
			CSVParser parser= new CSVParser(reader, CSVFormat.EXCEL);
			List<List<String>> data = new ArrayList<List<String>>();
			boolean skipFirstRow=false;
			for(CSVRecord e:parser) {
				if(!skipFirstRow) {
					skipFirstRow=true;
				}
				data.add(e.toList());
			}
			for(List<String> e: data) {
				String docNo=e.get(1);
				if(docNo.equals(docuNo)) {
					Actualfreshness= e.get(28);
					Actualfreshness=Actualfreshness.replaceAll("[^0-9]","");
				}
			}
			Integer output=Integer.parseInt(Actualfreshness);
			if(output==freshness) {
				System.out.println("Equal");
			}
			else {
				throw new RuntimeException("Not equal");
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
