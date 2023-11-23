package selenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteFile {
	
	public static void main(String[] args) {
		
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://accounts.google.com/signin");
		
//		String filePath="C:\\Users\\User\\Downloads\\screenshot (2).jpg";
//		File fileToDelete= new File(filePath);
//		
//		fileToDelete.delete();
//		System.out.println("File is deleted");
		
		
		String doc="Document No:- 4770/23/04/284";
		 doc = doc.replaceAll("Document No:- ", "");
		 System.out.println(doc);
		
	}

}
