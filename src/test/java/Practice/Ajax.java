
package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajax {

    public static void main(String[] args) {
        
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

      
        WebDriver driver = new ChromeDriver();
        

       
        driver.manage().timeouts().implicitlyWait(500, java.util.concurrent.TimeUnit.SECONDS); // Adjust the timeout as needed

        
        driver.get("https://webdriveruniversity.com/Ajax-Loader/index.html");

        
        WebElement button = driver.findElement(By.xpath("//span[@id='button1']")); // Replace with the actual XPath
        button.click();
       

        
        WebElement closeButton = driver.findElement(By.xpath("//button[contains(text(),'Close')]")); // Replace with the actual XPath
        closeButton.click();

        
        
    }
}
