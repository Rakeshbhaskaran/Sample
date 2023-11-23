package parekh;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class msp {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("http://p2test.pispl.in:9090/mpower/#/login");
		System.out.println("Mpower opened successfully");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//login Mpower
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("adarsh.m");
		RelativeBy id = RelativeLocator.with(By.tagName("input")).below(By.tagName("input"));
		driver.findElement(id).sendKeys("pass");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pass");
//		driver.findElement(By.xpath("//ion-button[contains(@class,'submit-btn')]")).click();
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//ion-button[contains(@class,'submit-btn')]")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ion-select[@placeholder='Select Activity']")).click();
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
		Thread.sleep(10000);
	
		WebElement dle=driver.findElement(By.xpath("(//*[@class=\"sc-ion-select-popover-ios item-label item ios in-list ion-activatable ion-focusable hydrated\"])[24]"));
		js.executeScript("arguments[0].scrollIntoView(true);", dle);
		dle.click();
		RelativeBy dis = RelativeLocator.with(By.tagName("ion-select")).below(By.tagName("ion-button"));
		driver.findElement(dis).click();
	
		SearchContext shadowHost1= driver.findElement(By.xpath("//ion-select[@placeholder='Select Activity']")).getShadowRoot();
		Thread.sleep(3000);
		shadowHost1.findElement(By.cssSelector("ion-rb-84-lbl")).click();
		
		Actions action =new Actions(driver);
		List<WebElement> mpowerOrgList = driver.findElements(By.xpath("//ion-radio-group[@role='radiogroup']/descendant::ion-item"));
	
	}

}
