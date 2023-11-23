package com.ff.genericUtility;

import org.openqa.selenium.WebDriver;

import com.ff.elementRepository.LoginPage;
import com.ff.javaUtility.JavaUtility;

public class InitializeObjects {

	public ActionsUtility getActionsObject(WebDriver driver) {
		return new ActionsUtility(driver);
	}
	
	public JavaUtility getJavaUtilityObject() {
		return new JavaUtility();
	}
	
	public LoginPage getLoginPage(WebDriver driver) {
		return new LoginPage(driver);
	}
	

}
