package ManipalAxis.BGSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    
		    //get URl
		    driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		    driver.manage().window().maximize();
		    
		    WebElement RadioBt1 = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		    Thread.sleep(700);
		    
		    if(RadioBt1.isDisplayed()) {
		    	RadioBt1.click();
		    }
	
	 WebElement RadioBt2 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	 Thread.sleep(700);
	    
	    
	    if(RadioBt2.isEnabled()) {
	    	RadioBt2.click();
	    }
}

}
