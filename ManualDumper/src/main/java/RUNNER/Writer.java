package RUNNER;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HELPER.helper1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Writer {
	static WebDriver driver;
	static int r=1;
	static int n=1;
	
	@BeforeClass
	public static void opener() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:\\Rakesh\\FireFlink\\chromeDebug1\\ff");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		String url="https://app.fireflink.com/testdevelopment/Script/Root%20Module/Home_Web/HM006_Verify%20Social%20Media%20Handles%20Of%20Aakash%20Are%20Displayed/Manual%20Test%20Case?manualScriptId=SCR1036&moduleId=MOD1002&scriptId=SCR1006";
		
		driver.get(url);
		Thread.sleep(3000);
		WebElement edit=driver.findElement(By.xpath("//label[text()='Manual Test Case']/..//button"));
		edit.click();
		
	}
	
	@DataProvider(name = "data")
	public Object[][] data() throws EncryptedDocumentException, IOException {
		
		Object[][] data=helper1.readExcel("C:\\Rakesh\\FireFlink\\PAPOC\\Aakash\\MTC.xlsx", "HM006");
		return data;
	}
	
	@Test(dataProvider = "data")
	public void filler(String slno,String testData,String steps) throws InterruptedException {
		int s=r+1;
		int t=r+2;
		int u=r+3;
		String cell1="(//td[@class='testStepTable fontPoppinsRegularSm text-left pl-2 table-cell-text focus:border-opacity-0 focus:outline-none'])"+"["+r+"]";
		String cell2="(//td[@class='testStepTable fontPoppinsRegularSm text-left pl-2 table-cell-text focus:border-opacity-0 focus:outline-none'])"+"["+s+"]";
		String cell3="(//td[@class='testStepTable fontPoppinsRegularSm text-left pl-2 table-cell-text focus:border-opacity-0 focus:outline-none'])"+"["+t+"]";
		String cell4="(//td[@class='testStepTable fontPoppinsRegularSm text-left pl-2 table-cell-text focus:border-opacity-0 focus:outline-none'])"+"["+u+"]";
		String moreXpath="(//*[local-name()='svg' and @data-testid='MoreVertIcon'])["+n+"]";
		WebElement more= driver.findElement(By.xpath(moreXpath));
		more.click();
		WebElement irb=driver.findElement(By.xpath("//span[text()='Insert row below']"));
		irb.click();
		
		driver.findElement(By.xpath(cell1)).sendKeys(n+"");
		driver.findElement(By.xpath(cell2)).sendKeys(testData);
		driver.findElement(By.xpath(cell3)).sendKeys(steps);
		driver.findElement(By.xpath(cell4)).sendKeys("User should be able to "+steps);
		
		r=r+4;
		n=n+1;
	}

}
