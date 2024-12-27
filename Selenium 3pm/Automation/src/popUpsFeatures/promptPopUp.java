package popUpsFeatures;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class promptPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");

		WebElement uiTestingClick = driver.findElement(By.xpath("//p[text()='UI Testing Concepts']"));
		Thread.sleep(2000);
		uiTestingClick.click();
		
		WebElement popUpClick = driver.findElement(By.xpath("//section[text()='Popups']"));
		Thread.sleep(2000);
		popUpClick.click();
		
		WebElement jsClick = driver.findElement(By.xpath("//section[text()='Javascript']"));
		Thread.sleep(2000);
		jsClick.click();
		
		WebElement promptClick = driver.findElement(By.xpath("//a[text()='Prompt']"));
		promptClick.click();
		
		WebElement promptBtn = driver.findElement(By.xpath("//button[text()='Prompt Alert Box']"));
		Thread.sleep(2000);
		promptBtn.click();
		
		Alert alertClick = driver.switchTo().alert();
		Thread.sleep(2000);
		alertClick.sendKeys("yes");
		
		System.out.println(alertClick.getText());
		Thread.sleep(2000);
		alertClick.accept();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
