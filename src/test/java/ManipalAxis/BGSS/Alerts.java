package ManipalAxis.BGSS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    //get URl
	    driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	    driver.manage().window().maximize();
	    
	    
	    Thread.sleep(5000);
	  
	    
	    WebElement coninfo = driver.findElement(By.xpath("//input[@name='alert']"));
	    coninfo.click();
	    Thread.sleep(500);
	    Alert alt =driver.switchTo().alert();
	    alt.accept();
	 // alt1.dismiss();
	    
	    //confirmational
	    
	    WebElement confat = driver.findElement(By.xpath("//input[@name='confirmation']"));
	    confat.click();
	    Thread.sleep(500);
	    Alert alt1 =driver.switchTo().alert();
	    alt1.accept();
	   // alt1.dismiss();
	    
	    //prompt
	    WebElement promt = driver.findElement(By.xpath("//input[@name='prompt']"));
	    promt.click();
	    Thread.sleep(500);
	    Alert alt2 =driver.switchTo().alert();
	    alt2.sendKeys("Vaibhav");
	    alt2.accept()
;	    //alt2.dismiss();
	    
	    
	}

}
