
package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

    public static void main(String[] args) {
        // Set the path of your ChromeDriver executable
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        
        driver.get("https://webdriveruniversity.com/Scrolling/index.html");

        
        Scroll(driver, "//div[@id='zone1']");

        
       
    }

   
    private static void Scroll(WebDriver driver, String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        
        
        Actions actions = new Actions(driver);

        
        actions.moveToElement(element).perform();
    }
}
