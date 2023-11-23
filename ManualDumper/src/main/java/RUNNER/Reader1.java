package RUNNER;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Row;
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

public class Reader1 {
	
	public static String verifyIf(String s) {
		System.out.println(s+"\\\\");
		s=s.substring(0, s.lastIndexOf(" "));
		System.out.println(s+"\\\\");
		s=s.replace("is", "should be displayed");
		System.out.println(s+"\\\\");
		s=s.replace("Verify if text of ", "");
		return s;
	}
	
	@Test
	public static void write() throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:\\\\Rakesh\\\\FireFlink\\\\chromeDebug1\\\\ff");
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		String url="https://app.fireflink.com/testdevelopment/Script/Achieve_MOD1006/AC003_Verify%20that%20the%20countdown%20has%20not%20begun%20when%20the%20user%20has%20not%20started%20the%20assessment_SCR1017/Steps?scriptId=SCR1017&moduleId=MOD1006&manualScriptId=SCR1071";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@id='step-break']")));
		Thread.sleep(6000);
		List<WebElement>steps= driver.findElements(By.xpath("//span[@id='step-break']"));
		WebElement testCase= driver.findElement(By.xpath("//label[contains(@class,'project_label flex-auto')]"));
		String testCaseid=testCase.getText().substring(0, 5);
		List<WebElement>prePost= driver.findElements(By.xpath("//div[@class='precondition-container']//span[2]"));
		if(prePost.size()>0) {
			steps.addAll(prePost);
		}
		XSSFWorkbook book = new XSSFWorkbook();
		Sheet sheet=book.createSheet(testCaseid);
		Row titleRow= sheet.createRow(0);
		titleRow.createCell(0).setCellValue("Sl no");
		titleRow.createCell(1).setCellValue("Test steps");
		titleRow.createCell(2).setCellValue("Input");
		titleRow.createCell(3).setCellValue("Excpected");
		System.out.println(steps.size());
		int rc=1;
		Row row=null;
		for(int i=0;i<steps.size();i++) {
			String value=steps.get(i).getAttribute("textContent");
			if(value.startsWith("Get data") || value.startsWith("Get the value") || value.startsWith("Write data") || value.startsWith("Wait") || value.startsWith("Scroll")) {
				continue;
			}
			else {
				if(value.startsWith("Verify if")) {
					String value1=verifyIf(value.trim());
					row.createCell(3).setCellValue(value1);
					System.out.println(value1);
				}
				else {
					System.out.println(value);
					row=sheet.createRow(rc++);
					row.createCell(0).setCellValue(rc);
					row.createCell(1).setCellValue(value);
				}
			}
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
