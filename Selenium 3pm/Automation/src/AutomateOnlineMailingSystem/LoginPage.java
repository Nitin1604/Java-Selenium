package AutomateOnlineMailingSystem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/oms/");
		driver.manage().window().maximize();
		
		// Selecting the email text fields
		WebElement emailTextField = driver.findElement(By.tagName("input"));
		Thread.sleep(1000);
		emailTextField.sendKeys("nitinsokhal@gmail.com");
		
		// Selecting the password text fields
		WebElement passwordTextField = driver.findElement(By.name("pass"));
		Thread.sleep(2000);
		passwordTextField.sendKeys("123");
		
		// Login button was clicked
		WebElement loginBtn = driver.findElement(By.cssSelector("input.col-sm-push-3"));
		Thread.sleep(3000);
		loginBtn.click();
		
	}

}
