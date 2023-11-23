package selenium;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takeScreenshot {
	
	public static void main(String[] args) throws IOException {
		
		takeScreenshot tsh= new takeScreenshot();//creating a obj to get className
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-HH:mm:ss");
		String date = ldt.format(formater);
		String classname= tsh.getClass().getName().toString();
		String dest="C:\\Users\\User\\git\\repository\\AST\\Screenshot\\"+date+"img1.png";
		System.out.println(dest);
		FileUtils.copyFile(file, new File(dest));
		
		
	}

}
