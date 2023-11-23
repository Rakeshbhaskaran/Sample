package com.ff.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ff.base.BasePage;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(className="ico-logout")
	private WebElement logoutLink;
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}
}
