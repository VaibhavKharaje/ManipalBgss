package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the webpage containing the radio buttons
        driver.get("https://webdriveruniversity.com/Data-Table/index.html");
		
        
        List<WebElement> rowno = driver.findElements(By.xpath("//table[@id='t01']/tbody/tr"));

		int rowcount = rowno.size();
		System.out.println(rowcount);

		List<WebElement> colno = driver.findElements(By.xpath("//table[@id='t01']/tbody/tr[2]/td"));
		int colcount = colno.size();
		System.out.println(colcount);

		

		WebElement celldata = driver.findElement(By.xpath("//table[@id='t01']/tbody/tr[3]/td[2]"));
		String text = celldata.getText();
		System.out.println(text);
		String expectedText = "Jackson";

		if (text.equals(expectedText)) {
			System.out.println("Cell Data is correct");
		} else {
			System.out.println("Cell data is incorrect");
		}


	}

}
