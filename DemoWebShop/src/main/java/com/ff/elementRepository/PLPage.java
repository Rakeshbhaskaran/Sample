package com.ff.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ff.base.BasePage;

public class PLPage extends BasePage{

	public PLPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

}
