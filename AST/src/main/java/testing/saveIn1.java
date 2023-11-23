package testing;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class saveIn1 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
//		String chromeExecutable = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
//        // Specify the remote debugging port and user data directory
//        String remoteDebuggingPort = "9222";
//        String userDataDirectory = "C:\\Users\\User\\Desktop\\SaveIn";
//
//        // Command to open Chrome with remote debugging enabled
//        String[] command = {chromeExecutable, "--remote-debugging-port=" + remoteDebuggingPort, "--user-data-dir=" + userDataDirectory};
//
//        // Set the working directory to the Chrome directory (optional)
////        File chromeDirectory = new File("C:\\Program Files\\Google\\Chrome\\Application");
//
//        ProcessBuilder processBuilder = new ProcessBuilder(command);
//        
//        // Set the working directory if needed
////        processBuilder.directory(chromeDirectory);
//        Process process = processBuilder.start();
//		
//		
//		
//		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("debuggerAddress", "localhost:" + remoteDebuggingPort);
//		options.addArguments("user-data-dir=C:\\Users\\User\\Desktop\\SaveIn");
//		options.addArguments("start-maximized");
//		options.setExperimentalOption("debuggerAddress", "localhost:8989");
//		options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://qa.bnpl.savein.money/");
		driver.findElement(By.xpath("//div[@class='loginMerchant screen1']//button[text()='Login']")).click();
		driver.findElement(By.xpath("//p[text()='Please enter your registered mobile number']/..//input[@id='first']")).sendKeys("7905950866");
		driver.findElement(By.xpath("//div[@class='ui-chkbox ui-widget']")).click();
////		Thread.sleep(3000);
////		WebElement next=driver.findElement(By.xpath("//button[@class='active-button m-b-5 ng-star-inserted']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
////		js.executeScript("arguments[0].click();", next);
		js.executeScript("document.querySelector('button').click();");
		driver.findElement(By.xpath("//input[contains(@id,'_0')]")).sendKeys("1");
		driver.findElement(By.xpath("//input[contains(@id,'_1')]")).sendKeys("2");
		driver.findElement(By.xpath("//input[contains(@id,'_2')]")).sendKeys("3");
		driver.findElement(By.xpath("//input[contains(@id,'_3')]")).sendKeys("4");
		Thread.sleep(10000);
//		js.executeScript("document.querySelector('div#ui-tabpanel-2').querySelector('button').click();");
		driver.findElement(By.xpath("//button[text()='Verify & Proceed']")).click();
		System.out.println("Element clicked 2");
	}

}
