package ManipalAxis.BGSS;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;

public class Takescreenshot {

	public static void main(String[] args) throws InterruptedException,IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    //get URl
	    driver.get("https://www.makemytrip.com");
	    driver.manage().window().maximize();
	    Thread.sleep(500);

	    File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(f, new File("C:\\Users\\vaibh\\OneDrive\\Pictures\\vk.png"));
	    System.out.println("The Screenshot is taken");
	    
	}

	

	

}
