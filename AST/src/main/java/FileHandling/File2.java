package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class File2 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\User\\git\\repository\\AST\\src\\main\\java\\FileHandling\\writer.txt");
		fw.write("HI hello");
		fw.write("cat");
		fw.flush();
		System.out.println("Writen");
		fw.close();

	}
}
