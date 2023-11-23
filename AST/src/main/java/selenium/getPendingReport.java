package selenium;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class getPendingReport {
	public static void main(String[] args) throws IOException {
		List<String> output= new ArrayList();
		String CSVFilePath = "C:\\Users\\User\\Downloads\\Pending_Return_Report.csv";
		  Reader reader= new FileReader(CSVFilePath);
		  CSVParser parser= new CSVParser(reader, CSVFormat.DEFAULT.withHeader());
		  int businessPartner=parser.getHeaderMap().get("Business Partner");
		  int invoiceNo=parser.getHeaderMap().get("Invoice No.");
		  int invoicedQTY=parser.getHeaderMap().get("Invoiced QTY");
		  int description=parser.getHeaderMap().get("Description");
		  int batch=parser.getHeaderMap().get("Batch");
		  List<List<String>> data = new ArrayList<List<String>>();
			for(CSVRecord e:parser) {
			data.add(e.toList());	
			}
			reader.close();
			int lastRow=data.size()-1;
			output.add(data.get(lastRow).get(businessPartner));
			output.add(data.get(lastRow).get(invoiceNo));
			output.add(data.get(lastRow).get(invoicedQTY));
			output.add(data.get(lastRow).get(description));
			output.add(data.get(lastRow).get(batch));
			
			for(String e:output) {
				System.out.println(e);
			}
	}

}
