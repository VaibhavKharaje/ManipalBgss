package ManipalAxis.BGSS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsecommand {

	public static void main(String[] args) {
		
		
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    //get URl
	    driver.get("https://automationexercise.com/");
	    
	    //Title
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    //currenturl
	    String curl = driver.getCurrentUrl();
	    System.out.println(curl);
	    
	    // page source code
	    String page=driver.getPageSource();
	    System.out.println(page);
	    
	    //close current browser
	    //driver.close();
	    
	    
	}

}
