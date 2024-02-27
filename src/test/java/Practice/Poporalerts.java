package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Poporalerts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

       
        driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
        
        WebElement coninfo = driver.findElement(By.xpath("//span[@id='button1']"));
	    coninfo.click();
	    Thread.sleep(500);
	    Alert alt =driver.switchTo().alert();
	    alt.accept();
	 // alt1.dismiss();
	    
	    WebElement confat = driver.findElement(By.xpath("//span[@id='button4']"));
	    confat.click();
	    Thread.sleep(500);
	    Alert alt1 =driver.switchTo().alert();
	    alt1.accept();
	   // alt1.dismiss();
	    
	    WebElement modal = driver.findElement(By.xpath("//span[@id='button2']"));
	    modal.click();
	    Thread.sleep(500);
	    //Alert alt2 =driver.switchTo().alert();
	    //alt2.accept();
	     //alt2.dismiss();
	    
	    

	}

}
