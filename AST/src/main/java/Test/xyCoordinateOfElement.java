package Test;

import org.openqa.selenium.By;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;
import io.github.bonigarcia.wdm.WebDriverManager;

public class xyCoordinateOfElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Point location=driver.findElement(By.xpath("(//a[contains(text(),'Computer')])[1]")).getLocation();
		System.out.println(location);
		Actions action = new Actions(driver);
		action.moveByOffset(328,190).build().perform();
	
		
		
		
		
	}

}
