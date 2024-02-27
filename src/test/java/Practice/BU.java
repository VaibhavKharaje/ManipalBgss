
package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BU{

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

        // Scenario 2: Click using JavaScript click with CSS locator
        WebElement buttonCSS = driver.findElement(By.cssSelector("#button2")); // Replace with the actual CSS selector
        javascriptClick(driver, buttonCSS);

        // Scenario 3: Action Move & Click with a locator of your choice (here using XPath)
        WebElement buttonMoveAndClickXPath = driver.findElement(By.xpath("//span[@id='button3']")); // Replace with the actual XPath
        actionMoveAndClick(driver, buttonMoveAndClickXPath);

        // Close the browser
        
    }

    // Method to perform a click using JavaScript
    private static void javascriptClick(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    // Method to perform Action Move & Click
    private static void actionMoveAndClick(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }
}
