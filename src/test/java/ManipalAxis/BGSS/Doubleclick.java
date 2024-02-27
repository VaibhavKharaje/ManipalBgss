package ManipalAxis.BGSS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
			
				
				driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
				
				driver.manage().window().maximize();
				Thread.sleep(500);
				
				WebElement ele = driver.findElement(By.xpath("//input[@id='double-click']"));
				Actions builder = new Actions(driver);
			
				builder.contextClick(ele);
				
				
				Thread.sleep(1000);
				
				builder.doubleClick(ele).perform();
				
				Thread.sleep(1000);
				Alert al= driver.switchTo().alert();
				al.accept();
				
				
				
				

	}

}
