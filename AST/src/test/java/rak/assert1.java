package rak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assert1 {
	
	@Test
	public void ast() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String actual=driver.findElement(By.className("ico-register")).getText();
		SoftAssert sft = new SoftAssert();
		sft.assertEquals(actual, "Reg");
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(2000);
		
		driver.close();
		sft.assertAll();
	}

}
