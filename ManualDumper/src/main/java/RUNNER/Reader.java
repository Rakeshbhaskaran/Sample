package RUNNER;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reader {
	
	@Test
	public static void write() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:\\\\Rakesh\\\\FireFlink\\\\chromeDebug1\\\\ff");
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		String url="https://app.fireflink.com/testdevelopment/Script/Screens/SC002_Value%20Credit%20Note%20Debit%20Note/Steps?scriptId=SCR1005&moduleId=MOD1006";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@id='step-break']")));

		List<WebElement>steps= driver.findElements(By.xpath("//span[@id='step-break']"));
		WebElement testCase= driver.findElement(By.xpath("//label[@class='project_label flex-auto']"));
		String testCaseid=testCase.getText().substring(0, 5);
		List<WebElement>prePost= driver.findElements(By.xpath("//div[@class='precondition-container']//span[2]"));
		if(prePost.size()>0) {
			steps.addAll(prePost);
		}
		XSSFWorkbook book = new XSSFWorkbook();
		Sheet sheet=book.createSheet(testCaseid);
//		sheet.createRow(1).createCell(0).setCellValue("Sl no");
//		sheet.createRow(2).createCell(1).setCellValue("Test data");
		sheet.createRow(0).createCell(2).setCellValue("Test steps");
		System.out.println(steps.size());
		for(int i=0;i<steps.size();i++) {
			String value=steps.get(i).getAttribute("textContent");
			System.out.println(value);
			sheet.createRow(i+1).createCell(2).setCellValue(value);
		}
		
		String filePath="C:\\Rakesh\\FireFlink\\PAPOC\\Aakash\\MTC.xlsx";
		File file = new File(filePath);
		FileOutputStream fos = new FileOutputStream(file);
		book.write(fos);
		book.close();
		fos.close();
		driver.close();
		
	}

}
