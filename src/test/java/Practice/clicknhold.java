package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clicknhold {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

       
        WebDriver driver = new ChromeDriver();

       
        driver.get("https://webdriveruniversity.com/Actions/index.html");
		
        WebElement elementToClickAndHold = driver.findElement(By.xpath("//div[@id='click-box']"));  // Replace with the actual ID of your element

	     
	        Actions actions = new Actions(driver);

	        
	        actions.clickAndHold(elementToClickAndHold).perform();

	        
	        
	        actions.release();
	        Thread.sleep(500);
	        actions.perform();
	        
	      

	}

}
