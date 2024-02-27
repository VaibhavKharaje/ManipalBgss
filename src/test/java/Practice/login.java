package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		
		
		        // Set the path of your ChromeDriver executable
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		        // Create a new instance of the ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Open the login page
		        driver.get("https://webdriveruniversity.com/Login-Portal/index.html");

		        // Find the username and password input fields by their names (you should inspect the HTML to get the correct locators)
		       

		        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='text']"));
		        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
		        
		        // Enter your username and password
		        usernameInput.sendKeys("webdriver");
		        passwordInput.sendKeys("webdriver123");

		        // Find the lo
		        gin button and click it

		        
		        WebElement loginButton = driver.findElement(By.xpath("//button[@id='login-button']")); // replace "loginButton" with the actual id of your login button
		        loginButton.click();
		      
		        
		    }
		}

		

