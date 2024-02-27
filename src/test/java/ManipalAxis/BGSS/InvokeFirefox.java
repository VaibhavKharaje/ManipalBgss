package ManipalAxis.BGSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class InvokeFirefox {
	public static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException {
	  
	 System.setProperty("webdriver.Gecko.driver","C:\\Users\\vaibh\\Downloads\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://www.selenium.dev");
	  String title=driver.getTitle();
	  System.out.println(title);
	  Thread.sleep(2000);
	  
	  driver.quit();
	 }


}
