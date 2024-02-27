package ManipalAxis.BGSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navcommand {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    
		    //get URl
		    driver.get("https://automationexercise.com/");
		    
		    driver.navigate().refresh();
		    Thread.sleep(100);

		    driver.navigate().forward();
		    Thread.sleep(100);
		    
		    driver.navigate().back();
		    Thread.sleep(100);
	}

}
