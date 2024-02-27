package ManipalAxis.BGSS;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    //get URl
	    driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	    driver.manage().window().maximize();
	    
	    
	    Thread.sleep(5000);
	    
	    WebElement upload = driver.findElement(By.xpath("//input[@name='upload']"));
	    upload.sendKeys("C:\\Users\\vaibh\\OneDrive\\Pictures\\Screenshots\\Screenshot (87).png");
	    Thread.sleep(500);
	    WebElement download = driver.findElement(By.xpath("//input[@name='download']"));
	    download.click();
	    Thread.sleep(500);
	    
	    
	   File file=new File("");
	    if(file.exists()) {System.out.println("The file exists.");
	    }
	    else {
	    	System.out.println("The file does not exist");
	    }
	    

}}

