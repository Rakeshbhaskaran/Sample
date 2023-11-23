package com.ff.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.ff.base.BasePage;

public class LoginPage extends BasePage {

	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	private WebElement EmailTextfeild;
	
	@FindBy(id="Password")
	private WebElement PasswordTextfeild;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement LoginButton;
	
	@FindBy(xpath="//div[@class='page-title']/h1")
	private WebElement WelcomePleaseSignIn ;
	
	

	public WebElement getWelcomePleaseSignIn() {
		return WelcomePleaseSignIn;
	}

	public WebElement getEmailTextfeild() {
		return EmailTextfeild;
	}

	public WebElement getPasswordTextfeild() {
		return PasswordTextfeild;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	public HomePage Login(String email, String password) {
		getLoginLink().click();
		getWelcomePleaseSignIn().isDisplayed();
		EmailTextfeild.sendKeys(email);
		PasswordTextfeild.sendKeys(password);
		LoginButton.click();
		test.log(Status.PASS, "Logged in");
		return new HomePage(driver);
	}

	
	
	
	
	
}
