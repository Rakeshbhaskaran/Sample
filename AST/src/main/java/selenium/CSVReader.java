package selenium;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "C:\\Rakesh\\FireFlink\\Other Projects\\Parekh\\Data\\CN_Upload_New(1)(2).csv"; // Specify the path to your CSV file
        
        
        try {
        	BufferedReader br = new BufferedReader(new FileReader(csvFile));
                    String line;
                    while ((line = br.readLine()) != null) {
                        String[] data = line.split(",");
                        // Process the data here
                        // For example, you can access individual columns using data[index]
                        // where index is the column index (starting from 0)
//                        System.out.println("Column 1: " + data[0]);
//                        System.out.println("Column 2: " + data[1]);
                        for(int i=0;i<=26;i++) {
                        	System.out.print(data[i]+" ");
                        }
                        System.out.println();
			
		} }catch (IOException e) {
			e.printStackTrace();
		}

      
    }
}

