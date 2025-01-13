package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickingOnOption {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in/");
		
		
		Actions actionPerform = new Actions(driver);
		actionPerform.moveToElement(driver.findElement(By.xpath("//div[text()='EN']"))).perform();
		
		actionPerform.click(driver.findElement(By.className("icp-radio"))).perform();
		

	}

}
