package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Edge {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.close();
	}

}
