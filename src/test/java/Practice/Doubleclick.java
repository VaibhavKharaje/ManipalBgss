package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the webpage containing the radio buttons
        driver.get("https://webdriveruniversity.com/Actions/index.html");
        
        Thread.sleep(500);
        
        WebElement ele = driver.findElement(By.xpath("//h2[contains(text(),'Double Click Me!')]"));
		Actions builder = new Actions(driver);
	
		builder.doubleClick(ele).perform();
		
	

	}

}
