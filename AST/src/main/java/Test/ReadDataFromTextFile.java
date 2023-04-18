package Test;

import java.io.File;


import java.util.Scanner;

public class ReadDataFromTextFile {
	public static void main(String[] args) {
		System.out.println("rakesh");
		try {
			File file = new File("C:\\Rakesh\\FireFlink\\KT\\Knowledge\\Browser stack.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (Exception e) {
			System.out.println("File not found: " + e.getMessage());
		}
	}

}
