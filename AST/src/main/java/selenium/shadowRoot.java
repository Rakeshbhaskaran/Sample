package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class shadowRoot {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver= new ChromeDriver(options);
		driver.get("http://watir.com/examples/shadow_dom.html");
		WebElement shadowHost = driver.findElement(By.id("shadow_host"));
		
		SearchContext shadowRoot= shadowHost.getShadowRoot();
		
		String text1=shadowRoot.findElement(By.cssSelector("span[id='shadow_content']")).getText();
		System.out.println(text1);
		WebElement shadowHost1= shadowRoot.findElement(By.cssSelector("div[id='nested_shadow_host']"));
		SearchContext shadowRoot1= shadowHost1.getShadowRoot();
		String text2= shadowRoot1.findElement(By.cssSelector("div[id='nested_shadow_content']")).getText();
		System.out.println(text2);
		
		driver.close();
		
		
	}

}
