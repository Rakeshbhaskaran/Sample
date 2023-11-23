package RUNNER;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HELPER.helper1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Writer3 {
	static WebDriver driver;
	static int r=1;
	static int n=1;
	
	@BeforeClass
	public static void opener() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:\\Rakesh\\FireFlink\\chromeDebug1\\ff");
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		String url="https://app.fireflink.com/testdevelopment/Script/Achieve_MOD1006/Dummy_SCR1114/Manual%20Test%20Case?manualScriptId=SCR1114&moduleId=MOD1006&scriptId=SCR1112";
		
		driver.get(url);
		Thread.sleep(3000);
		WebElement edit=driver.findElement(By.xpath("//label[text()='Manual Test Case']/..//button"));
		edit.click();
		
	}
	
	@DataProvider(name = "data")
	public Object[][] data() throws EncryptedDocumentException, IOException {
		
		Object[][] data=helper1.readExcel("C:\\Rakesh\\FireFlink\\PAPOC\\Aakash\\MTC.xlsx", "AC003");
		return data;
	}
	
	@Test(dataProvider = "data")
	public void filler(String slno,String steps,String input,String expected) throws InterruptedException {
		int s=r+1;
		int t=r+2;
		int u=r+3;
		int v=r+4;
		int w=r+5;
		int x=r+6;
		String cell1="(//td[@class='testStepTable fontPoppinsRegularSm text-left pl-2 table-cell-text focus:border-opacity-0 focus:outline-none'])"+"["+r+"]";
		String cell2="(//td[@class='testStepTable fontPoppinsRegularSm text-left pl-2 table-cell-text focus:border-opacity-0 focus:outline-none'])"+"["+s+"]";
		String cell3="(//td[@class='testStepTable fontPoppinsRegularSm text-left pl-2 table-cell-text focus:border-opacity-0 focus:outline-none'])"+"["+t+"]";
		String cell4="(//td[@class='testStepTable fontPoppinsRegularSm text-left pl-2 table-cell-text focus:border-opacity-0 focus:outline-none'])"+"["+u+"]";
		String cell5="(//td[@class='testStepTable fontPoppinsRegularSm text-left pl-2 table-cell-text focus:border-opacity-0 focus:outline-none'])"+"["+v+"]";
		String cell6="(//td[@class='testStepTable fontPoppinsRegularSm text-left pl-2 table-cell-text focus:border-opacity-0 focus:outline-none'])"+"["+w+"]";
		String cell7="(//td[@class='testStepTable fontPoppinsRegularSm text-left pl-2 table-cell-text focus:border-opacity-0 focus:outline-none'])"+"["+x+"]";
		String moreXpath="(//*[local-name()='svg' and @data-testid='MoreVertIcon'])["+n+"]";
		WebElement more= driver.findElement(By.xpath(moreXpath));
		more.click();
		WebElement irb=driver.findElement(By.xpath("//span[text()='Insert row below']"));
		irb.click();
		
		driver.findElement(By.xpath(cell1)).sendKeys(slno.replace(".0", ""));
		driver.findElement(By.xpath(cell5)).sendKeys(steps);
		driver.findElement(By.xpath(cell6)).sendKeys(input);
		driver.findElement(By.xpath(cell7)).sendKeys(expected);
		
		r=r+7;
		n=n+1;
	}

}
