package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class elementIsDisplayed {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		boolean pageTop=driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).isDisplayed();
		System.out.println(pageTop);
		
		WebElement footrer= driver.findElement(By.className("footer-poweredby"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", footrer);
		boolean pagebottom=driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).isDisplayed();
		System.out.println(pagebottom);
		
	}

}
