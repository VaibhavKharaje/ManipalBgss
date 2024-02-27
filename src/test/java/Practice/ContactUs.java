
package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ContactUs {

    public static void main(String[] args) {
       
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        
        WebDriver driver = new ChromeDriver();

       
        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

        
        WebElement firstNameInput = driver.findElement(By.xpath("//input[@name='first_name']"));
        WebElement lastNameInput = driver.findElement(By.xpath("//input[@name='last_name']"));
        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement commentsInput = driver.findElement(By.xpath("//textarea[@name='message']"));
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        WebElement resetButton = driver.findElement(By.xpath("//input[@type='reset']"));

       
        firstNameInput.sendKeys("Vaibhav");
        lastNameInput.sendKeys("Kharaje");
        emailInput.sendKeys("vaibhavkharaje1212@gmail.com");
        commentsInput.sendKeys("This is a test comment");

       
        submitButton.click();

       
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        
        if (driver.getCurrentUrl().equals("https://webdriveruniversity.com/Contact-Us/contact-form-thank-you.html")) {
            System.out.println("Form submitted successfully!");
        } else {
            System.out.println("Form submission failed!");
        }

        resetButton.click();

    
        
    }
}
