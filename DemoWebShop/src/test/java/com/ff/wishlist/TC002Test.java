package com.ff.wishlist;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ff.base.BaseTest;
import com.ff.listnerUtility.ITestListenerImplementations;

@Listeners(ITestListenerImplementations.class)
public class TC002Test extends BaseTest{
	
	@Test
	public void sample() {
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='header-links']//a[@class='account']")).getText(), "rakm@.com");
		
	}
	

}
