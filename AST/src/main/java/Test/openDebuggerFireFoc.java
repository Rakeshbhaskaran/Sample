package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openDebuggerFireFoc {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options= new  FirefoxOptions();
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.close();
	}

}
