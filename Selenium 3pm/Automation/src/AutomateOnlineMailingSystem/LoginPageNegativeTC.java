package AutomateOnlineMailingSystem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageNegativeTC {

	public static void main(String[] args) throws InterruptedException {

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost:8080/oms/");
			
			// Selecting the email text fields
			WebElement emailTextField = driver.findElement(By.tagName("input"));
			Thread.sleep(1000);
			emailTextField.sendKeys("kunal@gmail.com");
			
			// Selecting the password text fields
			WebElement passwordTextField = driver.findElement(By.name("pass"));
			Thread.sleep(2000);
			passwordTextField.sendKeys("321");
			
			// Login button was clicked
			WebElement loginBtn = driver.findElement(By.cssSelector("input.col-sm-push-3"));
			Thread.sleep(3000);
			loginBtn.click();
			
			Thread.sleep(2000);
			driver.quit();
	}

}
