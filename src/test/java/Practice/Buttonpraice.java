
package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class Buttonpraice {

    public static void main(String[] args) {
        // Set the path of your ChromeDriver executable
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the webpage
        driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");

        // Scenario 1: Click using WebElement.click() with XPath
        WebElement buttonXPath = driver.findElement(By.xpath("//p[contains(text(),'CLICK ME!')]")); // Replace with the actual XPath
        buttonXPath.click();

        // Scenario 2: Click using JavaScript click with XPath
        WebElement buttonJSXPath = driver.findElement(By.xpath("//span[@id='button2']")); // Replace with the actual XPath
        javascriptClick(driver, buttonJSXPath);

        // Scenario 3: Action Move & Click with XPath
        WebElement buttonMoveAndClickXPath = driver.findElement(By.xpath("//span[@id='button3']")); // Replace with the actual XPath
        actionMoveAndClick(driver, buttonMoveAndClickXPath);

        // Close the browser
        
    }

    // Method to perform a click using JavaScript
    private static void javascriptClick(WebDriver driver, WebElement element) {
        // Using JavaScript click
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    // Method to perform Action Move & Click
    private static void actionMoveAndClick(WebDriver driver, WebElement element) {
        // Using Actions class for Move & Click
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }
}
