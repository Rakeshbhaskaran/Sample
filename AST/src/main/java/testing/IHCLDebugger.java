package testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IHCLDebugger {
	
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:\\\\Rakesh\\\\FireFlink\\\\chromeDebug1\\\\ff");
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		String url="https://etenderstage.nwdco.in/read_specification/54";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

}
