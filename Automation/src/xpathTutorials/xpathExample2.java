package xpathTutorials;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathExample2 {

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
		
		// Click on Login 1.0 
		WebElement login1_0Click = driver.findElement(By.xpath("//section[text()='Login 1.0']"));
		Thread.sleep(3000);
		login1_0Click.click();
		
		// Entering the details in username input field
		WebElement username = driver.findElement(By.id("username"));
		Thread.sleep(3000);
		username.sendKeys("Nitin Sokhal");
		
		// Entering the details in password input field
		WebElement password = driver.findElement(By.id("password"));
		Thread.sleep(3000);
		password.sendKeys("nitinsokhal321");
		
		// Selecting the checkbox 
		WebElement checkbox = driver.findElement(By.id("chk1"));
		Thread.sleep(3000);
		checkbox.click();
		
		// Selecting the radio button
		WebElement radioBtn = driver.findElement(By.id("radio1"));
		Thread.sleep(3000);
		radioBtn.click();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
