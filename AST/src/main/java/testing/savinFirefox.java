package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class savinFirefox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa.bnpl.savein.money/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		boolean a=driver.findElement(By.xpath("//p[@class=\"backgroundPurple loginDiv otpText\"]/span[not(contains(@class,'f-14'))]")).getText().equals("Welcome to SaveIN");
		//.equals("Welcome to SaveIN​");
		System.out.println(a);
		driver.findElement(By.xpath("//div[@class='loginMerchant screen1']//button[text()='Login']")).click();
		driver.findElement(By.xpath("//p[text()='Please enter your registered mobile number']/..//input[@id='first']")).sendKeys("7905950866");
		driver.findElement(By.xpath("//div[@class='ui-chkbox ui-widget']")).click();
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		driver.findElement(By.xpath("//input[@autocomplete=\"one-time-code\"]")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Verify & Proceed']")).click();

		
		

	}

}
