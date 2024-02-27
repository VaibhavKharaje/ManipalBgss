package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttonclickme {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the login page
        driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");

        // Use XPath to locate the button element
        WebElement buttonElement = driver.findElement(By.xpath("//p[contains(text(),'CLICK ME!')]"));

        Actions actions1 = new Actions(driver);

        // Move to the button to perform a mouse hover
        actions1.moveToElement(buttonElement).perform();

        // Click on the button after the mouse hover
        actions1.click().perform();
        buttonElement.click();

        // Close the browser
        
        WebElement buttonElement1 = driver.findElement(By.xpath("//span[@id='button3']")); // Replace with your actual locator

        // Create an instance of the Actions class
        Actions actions = new Actions(driver);

        // Move to the button to perform a mouse hover
        actions.moveToElement(buttonElement1).perform();

        // Click on the button after the mouse hover
        actions.click().perform();
    
	
		
		
		
		

	}

}
