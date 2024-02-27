package Practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the webpage containing the radio buttons
        driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		
		
		  WebElement upload = driver.findElement(By.xpath("//input[@id='myFile']"));
		    upload.sendKeys("C:\\Users\\vaibh\\OneDrive\\Pictures\\Screenshots\\Screenshot (87).png");
		    Thread.sleep(500);
		    
		  WebElement submitButton = driver.findElement(By.xpath("//input[@id='submit-button']")); // Replace with the actual XPath
	       submitButton.click();

		    
		   
	}

}
