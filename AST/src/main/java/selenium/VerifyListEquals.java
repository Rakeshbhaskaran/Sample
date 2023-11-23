package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class VerifyListEquals {
	public static void main(String[] args) {
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.setBrowserVersion("dev");
		 WebDriver driver = new FirefoxDriver(fo);
		 driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		
	}

}
