package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the webpage containing the radio buttons
        driver.get("https://webdriveruniversity.com/Datepicker/index.html");
		
		
		WebElement Date = driver.findElement(By.xpath("//div[@id='datepicker']"));
	    Date.click();
	    Thread.sleep(1000);
	    WebElement newDate = driver.findElement(By.xpath("//td[contains(text(),'24')]"));
	    newDate.click();

	}

}
