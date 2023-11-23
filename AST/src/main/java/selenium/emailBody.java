package selenium;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import JAVAPractice.thow1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class emailBody {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		 ChromeOptions options = new ChromeOptions();
         options.addArguments("--remote-allow-origins=*");
         options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
		String url="https://accounts.google.com/signin";
		driver.get(url);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("prabhavathi.a@testyantra.com");
		driver.findElement(By.xpath("//span[text()=\"Next\"]/..")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type='password']")));
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("Prabha#123");
		driver.findElement(By.xpath("//span[text()=\"Next\"]/..")).click();
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		Set<String> e= driver.getWindowHandles();
		String parentWindow=driver.getWindowHandle();
		for(String f:e) {
			if(!f.equals(parentWindow)) {
				driver.switchTo().window(f);
			}
		}
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
		String xpath="//span[@class='bog']//span[@class='bqe' and contains(text(),'4770\\29\\06853')]";
		int n=1;
		while (ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))!=null && n<=2) {
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			driver.findElement(By.xpath("//div[@class='asf T-I-J3 J-J5-Ji']/../..")).click();
			n++;
		}
		
		driver.findElement(By.xpath("(//span[@class='bog']//span[@class='bqe'])[3]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='a3s aiL '])[1]")));
		String output= driver.findElement(By.xpath("(//div[@class='a3s aiL '])[1]")).getText();
		System.out.println(output);
		
//		LocalTime currentTime= LocalTime.now();
//		System.out.println(currentTime);
//		driver.close();
	}

}

