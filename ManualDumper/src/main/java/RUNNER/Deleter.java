package RUNNER;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deleter {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:\\\\Rakesh\\\\FireFlink\\\\chromeDebug1\\\\ff");
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		String URL="https://app.fireflink.com/testdevelopment/Script/Home/TC001-%20Verify%20User%20is%20Able%20To%20Navigate%20To%20%20Account%20Screen/Manual%20Test%20Case?manualScriptId=SCR1205&moduleId=MOD1089&scriptId=SCR1156";
		driver.get(URL);
		Thread.sleep(3000);
		WebElement edit=driver.findElement(By.xpath("//label[text()='Manual Test Case']/..//button"));
		edit.click();
		
		
		for(int i=11;i<=11;i++) {
			String moreXpath="(//*[local-name()='svg' and @data-testid='MoreVertIcon'])["+i+"]";
			WebElement more= driver.findElement(By.xpath(moreXpath));
			more.click();
			WebElement irb=driver.findElement(By.xpath("//span[text()='delete row']"));
			irb.click();
		}
		
	}

}
