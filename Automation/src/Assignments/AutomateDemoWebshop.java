package Assignments;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateDemoWebshop {
	static String pwd = "Nitin@123";
	static Random r = new Random();

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		// click on register
		WebElement registerLink = driver.findElement(By.linkText("Register"));
		 Thread.sleep(2000);
		registerLink.click();
		// click on male
		WebElement maleRadioButton = driver.findElement(By.id("gender-male"));
		 Thread.sleep(2000);
		maleRadioButton.click();
		// enter the first name
		WebElement firstName = driver.findElement(By.id("FirstName"));
		 Thread.sleep(2000);
		firstName.sendKeys("Nitin");
		// enter the last name
		WebElement lastName = driver.findElement(By.id("LastName"));
		 Thread.sleep(2000);
		lastName.sendKeys("Sokhal");
		// enter the email

//		int no = r.nextInt(100);
//		String emailID = "rohankumar" + no + "@gmail.com";

		String emailID = "nitinsokhal@gmail.com";
		WebElement email = driver.findElement(By.id("Email"));
		 Thread.sleep(2000);
		email.sendKeys(emailID);
		// enter the password
		WebElement password = driver.findElement(By.id("Password"));
		 Thread.sleep(2000);
		password.sendKeys(pwd);
		// enter the confirm password
		WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
		 Thread.sleep(2000);
		confirmPassword.sendKeys(pwd);
		// click on register button
		WebElement regButton = driver.findElement(By.id("register-button"));
		 Thread.sleep(2000);
		regButton.click();

		 // close the browser
		// Thread.sleep(2000);
		// driver.quit();

	}

}
