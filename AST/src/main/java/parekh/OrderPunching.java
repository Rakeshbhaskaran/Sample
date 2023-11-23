package parekh;

import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Return;

public class OrderPunching {
	static WebDriver driver;
	static int rowNO;
	static int headerRowNo;
	static Actions action;
	public static void main(String[] args) throws IOException, InterruptedException {
		String dataFilePath="C:\\Rakesh\\FireFlink\\Other Projects\\Parekh\\Data\\Generic\\Sales Order\\SOD2.xlsx";
		String elementFilePath="C:\\Rakesh\\FireFlink\\Other Projects\\Parekh\\Data\\Generic\\Sales Order\\SOE2.xlsx";
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		action = new Actions(driver);
		driver.get("https://p2test.pispl.in/openbravo/security/Login");
		login("pavithra.k", "pass", "COP Sales Order"); // login
		List<List<Map<String, String>>> list = fetchData(dataFilePath, elementFilePath); // fetch data from excel
		System.out.println(list.size());

		// filling data
		for(List<Map<String, String>> a:list) {
			int firstMap=0;
			for(Map<String, String> b:a) {
				if(firstMap==0) {
					for(Entry<String, String> c:b.entrySet()) {
						System.out.println(c.getKey()+" "+c.getValue());
						filler(c.getKey(),c.getValue());
					}
					driver.findElement(By.xpath("//td[contains(@class,'OBToolbarIconButton_icon_save OBToolbarIconButton')]")).click();
					
					WebElement createOne = driver.findElement(By.xpath("//span[text()='Create One']"));
					scrollTill(driver, createOne);
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create One']")));
					driver.findElement(By.xpath("//span[text()='Create One']")).click();
					Thread.sleep(2000);
					firstMap++;
				}
				else {
					for(Entry<String, String> c:b.entrySet()) {
						System.out.println(c.getKey()+" "+c.getValue());
						lineLevelfiller(c.getKey(), c.getValue());
					}
					firstMap++;
					if(firstMap==a.size()) {
						continue;
					}
					else {
							driver.findElement(By.xpath("//div[@class='OBGridToolStripIcon']//img[contains(@src,'save.png')]")).click();
							driver.findElement(By.xpath("//td[@class='OBToolbarIconButton_icon_newRow OBToolbarIconButton']")).click();
							Thread.sleep(1000);
					}
				}
			}
			driver.findElement(By.xpath("//div[@class='OBGridToolStripIcon']//img[contains(@src,'save.png')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//td[contains(@class,'OBTabBarButtonMainTitle')])[2]")).click();
			Thread.sleep(1000);
			WebElement complete= driver.findElement(By.xpath("//div[text()='Complete']/span"));
			scrollTill(driver, complete);
			wait.until(ExpectedConditions.elementToBeClickable(complete));
			Thread.sleep(1000);
			complete.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//td[contains(@class,'OBToolbarIconButton_icon_save OBToolbarIconButton')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//td[contains(@class,'OBToolbarIconButton_icon_refresh OBToolbarIconButton')])[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//td[@class='OBToolbarIconButton_icon_newDoc OBToolbarIconButton'])[1]")).click();
			Thread.sleep(1000);
		}
		
	}
	
	static void scrollTill(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	static void filler(String xpath,String data) throws InterruptedException {
		driver.findElement(By.xpath(xpath)).sendKeys(data);
		Thread.sleep(1000);
		action.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(1000);
	}
	
	static void lineLevelfiller(String xpath,String data) throws InterruptedException {
		driver.findElement(By.xpath(xpath)).sendKeys(data);
		Thread.sleep(1000);
	}
	
	static void login(String username, String password, String screenName) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//td[text()='Log in']")).click();
		driver.findElement(By.xpath("//img[contains(@src,'QuickLaunch.png')]")).click();
		driver.findElement(By.xpath("//input[@name='value']")).sendKeys(screenName);
		String screenPath="//nobr[text()='"+screenName+"']";
		driver.findElement(By.xpath(screenPath)).click();
		driver.findElement(By.xpath("//td[@class='OBToolbarIconButton_icon_newDoc OBToolbarIconButton']")).click();
	}
	
	static List<List<Map<String, String>>> fetchData(String dataFilePath, String elementFilePath ) throws IOException {
		FileInputStream fisE = new FileInputStream(elementFilePath);	//reading element file
		Workbook workbookE = new XSSFWorkbook(fisE);
		Sheet sheetE = workbookE.getSheetAt(0);
		Row elementRow = sheetE.getRow(1);
		
		FileInputStream fisD = new FileInputStream(dataFilePath);		//reading data file
		Workbook workbookD = new XSSFWorkbook(fisD);
		Sheet sheetD = workbookD.getSheetAt(0);
		
		int colNo=sheetD.getRow(0).getPhysicalNumberOfCells();
		int rowNo=sheetD.getPhysicalNumberOfRows();
		int orderNOcolNo=0;
		for(int i=1;i<colNo;i++) {
			if(sheetD.getRow(0).getCell(i).toString().equalsIgnoreCase("orderNo")) {
				 orderNOcolNo=i;
			}
		}
		System.out.println(rowNo+" "+colNo);
		System.out.println(orderNOcolNo);
		List<List<Map<String, String>>> list = new ArrayList();
        List<Map<String, String>> subList = new ArrayList();
        Map<String, String> miniMap= new LinkedHashMap();
        boolean firstRow=true;
        for(int i =1;i<rowNo;i++) {
        	Row row =sheetD.getRow(i);
        	for(int j=1;j<colNo;j++) {
        		Cell cell = row.getCell(j);
        		if(cell.toString().isBlank()) {
        			continue;
        		}
        		else if(cell.getColumnIndex()==orderNOcolNo) {
        			subList.add(miniMap);
        			miniMap=new LinkedHashMap();
        		}
        		else if (cell.getColumnIndex()==1 && !cell.toString().isBlank()) {
					if(firstRow) {
						miniMap.put(elementRow.getCell(j).toString(),cell.toString());
						firstRow=false;
						continue;
					}
					else if(!miniMap.isEmpty()) {
						subList.add(miniMap);
						miniMap=new LinkedHashMap();
						miniMap.put(elementRow.getCell(j).toString(),cell.toString());
					}
					list.add(subList);
					subList = new ArrayList();
				}
        		else if(i==(rowNo-1)&& j==(colNo-1)) {
        			miniMap.put(elementRow.getCell(j).toString(),cell.toString());
        			subList.add(miniMap);
        			list.add(subList);
        		}
        		else {
        			miniMap.put(elementRow.getCell(j).toString(),cell.toString());
        		}
        	}
        }
        for(List<Map<String, String>> a:list) {
        	for(Map<String, String> b:a) {
        		System.out.print(b+" ");
        	}
        	System.out.println();
        }
        workbookE.close();
		workbookD.close();
		fisE.close();
		fisD.close();
        return list;
	}

}
