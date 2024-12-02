package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {
  public static void main(String[] args) {
	
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com");
	  
	  if(driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed())
		  System.out.println("Logo is displayed");
	  else 
		  System.out.println("Logo is not displayed");
	  
	  WebElement usernameTextField = driver.findElement(By.id("email"));
	  if(usernameTextField.isEnabled()) {
		  usernameTextField.sendKeys("nitinsokhal@gmail.com");
		  System.out.println("Text field is enabled");
	  }
	  else {
		  System.out.println("Text field is disabled");
	  }
  }
}
