package com.ff.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ff.base.BasePage;

public class PDPage extends BasePage{

	public PDPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

}
