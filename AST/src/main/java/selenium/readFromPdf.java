package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class readFromPdf {
	public static void main(String[] args) {
		String filePath="C:/Rakesh/R1/PDF.pdf";
		try {
			PDDocument document= PDDocument.load(new File(filePath));
			PDFTextStripper stripper = new PDFTextStripper();
			String text= stripper.getText(document);
			System.out.println(text);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
	}

}
