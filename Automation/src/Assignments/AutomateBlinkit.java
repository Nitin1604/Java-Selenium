package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateBlinkit {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://blinkit.com/");
		driver.manage().window().maximize();
		
		WebElement popup = driver.findElement(By.xpath("//button['btn location-box mask-button']"));
		
		popup.click();
		
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.xpath("//a[contains(@class,'SearchBar__Button-sc-16lps2d-4 fgHDQx')]"));
		search.click();
		Thread.sleep(3000);
		
		WebElement searchTextField = driver.findElement(By.xpath("//input[@placeholder='Search for atta dal and more']"));
		searchTextField.sendKeys("vegetables");
		
		Thread.sleep(4000);
		
		WebElement bhindi = driver.findElement(By.xpath("//div[text()='Lady Finger (Bhindi)']/ancestor::div[contains(@class,'Product__UpdatedC')]/descendant::div[text()='ADD']"));
		bhindi.click();
		
       }

}
