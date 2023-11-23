package sample;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class Demo {
	
	@Test(groups = "smoke")
	public void demo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		String url= System.getProperty("url");
		driver.get("https://demowebshop.tricentis.com/login");
		 WebElement pass= driver.findElement(By.id("Password"));
		 driver.findElement(with(By.tagName("input")).above(pass)).sendKeys("go");
		 
	}

}
