package Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetNumberOfLinks {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		driver.quit();
		
	}

}
