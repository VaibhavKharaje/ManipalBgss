
package Practice;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	public class buttonobj {
	    public static void main(String[] args) throws InterruptedException {
	       
	        
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	      
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        Thread.sleep(800);
	        driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
	        Thread.sleep(800);
	       WebElement ClickButton1 = driver.findElement(By.xpath("//*[@id=\"button1\"]"));
	        
	        ClickButton1.click();
	        Thread.sleep(800);
	        WebElement Close1 = driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button")); 
	        Close1.click();
	      
	        WebElement ClickButton2 = driver.findElement(By.xpath("//*[@id=\"button2\"]"));
	        
	        ClickButton2.click();
	        Thread.sleep(800);
	        WebElement Close2 = driver.findElement(By.xpath("//*[@id=\"myModalJSClick\"]/div/div/div[3]/button")); 
	        Close2.click();
	       
	        Thread.sleep(800);
	        WebElement ClickButton3 = driver.findElement(By.xpath("//*[@id=\"button3\"]"));
	        
	        ClickButton3.click();
	        Thread.sleep(800);
	        WebElement Close3 = driver.findElement(By.xpath("//*[@id=\"myModalMoveClick\"]/div/div/div[3]/button")); 
	        Close3.click();
	        
	        Thread.sleep(800);
}
}