package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popUp {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://www.newssummedup.com/");
		

		driver.findElement(By.xpath("//div[@id='mn-subscribe-popup']//div[text()='Close']")).click();
	}

}
