package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownmenu {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
			
				
				driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
				
				driver.manage().window().maximize();
				WebElement dropdown = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/select[1]"));
				 
				Select sel = new Select(dropdown);
		 
				// select by visible text
		 
				sel.selectByVisibleText("SQL");
		 
				Thread.sleep(500);
		 
				// select by value
		 
				sel.selectByValue("c#");
		 
				// select by indexing
		 
				sel.selectByIndex(1);
				
				
			

	}

}
