package xpathTutorials;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathExample1 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		WebElement uiTestingClick = driver.findElement(By.xpath("//p[text()='UI Testing Concepts']"));
		Thread.sleep(2000);
		uiTestingClick.click();
		
		// Click on xpath tutorial
		WebElement xpathTutorial = driver.findElement(By.xpath("//section[text()='X Path']"));
		Thread.sleep(2000);
		xpathTutorial.click();
		
		// Entering text in the text input
		WebElement nameText = driver.findElement(By.id("name"));
		Thread.sleep(2000);
		nameText.sendKeys("Nitin Sokhal");
		
		// Entering text in the email id input
		WebElement emailID = driver.findElement(By.id("email"));
		Thread.sleep(2000);
		emailID.sendKeys("nitinsokhal@gmail.com");
		
		// Entering the text in the password input 
		WebElement passwordText = driver.findElement(By.id("password"));
		Thread.sleep(2000);
		passwordText.sendKeys("nitinsokhal321");
		
		// Click on eye icon 
		WebElement eyeIcon = driver.findElement(By.tagName("path"));
		Thread.sleep(2000);
		eyeIcon.click();
		
		// Clicking on Register button
		WebElement registerBtn = driver.findElement(By.xpath("//button[text()='Register']"));
		Thread.sleep(2000);
		registerBtn.click();
		
		driver.navigate().to("https://demoapps.qspiders.com/ui/login");
		
		// Entering text in the email id input
		WebElement emailIDText = driver.findElement(By.id("email"));
		Thread.sleep(2000);
		emailIDText.sendKeys("nitinsokhal@gmail.com");	
	
		// Entering the text in the password input 
		WebElement passwordTextField = driver.findElement(By.id("password"));
		Thread.sleep(2000);
		passwordTextField.sendKeys("nitinsokhal321");
		
		// Click on eye icon 
		WebElement eyeIconClick = driver.findElement(By.tagName("path"));
		Thread.sleep(2000);
		eyeIconClick.click();		
		
		// Click on Login button
		WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Login']"));
		Thread.sleep(2000);
		loginBtn.click();
		
		// Click on "Register now" link.
		WebElement registerNowLink = driver.findElement(By.className("hover:text-slate-700"));
		Thread.sleep(2000);
		registerNowLink.click();
		
		// Click on "Login now" link.
		WebElement loginNowLink = driver.findElement(By.className("hover:text-slate-700"));
		Thread.sleep(2000);
		loginNowLink.click();
		
		// Click on "Register now" link.
		WebElement registerNowLinkClick = driver.findElement(By.className("hover:text-slate-700"));
		Thread.sleep(2000);
		registerNowLinkClick.click();
				
			
	    Thread.sleep(4000);
		driver.quit();
	}
}
