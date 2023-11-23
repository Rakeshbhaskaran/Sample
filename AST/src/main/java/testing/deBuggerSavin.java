package testing;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class deBuggerSavin {
	public static void main(String[] args) throws Exception {
		String chromePath="C:\\Program Files\\Google\\Chrome\\Application";
		String locationToSaveCacheFiles="C:\\Users\\User\\Desktop\\SaveIn";
		String chromedriverpath="C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		WebDriver driver = BrowserInDeburger(chromePath, locationToSaveCacheFiles, chromedriverpath);
		driver.get("https://qa.bnpl.savein.money/");
		driver.manage().window().maximize();
		
	}
	public static WebDriver BrowserInDeburger(String chromePath, String locationToSaveCacheFiles,String chromedriverpath ) throws Exception {
		String dir = locationToSaveCacheFiles;
		String cmdCommand = "chrome.exe -remote-debugging-port=9292 --no-first-run --no-default-browser-check --user-data-dir="
				+ dir;
		Runtime.getRuntime().exec("cmd /c start cmd.exe /K " + cmdCommand, null, new File(chromePath));
		
		Thread.sleep(500);
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		// WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver",chromedriverpath);
//  		Connect to launched browser	
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("debuggerAddress", "localhost:9292");
		opt.addArguments("--disable notifications");
		opt.addArguments("--remote-allow-origins=*");
//  		
		WebDriver driver = new ChromeDriver(opt);
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
		Runtime.getRuntime().exec("taskkill /F /FI \"WINDOWTITLE eq Terminal\"");
		return driver;
	}
}
