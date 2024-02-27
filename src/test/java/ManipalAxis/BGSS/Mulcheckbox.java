package ManipalAxis.BGSS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mulcheckbox {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    
		    //get URl
		    driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		    driver.manage().window().maximize();
		    
		    List <WebElement> allcheckbox = driver.findElements(By.xpath("//input[@class='cb1-element']"));
		    
		    Thread.sleep(700);
		    
		    for (WebElement wb :allcheckbox) {
		    	wb.click();
		    }

	}

}
