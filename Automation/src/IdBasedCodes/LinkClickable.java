package IdBasedCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkClickable {

	public static void main(String[] args)throws Exception {
          
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		WebElement usernameTextField = driver.findElement(By.id("email"));
		usernameTextField.sendKeys("NitinSokhal");

		WebElement passwordTextField = driver.findElement(By.id("pass"));
		passwordTextField.sendKeys("nitinsokhal123");
		
		WebElement loginButtonClick = driver.findElement(By.name("login"));
		
		Thread.sleep(3000);
		loginButtonClick.click();
	}

}
