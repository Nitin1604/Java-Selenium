package IdBasedCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class idCode {

	public static void main(String[] args)throws Exception {
		
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://facebook.com");
	   
	   WebElement usernameTextField = driver.findElement(By.id("email"));
	   usernameTextField.sendKeys("NitinSokhal");
	   
	   WebElement passwordTextField = driver.findElement(By.id("pass"));
	   
	   Thread.sleep(2000);
       passwordTextField.sendKeys("nitinsokhal123");
	}
}
