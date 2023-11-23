package com.ff.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import com.aventstack.extentreports.Status;
import com.ff.base.BaseTest;

public class ActionsUtility extends BaseTest{
	 Actions action;
	 
	 public ActionsUtility(WebDriver driver) {
		 action = new Actions(driver);
	 }
	
	public void moveToElement(WebElement element) {
		
		try {
			action.moveToElement(element).perform();
			test.log(Status.PASS, "Moved to element ");
		} catch (Exception e) {
			test.log(Status.FAIL, "Failed to move to element"+e);
			Assert.fail();
		}
	}
	
	public void RightClickElement( WebElement element) {
		action.contextClick(element).perform();
		test.log(Status.PASS, "Right cliked on the element ");
	}
	
	public void ClickOnElement( WebElement element) {
		action.click(element).perform();
		test.log(Status.PASS, "Moved to element ");
	}

	
	

}