
package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class wait {

    public static void main(String[] args) {
        // Set the path of your ChromeDriver executable
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
			
				
				driver.get("https://webdriveruniversity.com/Ajax-Loader/index.html");
        
        WebElement button = driver.findElement(By.xpath("//p[contains(text(),'CLICK ME!')]")); // Replace with the actual XPath
        button.click();

        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        
       
    }
}
