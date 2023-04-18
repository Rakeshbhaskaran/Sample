package selenium;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.*;
	import java.awt.datatransfer.StringSelection;
	import java.awt.event.KeyEvent;

	public class FileUploadWithRobot {
	    public static void main(String[] args) throws AWTException {
	        // Set the path to the ChromeDriver executable
	        WebDriverManager.chromedriver().setup();

	        // Create a new instance of the ChromeDriver
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Navigate to the webpage that has the file input element
	        driver.get("https://www.ilovepdf.com/pdf_to_word");

	        // Locate the file input element and click it to open the file chooser dialog
	        WebElement fileInput = driver.findElement(By.id("pickfiles"));
	        fileInput.click();

	        // Use the Robot class to paste the file path into the file chooser dialog
	        Robot robot = new Robot();
	        StringSelection fileSelection = new StringSelection("C:\\Rakesh\\FireFlink\\PAPOC\\Dotvik\\Dotvik.pdf");
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileSelection, null);
	        robot.delay(1000);
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.delay(1000);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);

	        // Submit the file upload form
//	        WebElement submitButton = driver.findElement(By.id("submitButton"));
//	        submitButton.click();
//
//	       //  Quit the driver
//	        driver.quit();
	    }
	}



