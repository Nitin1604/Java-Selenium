package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ksrtcWebsite {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.ksrtc.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Select Departure City']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Select Departure City']/ancestor::a/following-sibling::div/descendant::input")).sendKeys("adoni",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Select Destination City']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Select Destination City']/ancestor::a/following-sibling::div/descendant::input")).sendKeys("Bangalore",Keys.ENTER);
		
		Thread.sleep(2000);
		driver.quit();
	}
}
