package AutomateOnlineMailingSystem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewUser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://localhost:8080/oms/NewUser.html");
		driver.manage().window().maximize();
		
		// Filling details in the name text field
     	WebElement nameTextField = driver.findElement(By.name("name"));
		Thread.sleep(2000);
		nameTextField.sendKeys("Rohan Singh");
		
		// Filling details in the email text field
		WebElement emailTextField = driver.findElement(By.name("email"));
		Thread.sleep(2000);
		emailTextField.sendKeys("rohansingh@gmail.com");
		
		// Filling the details in the password text field
		WebElement passwordTextField = driver.findElement(By.name("pass"));
		Thread.sleep(2000);
		passwordTextField.sendKeys("654321");
		
		// Filling the details in the phone input text field
		WebElement phoneTextField = driver.findElement(By.name("phone"));
		Thread.sleep(2000);
		phoneTextField.sendKeys("123456789");
		
		// Clicking on "Create New Account" button to create an account
		WebElement accountBtn = driver.findElement(By.className("col-sm-push-3"));
		Thread.sleep(2000);
		accountBtn.click();
		
		Thread.sleep(3000);
		driver.navigate().to("http://localhost:8080/oms/index.html");
		
		// Selecting the email text fields
		WebElement emailField = driver.findElement(By.tagName("input"));
		Thread.sleep(1000);
		emailField.sendKeys("rohansingh@gmail.com");
				
		// Selecting the password text fields
		WebElement passwordField = driver.findElement(By.name("pass"));
		Thread.sleep(2000);
		passwordField.sendKeys("654321");
				
		// Login button was clicked
		WebElement loginBtn = driver.findElement(By.cssSelector("input.col-sm-push-3"));
		Thread.sleep(3000);
		loginBtn.click();
		
		// Selecting the email text fields for the second time
		WebElement emailField2 = driver.findElement(By.tagName("input"));
		Thread.sleep(1000);
		emailField2.sendKeys("rohansingh@gmail.com");
				
		// Selecting the password text fields for the second time
		WebElement passwordField2 = driver.findElement(By.name("pass"));
		Thread.sleep(2000);
		passwordField2.sendKeys("654321");
				
		// Login button was clicked for the second time
		WebElement loginBtn2 = driver.findElement(By.cssSelector("input.col-sm-push-3"));
		Thread.sleep(3000);
		loginBtn2.click();		
		
		// After clicking login Button, dashboard is accessible
		WebElement composeTab = driver.findElement(By.className("grid"));
		Thread.sleep(4000);
		composeTab.click();
		
		// Writing email id in the To field
		WebElement ToField = driver.findElement(By.name("to1"));
		Thread.sleep(3000);
		ToField.sendKeys("nitinsokhal@gmail.com");
		
		// Writing subject in the Subject field
		WebElement subjectField = driver.findElement(By.name("subject"));
		Thread.sleep(3000);
		subjectField.sendKeys("Application for one day leave from office.");
		
		// Writing message in the "Message" text area
		WebElement messageTextarea = driver.findElement(By.name("message"));
		Thread.sleep(3000);
		messageTextarea.sendKeys("Hi, i want one day leave from the office due to some urgent work.");
		
		// Clicking on send button 
		driver.findElement(By.className("col-sm-push-2")).click();
		Thread.sleep(2000);
		driver.navigate().to("http://localhost:8080/oms/sent.jsp");
		
		// To view mail , click on message icon 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='read']")).click();
		
		// To go back , click on back button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='back']")).click();
	
	}

}
