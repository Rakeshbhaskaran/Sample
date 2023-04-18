package rak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openDebuggerChrome {
	@Test
	public void rak() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:\\Rakesh\\FireFlink\\chromeDebug");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
	}

}
