package JAVAPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class thr1 {
	
	public static void add() throws FileNotFoundException {
		File file = new File("bdvcj");
		FileInputStream fio = new FileInputStream(file);
	}
	public static void main(String[] args) throws FileNotFoundException {
		add();
	}

}
