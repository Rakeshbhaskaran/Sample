package com.ff.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends BaseTest{
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@alt='Tricentis Demo Web Shop']")
	private WebElement DemoWebShopLogo;
	
	@FindBy(className="ico-register")
	private WebElement RegisterLink;
	
	@FindBy(className="ico-login")
	private WebElement LoginLink;

	public WebElement getDemoWebShopLogo() {
		return DemoWebShopLogo;
	}

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public WebElement getLoginLink() {
		return LoginLink;
	}
	
	
	
	
	
}
