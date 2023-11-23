package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class savein {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("user-data-dir=C:\\Users\\User\\Desktop\\SaveIn");
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.navigate().to("https://qa.bnpl.savein.money/merchant-home");
		driver.navigate().to("https://qa.bnpl.savein.money/dashboard");
		driver.findElement(By.xpath("//h6[contains(text(),\"Start a new \")]")).click();
		
		
//		driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number\"]")).sendKeys("9632940989");
//		driver.findElement(By.xpath("//button[text()='Next']")).click();
//		driver.findElement(By.xpath("//input[@name=\"customer-name\"]")).sendKeys("fireflink");
//		driver.findElement(By.xpath("//p-dropdown[@name=\"customer-type\"]")).click();
//		driver.findElement(By.xpath("//li[@aria-label=\"New\"]")).click();
//		driver.findElement(By.xpath("//p-dropdown[@name=\"procedure\"]")).click();
//		driver.findElement(By.xpath("//li[@aria-label=\"Frame\"]")).click();
//		driver.findElement(By.xpath("//input[@name=\"amount\"]")).sendKeys("5000");
//		driver.findElement(By.xpath("//button[contains(text(),'Send to applicant​')]")).click();
//		driver.findElement(By.xpath("//button[text()=\"Okay\"]")).click();
		
		
		
		
	}

}
