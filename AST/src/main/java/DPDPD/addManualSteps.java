package DPDPD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class addManualSteps {
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:\\Rakesh\\FireFlink\\chromeDebug1\\ff");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		
		String url="https://app.fireflink.com/testdevelopment/Script/Root%20Module/Home/HM003_Verify%20User%20Is%20Able%20To%20Leave%20A%20Message/Manual%20Test%20Case?manualScriptId=SCR1027&moduleId=MOD1008&scriptId=SCR1018";
		
		driver.get(url);
		Thread.sleep(3000);
		WebElement edit=driver.findElement(By.xpath("//label[text()='Manual Test Case']/..//button"));
		edit.click();
		
		
		for(int i =1;i<=10;i++) {
			Thread.sleep(1000);
			WebElement more= driver.findElement(By.xpath("(//*[local-name()='svg' and @data-testid='MoreVertIcon'])[1]"));
			more.click();
			WebElement irb=driver.findElement(By.xpath("//span[text()='Insert row below']"));
			irb.click();
			
		}
		int r=1;
		int n=2;
		for(int i=1;i<=13;i++) {
			
			String xpath="(//td[@class='testStepTable fontPoppinsRegularSm text-left pl-2 table-cell-text focus:border-opacity-0 focus:outline-none'])"+"["+r+"]";
			String xpath1="(//td[@class='testStepTable fontPoppinsRegularSm text-left pl-2 table-cell-text focus:border-opacity-0 focus:outline-none'])"+"["+n+"]";
			WebElement cell=driver.findElement(By.xpath(xpath));
			WebElement cell1=driver.findElement(By.xpath(xpath1));
			cell.sendKeys(i+"");
			cell1.sendKeys("N/A");
			r=r+4;
			n=n+4;
		}
		
}
}