package com.ff.listnerUtility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.ff.base.BaseTest;

public class ITestListenerImplementations extends BaseTest implements ITestListener{

	

	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64),"Captured ss");
		test.log(Status.FAIL,result.getName()+" failed");
		
	}

	

	

}
