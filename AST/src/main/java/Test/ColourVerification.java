package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import java.awt.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ColourVerification {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://allensolly.abfrl.in/");
		String RGBcolor=driver.findElement(By.xpath("//a[text()='SALE']")).getCssValue("Color");
		System.out.println(RGBcolor);
		String Hexcolor=Color.fromString(RGBcolor).asHex();
		System.out.println(Hexcolor);
		Boolean var1=null;
		if(Hexcolor.equalsIgnoreCase("#ff0000")) {
			var1=true;
			
		}
		else {
			var1=false;
		}
		System.out.println(var1);
		driver.quit();
	}
	

}
