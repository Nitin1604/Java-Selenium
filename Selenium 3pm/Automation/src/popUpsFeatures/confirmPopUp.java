package popUpsFeatures;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		// Click on UI Testing 
		WebElement uiTestingClick = driver.findElement(By.xpath("//p[text()='UI Testing Concepts']"));
		Thread.sleep(2000);
		uiTestingClick.click();
		
		WebElement popUpClick = driver.findElement(By.xpath("//section[text()='Popups']"));
		Thread.sleep(2000);
		popUpClick.click();
		
		WebElement jsClick = driver.findElement(By.xpath("//section[text()='Javascript']"));
		Thread.sleep(2000);
		jsClick.click();
		
		WebElement confirmClickFromRight = driver.findElement(By.xpath("//a[text()='Confirm']"));
		Thread.sleep(2000);
		confirmClickFromRight.click();
		
		WebElement confirmBtn = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		Thread.sleep(2000);
		confirmBtn.click();
		
		Alert alertClick = driver.switchTo().alert();
		Thread.sleep(2000);
		alertClick.accept();
		
		Thread.sleep(2000);
		alertClick.dismiss();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
