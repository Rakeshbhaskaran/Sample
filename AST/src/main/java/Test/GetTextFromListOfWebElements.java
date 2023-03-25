package Test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextFromListOfWebElements {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement>elements=driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		List<String>text=new ArrayList<String>();
		for(WebElement e:elements) {
			text.add(e.getText());	
		}
		System.out.println(text);
		driver.close();
	}

}
