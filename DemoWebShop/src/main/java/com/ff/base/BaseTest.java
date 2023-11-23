package com.ff.base;

import java.lang.reflect.Method;

import java.sql.Driver;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.ff.elementRepository.HomePage;
import com.ff.elementRepository.LoginPage;
import com.ff.genericUtility.FrameworkConstants;
import com.ff.genericUtility.InitializeObjects;

public class BaseTest extends InitializeObjects implements FrameworkConstants {
	public  static WebDriver driver;
	public  ExtentReports report;
	public  static ExtentTest test;
	public  InitializeObjects initClass;
	public  WebDriverWait wait;
	public  HomePage homePage;
	
	@BeforeSuite
	public void SetUpReport() {
		initClass = new InitializeObjects();
		String time = initClass.getJavaUtilityObject().getSystemLocalDateTime();
		ExtentSparkReporter spark = new ExtentSparkReporter(extentReportPath+time+".html");
//		spark.config().setDocumentTitle("Login");
		report = new ExtentReports();
		report.attachReporter(spark);
		
	}
	
	@BeforeClass 
	public  void BrowserSetUp() {
		test=report.createTest("Demo");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
		wait= new WebDriverWait(driver, Duration.ofSeconds(explicitWait));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		initClass.getLoginPage(driver).getDemoWebShopLogo().isDisplayed();
		test.log(Status.PASS, "Navigated to DemoWebShop");
	}
	
	@BeforeMethod
	public void login() {
		homePage= initClass.getLoginPage(driver).Login("rakm@test.com", "6362606708");
	}
	
	@AfterMethod
	public void logout() {
		homePage.getLogoutLink().click();
	}
	
	@AfterClass
	public void BrowserTearDown() {
		driver.quit();
	}
	
	@AfterSuite
	public void FlushReport() {
		report.flush();
	}

}
