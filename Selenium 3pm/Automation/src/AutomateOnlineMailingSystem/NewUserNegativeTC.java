package AutomateOnlineMailingSystem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewUserNegativeTC {

	public static void main(String[] args) throws InterruptedException {
		
		// To open a chrome with the help of webDriver.
		WebDriver driver = new ChromeDriver();
		
		// To maximize the window after opening a window.
		driver.manage().window().maximize();
		
		// To redirect the url. 
		driver.get("http://localhost:8080/oms/NewUser.html");
		
		// Targetting the name label.
		WebElement name = driver.findElement(By.name("name"));
		Thread.sleep(2000);
		name.sendKeys("Nitin Sokhal");
		
		// Targetting the email label.
		WebElement emailID = driver.findElement(By.name("email"));
		Thread.sleep(2000);
		emailID.sendKeys("nitinsokhal@gmail.com");
		
		// Targetting the password label.
		WebElement password = driver.findElement(By.name("pass"));
		Thread.sleep(2000);
		password.sendKeys("123");
		
		// Targetting the phone label.
		WebElement phone = driver.findElement(By.name("phone"));
		Thread.sleep(2000);
		phone.sendKeys("1234567890");
		
		// Clicking on "Create New Account" button
		WebElement accountBtn = driver.findElement(By.className("col-sm-push-3"));
		Thread.sleep(2000);
		accountBtn.click();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		

	}

}
