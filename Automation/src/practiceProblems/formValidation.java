package practiceProblems;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class formValidation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		// Click on UI Testing 
		WebElement uiTestingClick = driver.findElement(By.xpath("//p[text()='UI Testing Concepts']"));
		Thread.sleep(2000);
		uiTestingClick.click();
		
		// Click on Form Validation Link from the left side
		WebElement formValidationClick = driver.findElement(By.xpath("//section[text()='FormValidation']"));
		Thread.sleep(2000);
		formValidationClick.click();
		
		// Fill the details in the first input of the form.
		WebElement requiredField = driver.findElement(By.name("requiredfield"));
		Thread.sleep(2000);
		requiredField.sendKeys("Automation Testing");
		
		// Fill the details in the second input of the form.
		WebElement password = driver.findElement(By.name("password"));
		Thread.sleep(2000);
		password.sendKeys("password_was_entered");
		
		// Fill the details in the third input of the form.
		WebElement confirmPassword = driver.findElement(By.name("confirmpass"));
		Thread.sleep(2000);
		confirmPassword.sendKeys("password_was_entered");
		
		// Fill the details in the fourth input of the form.
		WebElement email = driver.findElement(By.name("email"));
		Thread.sleep(2000);
		email.sendKeys("automationTesting@yahoo.com");
		
		// Fill the details in the fifth input of the form.
		WebElement urlToBeEntered = driver.findElement(By.name("url"));
		Thread.sleep(2000);
		urlToBeEntered.sendKeys("https://www.youtube.com");
		
		// Fill the details in the sixth input of the form.
		WebElement digitsToBeEntered = driver.findElement(By.name("digits"));
		Thread.sleep(2000);
		digitsToBeEntered.sendKeys("123456789");
		
		// Fill the details in the seventh input of the form.
		WebElement numbersToBeEntered = driver.findElement(By.name("number"));
		Thread.sleep(2000);
		numbersToBeEntered.sendKeys("987654321");
		
		// Fill the details in the eighth input of the form.
		WebElement alphaNum = driver.findElement(By.name("alphanum"));
		Thread.sleep(2000);
		alphaNum.sendKeys("abc123");
		
		// Fill the details in the nineth input of the form.
		WebElement minLength = driver.findElement(By.name("minLength"));
		Thread.sleep(2000);
		minLength.sendKeys("minSixCharToBeEnter");
		
		// Fill the details in the tenth input of the form.
		WebElement maxLength = driver.findElement(By.name("maxLength"));
		Thread.sleep(2000);
		maxLength.sendKeys("maxSix");
		
		// Fill the details in the eleventh input of the form.
		WebElement rangeLength = driver.findElement(By.name("rangeLength"));
		Thread.sleep(2000);
		rangeLength.sendKeys("rangeLen");
		
		// Fill the details in the tweleth input of the form.
		WebElement minVal = driver.findElement(By.name("minValue"));
		Thread.sleep(2000);
		minVal.sendKeys("7");
		
		// Fill the details in the thirteen input of the form.
		WebElement maxVal = driver.findElement(By.name("maxValue"));
		Thread.sleep(2000);
		maxVal.sendKeys("5");
		
		// Fill the details in the fourtheen input of the form.
		WebElement rangeValue = driver.findElement(By.name("rangeValue"));
		Thread.sleep(2000);
		rangeValue.sendKeys("50");
		
		// Click on submit button to submit the form.
		WebElement submitBtn = driver.findElement(By.xpath("//button[text()='Submit']"));
		Thread.sleep(2000);
		submitBtn.click();
		
		// Click on cancel button to cancel all the entered details.	
		WebElement cancelBtn = driver.findElement(By.xpath("//button[text()='Cancel']"));
		Thread.sleep(2000);
		cancelBtn.click();
			
		Thread.sleep(2000);
		driver.quit();
		

	}

}
