package selenium;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class csvFilterGeneric {
	
	public static void main(String[] args) throws IOException {
		
		Reader reader= new FileReader("C:\\Users\\User\\Downloads\\WMS_Workflow_Transaction_Report.csv");
		int RowNO=1;
		List<String> output= new ArrayList();
		  
		  CSVParser parser= new CSVParser(reader, CSVFormat.DEFAULT.withHeader());
		  int ToBincolNum=parser.getHeaderMap().get("To Bin");
		  int FromBincolNum=parser.getHeaderMap().get("From Bin");
		  int fromBinLevelcolNum=parser.getHeaderMap().get("From Bin Level");
		  int toBinLevelcolNum=parser.getHeaderMap().get("To Bin Level");
		  List<List<String>> data = new ArrayList<List<String>>();
			boolean firstRowSkipped = false;
			for(CSVRecord e:parser) {
				if(!firstRowSkipped) {
					firstRowSkipped=true;
					continue;
				}
				String toBin=e.get(ToBincolNum);
				String fromBin=e.get(FromBincolNum);
				if(!toBin.isBlank() && ! fromBin.isEmpty()) {
					data.add(e.toList());
				}	
			}
			reader.close();
			output.add(data.get(RowNO).get(FromBincolNum));
			output.add(data.get(RowNO).get(fromBinLevelcolNum));
			output.add(data.get(RowNO).get(ToBincolNum));
			output.add(data.get(RowNO).get(toBinLevelcolNum));
		
		reader.close();
		//to print
		for(List<String> e:data) {
			for(String f:e) {
				System.out.print(f+"  ");
			}
			System.out.println();
		}
		System.out.println(data.get(10).get(5));
		
		
	}

}
