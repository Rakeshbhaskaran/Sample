package testing;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CmdDebugging {
	public static void main(String[] args) throws IOException, InterruptedException {
		String cacheFilePath="C:\\Users\\User\\Desktop\\SaveIn";
		String cmdCommand="chrome.exe -remote-debugging-port=9292 --no-first-run --no-default-browser-check --user-data-dir="+cacheFilePath;
		String chromeExe="C:\\Program Files\\Google\\Chrome\\Application";
		System.out.println(cmdCommand);
		String chromeExePath="C:\\Program Files\\Google\\Chrome\\Application";
		Runtime.getRuntime().exec("cmd /c start cmd.exe /K "+cmdCommand, null, new File(chromeExe));
		
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "localhost:9222");
		options.addArguments("--remote-orgins-allow=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://qa.bnpl.savein.money/");
		driver.findElement(By.xpath("//div[@class='loginMerchant screen1']//button[text()='Login']")).click();
		driver.findElement(By.xpath("//p[text()='Please enter your registered mobile number']/..//input[@id='first']")).sendKeys("7905950866");
		driver.findElement(By.xpath("//div[@class='ui-chkbox ui-widget']")).click();
////		Thread.sleep(3000);
////		WebElement next=driver.findElement(By.xpath("//button[@class='active-button m-b-5 ng-star-inserted']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
////		js.executeScript("arguments[0].click();", next);
		js.executeScript("document.querySelector('button').click();");
		driver.findElement(By.xpath("//input[contains(@id,'_0')]")).sendKeys("1");
		driver.findElement(By.xpath("//input[contains(@id,'_1')]")).sendKeys("2");
		driver.findElement(By.xpath("//input[contains(@id,'_2')]")).sendKeys("3");
		driver.findElement(By.xpath("//input[contains(@id,'_3')]")).sendKeys("4");
		Thread.sleep(10000);
//		js.executeScript("document.querySelector('div#ui-tabpanel-2').querySelector('button').click();");
		driver.findElement(By.xpath("//button[text()='Verify & Proceed']")).click();
		System.out.println("Element clicked 2");
	}

}
