package practiceSession;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeAndQuitWeb {

	public static void main(String[] args) throws InterruptedException {
		
	    // Opening any browser.
		WebDriver driver = new ChromeDriver();
		
		// Maximize the window.
		driver.manage().window().maximize();
		
		// Opening the website in the browser.
		driver.get("https://www.linkedin.com");
		
		// Clicking on "X" icon to close the pop up
	    WebElement closeSvg = driver.findElement(By.id("close-small"));
	    Thread.sleep(2000);
	    closeSvg.click();
	    
	    // Clicking on "Sign in with email" button
	    WebElement signBtn = driver.findElement(By.className("sign-in-form__sign-in-cta"));
	    Thread.sleep(2000);
	    signBtn.click();
	    
	    // Fill the details in the username
	    WebElement usernameTextField = driver.findElement(By.id("username"));
	    Thread.sleep(2000);
	    usernameTextField.sendKeys("nitinsokhal@gmail.com");
	    
	    // Fill the details in the password
	    WebElement passwordTextField = driver.findElement(By.id("password"));
	    Thread.sleep(2000);
	    passwordTextField.sendKeys("MyLinkedInAccount@2023");
	    
	    // Click on show toggle text
	    WebElement showToggle = driver.findElement(By.id("password-visibility-toggle"));
	    Thread.sleep(2000);
	    showToggle.click();
	    
	    // Click on Hide toggle text
	    WebElement hideToggle = driver.findElement(By.id("password-visibility-toggle"));
	    Thread.sleep(2000);
	    hideToggle.click();
	    
	    // Click on Sign in button
	    WebElement accountSignInBtn = driver.findElement(By.cssSelector("button.btn__primary--large"));
	    Thread.sleep(2000);
	    accountSignInBtn.click();
	    
	    // Close the browser
	    Thread.sleep(4000);
	    driver.quit();
	    
	}

}
