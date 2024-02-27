package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutoon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the webpage containing the radio buttons
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        
        selectRadioButton(driver, "//input[@type='radio'][1]"); // Replace with actual XPath for Option1
        selectRadioButton(driver, "//input[@type='radio'][2]"); // Replace with actual XPath for Option2
        selectRadioButton(driver, "//input[@type='radio'][3]"); // Replace with actual XPath for Option3
        selectRadioButton(driver, "//input[@type='radio'][4]"); // Replace with actual XPath for Option4
        selectRadioButton(driver, "//input[@type='radio'][5]"); // Replace with actual XPath for Option5
      
     
    }

   
    private static void selectRadioButton(WebDriver driver, String xpath) {
        WebElement radioButton = driver.findElement(By.xpath(xpath));
        radioButton.click();
	}

}
