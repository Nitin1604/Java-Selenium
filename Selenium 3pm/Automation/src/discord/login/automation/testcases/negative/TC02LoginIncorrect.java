package discord.login.automation.testcases.negative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC02LoginIncorrect {

public static void main(String[] args) throws Exception {
		
		// Initialize the webDriver 
		WebDriver driver = new ChromeDriver();
		
		// Maximize the window
		driver.manage().window().maximize();
		
		// Open the link
		driver.get("https://www.discord.com/login");
		
		// Passing the value of email by using id 
		WebElement emailCheckField = driver.findElement(By.id("uid_7"));
		emailCheckField.sendKeys("nitinsokha@gmail.com");
		
		// Passing the value of password by using name
		WebElement passwordCheckField = driver.findElement(By.name("password"));
		passwordCheckField.sendKeys("discord@2022");
		
		// Targetting the button by it's tagName
		WebElement loginButton = driver.findElement(By.cssSelector("button.marginBottom8_f7730b"));
		
		// Wait for 2 second pause before clicking the button
		Thread.sleep(2000);
		
		// Login button will be clicked after 2 seconds pause.
		loginButton.click();
		
		// Wait for 5 second pause before quitting the browser
		//Thread.sleep(5000);
		
		// Quit the browser 
		//driver.quit();
		
	}
}
